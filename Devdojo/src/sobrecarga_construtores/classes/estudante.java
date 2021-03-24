package sobrecarga_construtores.classes;

public class estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String datam;

    public estudante(String matricula, String nome, double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public estudante(String matricula, String nome, double[] notas, String datam) {
        this(matricula, nome, notas);
        this.datam = datam;
    }

    public estudante() {
        System.out.println("Construtor default");
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.matricula);
        for (double nota : notas) {
            System.out.println(nota + " ");
        }
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getDatam() {
        return this.datam;
    }

    public void setDatam(String datam) {
        this.datam = datam;
    }

}
