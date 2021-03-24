package modificador_estatico.classes;

public class carro {
    // velocidade limite deve ser de 240km/h
    private String nome;
    private double velmax;
    public static double vellimit = 240;

    public carro(String nome, double velmax) {
        this.nome = nome;
        this.velmax = velmax;
    }

    public carro() {
    }

    public void imprime() {
        System.out.println("===================");
        System.out.println("Modelo: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velmax);
        System.out.println("Velocidade Limite: " + vellimit);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelmax() {
        return this.velmax;
    }

    public void setVelmax(double velmax) {
        this.velmax = velmax;
    }
}
