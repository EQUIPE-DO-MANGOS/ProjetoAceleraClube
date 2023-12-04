package Dados;

/**
 * Classe que representa um associado com informações pessoais.
 *
 * @author Lucas
 */
public class Associados {
    private String Nome;
    private String Endereco;
    private String Telefone;
    private String Email;
    private String CPF;
    private String CEP;
    private String Nascimento;
    private String Cidade;

    /**
     * Construtor padrão que inicializa todos os campos como nulos.
     */
    public Associados() {
        this.Nome = null;
        this.Endereco = null;
        this.Telefone = null;
        this.Email = null;
        this.CPF = null;
        this.CEP = null;
        this.Nascimento = null;
        this.Cidade = null;
    }

    /**
     * Construtor que recebe informações do associado.
     *
     * @param Nome       Nome do associado.
     * @param Endereco   Endereço do associado.
     * @param Telefone   Número de telefone do associado.
     * @param Email      Endereço de e-mail do associado.
     * @param CPF        Número do CPF do associado.
     * @param CEP        Código de Endereçamento Postal do associado.
     * @param Nascimento Data de nascimento do associado.
     * @param Cidade     Cidade do associado.
     */
    public Associados(String Nome, String Endereco, String Telefone, String Email, String CPF, String CEP,
                      String Nascimento, String Cidade) {
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.Email = Email;
        this.CPF = CPF;
        this.CEP = CEP;
        this.Nascimento = Nascimento;
        this.Cidade = Cidade;
    }

    // Métodos de acesso (getters e setters) para os atributos da classe

    /**
     * Obtém o nome do associado.
     *
     * @return O nome do associado.
     */
    public String getNome() {
        return Nome;
    }

    /**
     * Define o nome do associado.
     *
     * @param Nome O nome do associado.
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * Obtém o endereço do associado.
     *
     * @return O endereço do associado.
     */
    public String getEndereco() {
        return Endereco;
    }

    /**
     * Define o endereço do associado.
     *
     * @param Endereco O endereço do associado.
     */
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    /**
     * Obtém o número de telefone do associado.
     *
     * @return O número de telefone do associado.
     */
    public String getTelefone() {
        return Telefone;
    }

    /**
     * Define o número de telefone do associado.
     *
     * @param Telefone O número de telefone do associado.
     */
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    /**
     * Obtém o endereço de e-mail do associado.
     *
     * @return O endereço de e-mail do associado.
     */
    public String getEmail() {
        return Email;
    }

    /**
     * Define o endereço de e-mail do associado.
     *
     * @param Email O endereço de e-mail do associado.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Obtém o número do CPF do associado.
     *
     * @return O número do CPF do associado.
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * Define o número do CPF do associado.
     *
     * @param CPF O número do CPF do associado.
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * Obtém o CEP do associado.
     *
     * @return O CEP do associado.
     */
    public String getCEP() {
        return CEP;
    }

    /**
     * Define o CEP do associado.
     *
     * @param CEP O CEP do associado.
     */
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    /**
     * Obtém a data de nascimento do associado.
     *
     * @return A data de nascimento do associado.
     */
    public String getNascimento() {
        return Nascimento;
    }

    /**
     * Define a data de nascimento do associado.
     *
     * @param Nascimento A data de nascimento do associado.
     */
    public void setNascimento(String Nascimento) {
        this.Nascimento = Nascimento;
    }

    /**
     * Obtém a cidade do associado.
     *
     * @return A cidade do associado.
     */
    public String getCidade() {
        return Cidade;
    }

    /**
     * Define a cidade do associado.
     *
     * @param Cidade A cidade do associado.
     */
    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }
}
