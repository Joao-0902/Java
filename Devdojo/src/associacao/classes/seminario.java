package associacao.classes;

public class seminario {
    private String titulo;
    private aluno[] alunos;
    private professor professor;
    private local local;

    public seminario(String titulo) {
        this.titulo = titulo;
    }

    public seminario() {
    }

    public void imprime() {
        System.out.println("Título: " + this.titulo);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public aluno[] getAlunos() {
        return this.alunos;
    }

    public void setAlunos(aluno[] alunos) {
        this.alunos = alunos;
    }

    public professor getProfessor() {
        return this.professor;
    }

    public void setProfessor(professor professor) {
        this.professor = professor;
    }

    public local getLocal() {
        return this.local;
    }

    public void setLocal(local local) {
        this.local = local;
    }
}