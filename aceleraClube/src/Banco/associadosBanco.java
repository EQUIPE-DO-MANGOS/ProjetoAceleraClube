package Banco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Dados.Associados;

/**
 * A classe <code>associadosBanco</code> é responsável por realizar operações relacionadas aos associados no banco de dados.
 * Utiliza uma instância da classe <code>conectarBanco</code> para obter conexão com o banco de dados.
 *
 * @author Lucas
 */
public class associadosBanco {

    /**
     * Conexão com o banco de dados.
     */
    Connection connection = null;

    /**
     * Insere um novo associado no banco de dados.
     *
     * @param associados Objeto contendo as informações do associado a ser inserido.
     * @return true se a inserção foi bem-sucedida, false caso contrário.
     */
    public boolean inserirAssociado(Associados associados) {
        System.out.println("Inserir Associado");

        connection = conectarBanco.getInstance().getConnection();

        System.out.println("Conectado e pronto para inserir");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();

            String sql = "INSERT INTO associados(Nome,Endereco,Telefone,Email,CPF,CEP,Nascimento,Cidade) "
                    + "VALUES ('" + associados.getNome() + "','" + associados.getEndereco() + "', '"
                    + associados.getTelefone() + "', '" + associados.getEmail() + "','" + associados.getCPF() + "','"
                    + associados.getCEP() + "','" + associados.getNascimento() + "','" + associados.getCidade() + "')";
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);

            return true;
        }

        catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    }

    /**
     * Atualiza as informações de um associado no banco de dados.
     *
     * @param associados  Objeto contendo as novas informações do associado.
     * @param CPFAlterar  CPF do associado a ser atualizado.
     * @return true se a atualização foi bem-sucedida, false caso contrário.
     */
    public boolean atualizarAssociado(Associados associados, String CPFAlterar) {
        System.out.println("Atualizar Associado");

        connection = conectarBanco.getInstance().getConnection();
        System.out.println("Conectado e pronto para atualizar");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();

            String sql = "UPDATE associados SET cpf='" + associados.getCPF() + "'," + "endereco='"
                    + associados.getEndereco() + "', telefone='" + associados.getTelefone() + "'," + "email='"
                    + associados.getEmail() + "', nome='" + associados.getNome() + "'," + "cep='"
                    + associados.getCEP() + "', nascimento='" + associados.getNascimento() + "'," + "cidade='"
                    + associados.getCidade() + "' WHERE cpf='" + CPFAlterar + "';";

            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);

            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {

            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    }

    /**
     * Gera um relatório com as informações de todos os associados no banco de dados.
     *
     * @return Uma string contendo o relatório de associados.
     */
    public String relatorioPessoas() {
        String dados = "";

        connection = conectarBanco.getInstance().getConnection();
        System.out.println("Conectado e preparando a lista dos socios");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM associados");

            while (res.next()) {
                dados += "\n" + res.getString("Nome");
                dados += "\n" + res.getString("Endereco");
                dados += "\n" + res.getString("Telefone");
                dados += "\n" + res.getString("Email");
                dados += "\n" + res.getString("CPF");
                dados += "\n" + res.getString("CEP");
                dados += "\n" + res.getString("Nascimento");
                dados += "\n" + res.getString("Cidade");
                dados += "\n-----------------------------------------";
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {

            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }

        return dados;
    }

    /**
     * Obtém uma lista de todos os associados no banco de dados.
     *
     * @return Uma lista de objetos Associados.
     */
    public ArrayList<Associados> getListadosAssociados() {
        ArrayList<Associados> listaAssociados = new ArrayList<Associados>();

        connection = conectarBanco.getInstance().getConnection();
        System.out.println("Conectado e preparando a lista dos socios");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM associados");

            while (res.next()) {
                Associados associados = new Associados(res.getString("Nome"), res.getString("Endereco"),
                        res.getString("Telefone"), res.getString("Email"), res.getString("CPF"), res.getString("CEP"),
                        res.getString("Nascimento"), res.getString("Cidade"));
                listaAssociados.add(associados);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {

            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }

        return listaAssociados;
    }

    /**
     * Exclui um associado do banco de dados com base no CPF.
     *
     * @param associados Objeto associado contendo o CPF a ser excluído.
     * @return true se a exclusão foi bem-sucedida, false caso contrário.
     */
    public boolean excluirAssociado(Associados associados) {
        boolean status = true;

        System.out.println("Excluir Associado");

        connection = conectarBanco.getInstance().getConnection();
        System.out.println("Conectado e pronto para excluir");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();

            String sql = "DELETE FROM associados WHERE CPF='" + associados.getCPF() + "'";

            System.out.println("SQL: " + sql);

            if (stmt.executeUpdate(sql) != 0) {
                status = true;
            } else {
                status = false;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            status = false;
        } finally {

            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }

        return status;
    }
}