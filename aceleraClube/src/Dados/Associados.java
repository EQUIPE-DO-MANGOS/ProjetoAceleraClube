package Dados;


public class Associados
{
    private String Nome;
    private String Endereco;
    private String Telefone;
    private String Email;
    private String CPF;
    private String CEP;
    private String Nascimento;
    private String Cidade;
    
    

    public Associados() 
    {
        this.Nome=null;
        this.Endereco=null;
        this.Telefone=null;
        this.Email=null; 
        this.CPF=null;
        this.CEP=null;
        this.Nascimento=null;
        this.Cidade=null;
    }

    public Associados(String Nome, String Endereco, String Telefone, String Email, String CPF, String CEP, String Nascimento, String Cidade)
    {
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.Email = Email;
        this.CPF= CPF;
        this.CEP= CEP;
        this.Nascimento= Nascimento;
        this.Cidade= Cidade;
    }

    public String getNome()
    {
        return Nome;
    }

    public void setNome(String Nome)
    {
        this.Nome = Nome;
    }

    public String getEndereco()
    {
        return Endereco;
    }
    
    public void setEndereco(String Endereco)
    {
        this.Endereco = Endereco;
    }
    
    public String getTelefone()
    {
        return Telefone;
    }

    public void setTelefone(String Telefone)
    {
        this.Telefone = Telefone;
    } 
    
    
    public String getCPF()
    {
        return CPF;
    }

    public void setEmail(String CPF)
    {
        this.CPF = CPF;
    } 
    
    public String getCEP()
    {
        return CEP;
    }

    public void setCEP(String CEP)
    {
        this.CEP = CEP;
    } 
    
    public String getNascimento()
    {
        return Nascimento;
    }

    public void setNascimento(String Nascimento)
    {
        this.Nascimento = Nascimento;
    } 
    
    public String getCidade()
    {
        return Cidade;
    }

    public void setCidade(String Cidade)
    {
        this.Cidade = Cidade;
    } 
}

