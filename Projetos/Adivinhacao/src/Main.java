import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int num_gerado,num_digitado;
        Scanner entrada_dados = new Scanner(System.in);
        Random gerador_num_aleatorio = new Random();
        num_gerado = gerador_num_aleatorio.nextInt(11);//Define um limite máximo que o número pode ser gerado
        System.out.print("Digite um número para adivinhar o número aleatório: ");
        num_digitado = entrada_dados.nextInt();
        while (num_digitado != num_gerado) {
            System.out.print("Número dígitado não bate com o gerado aleatório, por favor digite novamente: ");
            num_digitado = entrada_dados.nextInt();
        }
        System.out.println("Número digitado bate com o gerado aleatoriamente, parabens !");
    }
}