package introducao_classes.test;

import introducao_classes.classes.*;

public class estudanteTest {
    public static void main(String[] args) {
        estudante joao = new estudante();
        joao.nome = "joao";
        joao.matricula = "1212";
        joao.idade = 19;
        System.out.println(joao.nome);
        System.out.println(joao.matricula);
        System.out.println(joao.idade);
    }
}