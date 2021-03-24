package sobrecarga_construtores.test;

import sobrecarga_construtores.classes.estudante;

public class estudanteTest {
    public static void main(String[] args) {
        estudante estudante = new estudante("1212", "João", new double[] { 5, 7, 9 }, "15/09/2018");
        estudante.imprime();
    }
}
