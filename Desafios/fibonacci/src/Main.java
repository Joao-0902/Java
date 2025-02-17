// Este é um código que gera a sequencia de fibonacci de acordo com o número digitado pelo usuário.
// já deixei defino os números dois primeiros números (0 e 1) pois simplifica bastante a lógica e
// evita verificações extras dentro do loop.


import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> fibonacci = new ArrayList<>();
        int opcao, calculo;

        // Definindo os dois primeiros números da sequência
        fibonacci.add(0);
        fibonacci.add(1);

        // Solicitando entrada do usuário
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de números para a sequência de Fibonacci: "));

        // Se a opção for menor que 2, ajustamos a lista para exibir corretamente
        if (opcao < 2) {
            fibonacci = new ArrayList<>(fibonacci.subList(0, opcao)); // Mantém apenas os números necessários
        } else {
            for (int i = 2; i < opcao; i++) { // Começamos de 2 porque já temos os dois primeiros números
                calculo = fibonacci.get(i - 1) + fibonacci.get(i - 2);
                fibonacci.add(calculo);
            }
        }

        // Exibindo a sequência gerada
        JOptionPane.showMessageDialog(null, "Sequência de Fibonacci:\n" + fibonacci.toString());
    }
}
