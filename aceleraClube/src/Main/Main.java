package Main;

import packageimg.telaLogin;

/**
 * Classe principal que inicia a aplicação.
 * 
 * @author Lucas
 */
public class Main {
    
    /**
     * Método principal que inicia a aplicação, exibindo a tela de login.
     *
     * @param args Os argumentos da linha de comando (não são utilizados neste caso).
     */
    public static void main(String[] args)
    {
        // Cria uma instância da tela de login
        telaLogin logar = new telaLogin();
        
        // Torna a tela de login visível
        logar.setVisible(true);
    }
    
}
