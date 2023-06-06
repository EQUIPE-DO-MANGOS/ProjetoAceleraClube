package Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conectarBanco {
    
    Connection con = null;
    private static conectarBanco instance = null;
    
    public conectarBanco ()
            {
    	try 
    	{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } 
    	catch (ClassNotFoundException e) 
    	{
            System.out.println("Erro ao conectar.");
        }
    }
    
    public static conectarBanco getInstance() 
    {
        if (instance == null) 
        {
            instance = new conectarBanco();
        }
        return instance;
    }
    
    public Connection getConnection() 
    {
        try 
        {
            if ((con == null) || (con.isClosed())) 
            {
                con = DriverManager.getConnection("jdbc:mysql://localhost:/acelera", "root", "");
            }
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return con;
    }
    
    public void destroy() 
    {
        try 
        {
            con.close();
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }


    
}
