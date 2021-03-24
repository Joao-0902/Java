package introducao_classes.test;

import java.util.Scanner;

import introducao_classes.classes.professor;

public class professorTest {
    public static void main(String[] args) {
        professor professor = new professor();
        professor professor2 = new professor();
        Scanner scanner = new Scanner(System.in);
        professor.nome = scanner.next();
        professor.cpf = scanner.next();
        professor.rg = scanner.next();
        professor.mat = scanner.next();
        System.out.println("Professor1: " + professor.nome + "\nCpf: " + professor.cpf + "\nRG: " + professor.rg + "\nMatricula: " +professor.mat);
        System.out.println("==============");
        professor2.nome = scanner.next();
        professor2.cpf = scanner.next();
        professor2.rg = scanner.next();
        professor2.mat = scanner.next();
        System.out.println("Professor2: " + professor2.nome + "\nCpf: " + professor2.cpf + "\nRG: " + professor2.rg + "\nMatricula: " +professor2.mat);
        scanner.close();
    }
}
