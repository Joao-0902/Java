import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nota1, nota2, nota3;
        double media;
        String aluno;
        Scanner entrada_dados = new Scanner(System.in);
        System.out.print("Digite o nome do aluno para calcular a média: ");
        aluno = entrada_dados.nextLine();
        System.out.print("Digite a primeira nota: ");
        nota1 = entrada_dados.nextInt();
        System.out.print("Digite a segunda nota: ");
        nota2 = entrada_dados.nextInt();
        System.out.print("Digite a terceira nota: ");
        nota3 = entrada_dados.nextInt();
        while (nota1 > 10 || nota2 > 10 || nota3 > 10) {
            System.out.println("Nota(s) digitadas erradas, por favor verifique");
            System.out.print("Digite a primeira nota: ");
            nota1 = entrada_dados.nextInt();
            System.out.print("Digite a segunda nota: ");
            nota2 = entrada_dados.nextInt();
            System.out.print("Digite a terceira nota: ");
            nota3 = entrada_dados.nextInt();
        }
        media = (nota1 + nota2 + nota3) / 3;
        if (media >= 7) {
            System.out.println("Parabéns, o aluno " + aluno + " foi aprovado com média de: " + media);
        } else {
            System.out.println("Infelizmente o aluno " + aluno + " foi reprovado com média de: " + media);
        }
    }
}