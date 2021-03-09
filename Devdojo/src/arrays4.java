import javax.swing.JOptionPane;

public class arrays4 {
    public static void main(String[] args) {
        String[] nomes = { "João", "Mariana", "Kaneki" };
        for (int i = 0; i < nomes.length; i++) {
            JOptionPane.showMessageDialog(null, nomes[i]);
        }
    }
}
