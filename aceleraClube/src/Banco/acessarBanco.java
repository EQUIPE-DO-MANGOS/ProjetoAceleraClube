package Banco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Dados.Login;

public class acessarBanco {
    
    Connection connection = null;
    

    public boolean verificaAcesso(Login login)
    {
    	
    	connection = conectarBanco.getInstance().getConnection();
        Statement stmt = null;
        
        boolean status = true;
        
        try
        {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM login");
            
            while(res.next())
			{
			   if(login.getUsuario().compareTo(res.getString("Usuario"))==0 && login.getSenha().compareTo(res.getString("Senha"))==0)
			   {
				   status = true;
				   
			   }
			   else
			   {
				   status = false;
			   }
			   
			}
            
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            status = false;
        }
        finally
        {
          
            try
            {
                stmt.close();
                connection.close();
            }
            catch (SQLException e)
            {
            }
        }
    	
        return status;
    }
    
    
}