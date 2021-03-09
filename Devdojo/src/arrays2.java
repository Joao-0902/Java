import javax.swing.JOptionPane;

public class arrays2 {
    public static void main(String[] args) {
        String ar = JOptionPane.showInputDialog(null, "Digite o tamanho do array: ");
        int arr = Integer.parseInt(ar);
        String [] nomes = new String [arr];
        nomes [0] = "João !";
        nomes [1] = "Mariana !";
        nomes [2] = "Léo !";
        nomes [3] = "Pedro !";
        System.out.println(nomes.length);
        for (int i = 0; i < nomes.length; i++) {
            JOptionPane.showMessageDialog(null, nomes[i]);
        }
    }
}
