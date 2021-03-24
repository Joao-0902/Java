package bloco_inicializacao.test;

import bloco_inicializacao.classes.cliente;

public class clienteTest {
    public static void main(String[] args) {
        cliente c = new cliente();
        System.out.println("Exibindo quantidade de parcelas possiveis");
        for (int parcela : c.getParcelas()) {
            System.out.print(parcela + " ");
        }
    }
}
