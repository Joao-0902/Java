package associacao.classes;

public class professor {
    private String nome;
    private String especialidade;
    private seminario[] seminarios;

    public professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public professor() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public seminario[] getSeminarios() {
        return this.seminarios;
    }

    public void setSeminarios(seminario[] seminarios) {
        this.seminarios = seminarios;
    }

}
