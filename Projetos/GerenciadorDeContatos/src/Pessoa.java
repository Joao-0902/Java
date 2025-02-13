public class Pessoa {
    private String cpf,nome,email,telefone;
    private int idade,id;

    public Pessoa(String cpf, String nome, String email, String telefone, int idade, int id) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
        this.id = id;
    }

    public void exibirInfo() {
        System.out.println("id = " + id);
        System.out.println("nome = " + nome);
        System.out.println("cpf = " + cpf);
        System.out.println("email = " + email);
        System.out.println("telefone = " + telefone);
        System.out.println("idade = " + idade);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}