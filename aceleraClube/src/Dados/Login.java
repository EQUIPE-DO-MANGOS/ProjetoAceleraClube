package Dados;

public class Login
{
    private String Usuario;
    private String Senha;
   

    public Login() 
    {
        this.Usuario=null;
        this.Senha=null;
          
    }

    public Login(String Usuario, String Senha)
    {
        this.Usuario = Usuario;
        this.Senha = Senha;
         
    }

    public String getUsuario()
    {
        return Usuario;
    }

    public void setUsuario(String Usuario)
    {
        this.Usuario = Usuario;
    }

    public String getSenha()
    {
        return Senha;
    }
    
    public void setSenha(String Senha)
    {
        this.Senha = Senha;
    }
    
}