import java.util.ArrayList; // Importando a classe ArrayList para poder usar listas dinâmicas de inteiros.
import java.util.Collections; // Importando a classe Collections para usar o metodo swap, que troca os elementos da lista.

public class BubbleSort { // Definindo a classe BubbleSort, que é o nome da classe com a convenção de início com letra maiúscula.

    // Metodo estático 'ordenar' que recebe uma lista de inteiros e ordena os elementos dessa lista em ordem crescente.
    public static void ordenar(ArrayList<Integer> lista) {

        // Laço externo que controla as passagens pelo array. A cada passagem o maior número "borbulha" para o final da lista.
        for (int i = 0; i < lista.size(); i++) {

            // Laço interno que percorre a lista e compara elementos adjacentes.
            // O número de comparações diminui a cada passagem do laço externo.
            for (int j = 0; j < lista.size() - 1 - i; j++) {

                // Se o elemento atual (na posição j) for maior que o próximo (na posição j+1), eles são trocados.
                if (lista.get(j) > lista.get(j + 1)) {

                    // Troca de elementos usando o metodo 'swap' da classe Collections.
                    Collections.swap(lista, j, j + 1);
                }
            }
        }
    }
}
