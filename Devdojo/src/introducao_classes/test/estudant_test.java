package introducao_classes.test;

import introducao_classes.classes.estudante_classe;

public class estudant_test {
    public static void main(String[] args) {
        estudante_classe estudante = new estudante_classe();
        estudante.setNome("Rayane");
        estudante.setIdade(16);
        int media = estudante.dados(9, 8, 10);
        if (media > 6) {
            System.out.println("Estudante: " + estudante.getNome() + "\nIdade: " + estudante.getIdade() + "\nMedia: "+ media + "\nAprovado!");
        } else {
            System.out.println("Estudante: " + estudante.getNome() + "\nIdade: " + estudante.getIdade() + "\nMedia: "+ media + "\nAprovado!");
        }
    }
}
