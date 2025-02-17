import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Declaração das variáveis
        String frase_digitada; // Armazena a frase digitada pelo usuário
        StringBuilder frase; // Armazena a frase formatada (sem espaços e caracteres especiais)
        StringBuilder frase_invertida; // Armazena a versão invertida da frase formatada

        // Exibe uma caixa de diálogo para o usuário inserir a frase
        frase_digitada = JOptionPane.showInputDialog(null, "Escreva a frase para verificar se é palíndromo:");

        // Remove caracteres especiais e espaços, converte para minúsculas e cria um StringBuilder
        frase = new StringBuilder(frase_digitada.replaceAll("[^a-zA-Z0-9]", "").toLowerCase());

        // Cria uma cópia da frase formatada e a inverte
        frase_invertida = new StringBuilder(frase.toString()).reverse();

        // Exibe no console a frase formatada e sua versão invertida (para depuração)
        System.out.println("frase = " + frase);
        System.out.println("frase_invertida = " + frase_invertida);

        // Compara a frase original formatada com sua versão invertida
        if (frase_invertida.toString().equals(frase.toString())) {
            // Se forem iguais, a frase é um palíndromo
            JOptionPane.showMessageDialog(null, "A frase digitada é um palíndromo");
        } else {
            // Caso contrário, não é um palíndromo
            JOptionPane.showMessageDialog(null, "A frase digitada não é um palíndromo");
        }
    }
}