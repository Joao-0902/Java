package exemplo;

import javax.swing.JOptionPane;

public class rascunho {
    public static void main(String[] args) {
        int sel = JOptionPane.showConfirmDialog(null, "Deseja continuar ?");
        System.out.println(sel);
    }
}