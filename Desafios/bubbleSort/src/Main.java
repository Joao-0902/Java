import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(50);
        lista.add(1);
        lista.add(5);
        lista.add(8);
        lista.add(3);
        lista.add(10);
        lista.add(2);
        lista.add(5);
        System.out.println("lista pré ordenação = " + lista);
        BubbleSort.ordenar(lista);
        System.out.println("lista pós ordenação = " + lista);
    }
}