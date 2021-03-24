package associacao.classes;

public class aluno {
    private String nome;
    private int idade;
    private seminario seminario;

    public aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public aluno() {
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.seminario != null) {
            System.out.println("Seminario inscrito: " + this.seminario.getTitulo());
        } else {
            System.out.println(this.nome + " não está inscrito em nenhum seminário");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public seminario getSeminario() {
        return this.seminario;
    }

    public void setSeminario(seminario seminario) {
        this.seminario = seminario;
    }

}