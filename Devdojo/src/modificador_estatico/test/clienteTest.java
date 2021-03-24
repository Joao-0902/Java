package modificador_estatico.test;

import modificador_estatico.classes.cliente;

public class clienteTest {
    public static void main(String[] args) {
        // cliente c = new cliente();
        // cliente c1 = new cliente();
        // cliente c2 = new cliente();
        System.out.println("Exibindo quantidade de parcelas possiveis");
        // for (int parcela : c.getParcelas()) {
        // System.out.print(parcela + " ");
        // }
        System.out.println("Tamanho: " + cliente.getParcelas().length);
    }
}
