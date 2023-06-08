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


public boolean atualizarAssociado(Associados associados, String CPFAlterar) 
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
                         "cidade='"+associados.getCidade()+"' WHERE nome='"+CPFAlterar+"';";
                    
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

 public String relatorioPessoas()
    {
    	String dados = "";
    	
    	connection = conectarBanco.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        Statement stmt = null;
        
        try
        {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM dados");
            
            while (res.next())
            {
            	dados += "\n"+res.getString("Nome");
				dados += "\n"+res.getString("Endereco");
				dados += "\n"+res.getString("Telefone");
				dados += "\n"+res.getString("Email");
                                dados += "\n"+res.getString("CPF");
                                dados += "\n"+res.getString("CEP");
                                dados += "\n"+res.getString("Nascimento");
                                dados += "\n"+res.getString("Cidade");
				dados += "\n-----------------------------------------";				
            }
            
             } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
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
    	
    	return dados;
    }
 
 public ArrayList<Associados> getListadosAssociados() 
    {
        ArrayList<Associados> listaAssociados = new ArrayList<Associados>();
      
        connection = conectarBanco.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        Statement stmt = null;
        
        try
        {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM dados");
            
            while (res.next())
            {
                Associados associados = new Associados(res.getString("Nome"), res.getString("Endereco"), 
                		                   res.getString("Telefone"),res.getString("Email"),
                                                   res.getString("CPF"),res.getString("CEP"),
                                                   res.getString("Nascimento"),res.getString("Cidade"));
                listaAssociados.add(associados);
            }
            
        } 
        
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
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
        return listaAssociados;
    } 
 
    public boolean excluirAssociado(Associados associados) 
        {
    	boolean status = true;
    	
        System.out.println("Excluir Associado");
        
        connection = conectarBanco.getInstance().getConnection();
        System.out.println("Conectado e pronto para excluir");
        Statement stmt = null;
        
        try 
        {
            stmt = connection.createStatement();
            
            String sql = "DELETE FROM dados WHERE CPF='"+associados.getCPF()+"'";
            
            System.out.println("SQL: " + sql);
            
            if(stmt.executeUpdate(sql)!=0)
            {
            	status = true;	
            }
            else
            {
            	status = false;
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
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
        return status;
    }

        
        
    
    
}
