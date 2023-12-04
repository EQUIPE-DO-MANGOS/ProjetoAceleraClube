package Dados;

/**
 * Classe que representa as informações de login, incluindo usuário e senha.
 *
 * @author Matheus
 */
public class Login {
    private String Usuario;
    private String Senha;

    /**
     * Construtor padrão que inicializa os campos como nulos.
     */
    public Login() {
        this.Usuario = null;
        this.Senha = null;
    }

    /**
     * Construtor que recebe informações de usuário e senha.
     *
     * @param Usuario O nome de usuário.
     * @param Senha   A senha associada ao usuário.
     */
    public Login(String Usuario, String Senha) {
        this.Usuario = Usuario;
        this.Senha = Senha;
    }

    /**
     * Obtém o nome de usuário.
     *
     * @return O nome de usuário.
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     * Define o nome de usuário.
     *
     * @param Usuario O nome de usuário.
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    /**
     * Obtém a senha associada ao usuário.
     *
     * @return A senha associada ao usuário.
     */
    public String getSenha() {
        return Senha;
    }

    /**
     * Define a senha associada ao usuário.
     *
     * @param Senha A senha associada ao usuário.
     */
    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
}
