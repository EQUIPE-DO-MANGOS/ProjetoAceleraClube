package Banco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Dados.Associados;


public class associadosBanco {
    
    Connection connection = null;

    public boolean inserirAssociado(Associados associados)
    
        {
        System.out.println("Inserir Associado");
       
        connection = conectarBanco.getInstance().getConnection();
        
        System.out.println("Conectado e pronto para inserir");
        Statement stmt = null;
        
        try 
        {
            stmt = connection.createStatement();

            String sql = "INSERT INTO dados(Nome,Endereco,Telefone,Email,CPF,CEP,Nascimento,Cidade) "
            		   + "VALUES ('"+ associados.getNome() + "','" + associados.getEndereco() + "', '" 
            		   + associados.getTelefone() + "', '" + associados.getEmail() + "','" + associados.getCPF() + "','" + associados.getCEP() + "','" + associados.getNascimento() + "','" + associados.getCidade() + "')";
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
           
            return true;
        }
        
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return false;
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
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    } 


public boolean atualizarAssociado(Associados associados, String nomeAlterar) 
    {
        System.out.println("Atualizar Pessoa");
        
        connection = conectarBanco.getInstance().getConnection();
        System.out.println("Conectado e pronto para atualizar");
        Statement stmt = null;
        
        try
        {
            stmt = connection.createStatement();
            
            String sql = "UPDATE dados SET nome='"+associados.getNome()+"'," +
                         "endereco='"+associados.getEndereco()+"', telefone='"+associados.getTelefone()+"'," +
                         "email='"+associados.getEmail()+"', cpf='"+associados.getCPF()+"'," +
                         "cep='"+associados.getCEP()+"', nascimento='"+associados.getNascimento()+"',"+
                         "cidade='"+associados.getCidade()+"' WHERE nome='"+nomeAlterar+"';";
                    
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
            
            return true;
        }
           catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return false;
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
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    }
        
        
    
    
}
