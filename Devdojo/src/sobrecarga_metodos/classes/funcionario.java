package sobrecarga_metodos.classes;

public class funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String rg;

    public funcionario(String nome, String cpf, Double salario, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.rg = rg;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.salario);
        System.out.println(this.rg);
    }

    public funcionario() {
        
    }

    public void init(String nome, String cpf, Double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void init(String nome, String cpf, Double salario,String rg) {
        init(nome, cpf, salario);
        this.rg = rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getRg() {
        return this.rg;
    }

}
