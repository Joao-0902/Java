package modificador_estatico.test;

import modificador_estatico.classes.carro;

public class carroTest {
    public static void main(String[] args) {
        carro.vellimit = 220;
        carro c1 = new carro("BMW", 280);
        carro c2 = new carro("AUDI", 275);
        carro c3 = new carro("MERCEDES", 290);
        c1.imprime();
        c2.imprime();
        c3.imprime();
        System.out.println("###################");
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
