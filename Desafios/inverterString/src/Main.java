import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class Main {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner entrada_dados = new Scanner(System.in);

        String entrada; // Declara uma variável para armazenar a entrada do usuário

        // Solicita ao usuário que digite uma frase
        System.out.print("Digite a frase a ser invertida: ");
        entrada = entrada_dados.nextLine(); // Lê a linha completa digitada pelo usuário

        // Cria um StringBuilder com a entrada e inverte a string usando o metodo reverse.
        StringBuilder saida = new StringBuilder(entrada).reverse();

        // Exibe a frase invertida
        System.out.println("Frase invertida = " + saida);

        // Fecha o Scanner para evitar desperdício de recursos
        entrada_dados.close();
    }
}
