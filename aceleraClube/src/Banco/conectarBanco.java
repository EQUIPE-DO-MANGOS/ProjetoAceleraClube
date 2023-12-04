package Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * A classe <code>conectarBanco</code> é responsável por estabelecer e fornecer conexões com o banco de dados MySQL.
 * Utiliza o padrão Singleton para garantir uma única instância da conexão durante a execução do programa.
 *
 * @author Lucas
 */
public class conectarBanco {

    /**
     * Objeto de conexão com o banco de dados.
     */
    Connection con = null;

    /**
     * Instância única da classe conectarBanco.
     */
    private static conectarBanco instance = null;

    /**
     * Construtor privado para garantir que a classe seja instanciada apenas uma vez.
     */
    private conectarBanco() {
        try {
            // Carrega o driver JDBC do MySQL.
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao conectar.");
        }
    }

    /**
     * Obtém a instância única da classe conectarBanco (Singleton).
     *
     * @return A instância única da classe conectarBanco.
     */
    public static conectarBanco getInstance() {
        if (instance == null) {
            instance = new conectarBanco();
        }
        return instance;
    }

    /**
     * Obtém a conexão com o banco de dados.
     *
     * @return A conexão com o banco de dados.
     */
    public Connection getConnection() {
        try {
            // Se a conexão ainda não foi estabelecida ou está fechada, cria uma nova conexão.
            if ((con == null) || (con.isClosed())) {
                con = DriverManager.getConnection("jdbc:mysql://localhost:/acelera", "root", "");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }

    /**
     * Fecha a conexão com o banco de dados.
     */
    public void destroy() {
        try {
            // Fecha a conexão se estiver aberta.
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
