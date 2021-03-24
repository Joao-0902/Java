package introducao_classes.test;

import introducao_classes.classes.carro;

public class carroTest {
    public static void main(String[] args) {
        carro carro = new carro();
        carro.modelo = "fusca";
        carro.placa = "mno1234";
        carro.vm = 120f;
        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.vm);
    }
}
