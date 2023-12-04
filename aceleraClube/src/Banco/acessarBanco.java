package Banco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Dados.Login;

/**
 * A classe <code>acessarBanco</code> é responsável por realizar operações de acesso ao banco de dados.
 *
 * @author Lucas
 */
public class acessarBanco {

    /**
     * Conexão com o banco de dados.
     */
    Connection connection = null;

    /**
     * Verifica se as credenciais de login fornecidas são válidas.
     *
     * @param login Objeto contendo as informações de login (usuário e senha).
     * @return true se as credenciais são válidas, false caso contrário.
     */
    public boolean verificaAcesso(Login login) {

        // Obtém uma instância da conexão com o banco de dados.
        connection = conectarBanco.getInstance().getConnection();
        Statement stmt = null;

        // Status de autenticação, inicializado como verdadeiro.
        boolean status = true;

        try {
            // Criação do objeto Statement para executar consultas SQL.
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM login");

            // Itera sobre os resultados da consulta.
            while (res.next()) {
                // Compara as credenciais com as do banco de dados.
                if (login.getUsuario().compareTo(res.getString("Usuario")) == 0 &&
                    login.getSenha().compareTo(res.getString("Senha")) == 0) {
                    status = true;
                } else {
                    status = false;
                }
            }

        } catch (SQLException e) {
            // Em caso de exceção, imprime a mensagem de erro.
            System.out.println(e.getMessage());
            status = false;
        } finally {
            // Garante o fechamento do Statement e da conexão, mesmo em caso de exceção.
            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                // Ignora exceções durante o fechamento.
            }
        }

        // Retorna o status da autenticação.
        return status;
    }
}
