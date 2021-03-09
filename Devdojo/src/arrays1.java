import javax.swing.JOptionPane;

public class arrays1 {
    public static void main(String[] args) {
        int [] idades = new int[3];
        idades[0] = 20;
        idades[1] = 18;
        idades[2] = 22;
        JOptionPane.showMessageDialog(null, "Idade 1: "+idades[0]);
        JOptionPane.showMessageDialog(null, "Idade 2: "+idades[1]);
        JOptionPane.showMessageDialog(null, "Idade 3: "+idades[2]);
    }
}
