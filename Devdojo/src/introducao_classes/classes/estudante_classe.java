package introducao_classes.classes;

public class estudante_classe {
    private String nome;
    private double idade;
    public int dados(int n1, int n2, int n3) {
        int media = (n1 + n2 + n3) / 3;
        return media;
    }
    public void setNome (String nome) {
        if (nome == null) {
            System.out.println("Preencha");
            return;
        }
        this.nome = nome;
    }
    public void setIdade (int idade) {
        if (idade < 0) {
            System.out.println("Voce não pode fazer isso");
            return;
        }
        this.idade = idade;
    }
    public String getNome() {
        return this.nome;
    }
    public double getIdade() {
        return this.idade;
    }
}