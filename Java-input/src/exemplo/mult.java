package exemplo;

import javax.swing.JOptionPane;

public class mult {
    public void multiplicar() {
        mult rt = new mult();
        menu mn = new menu();
        n2 nm2 = new n2();
        String sn1 = JOptionPane.showInputDialog(null, "1° Número: ");
        String sn2 = JOptionPane.showInputDialog(null, "2° Número: ");
        int n1 = Integer.parseInt(sn1);
        int n2 = Integer.parseInt(sn2);
        int res = n1 * n2;
        JOptionPane.showMessageDialog(null, n1 + "X" + n2 + "=" + res);
        int sel = JOptionPane.showConfirmDialog(null, "Deseja continuar ?");
        if (sel == 0) {
            rt.multiplicar();
        }else if (sel == 1) {
            int op = JOptionPane.showConfirmDialog(null, "Voltar ao menu anterior ?");
            if (op == 0) {
                mn.principal();
            } else {
                nm2.sel2();
            }
        } else {
            System.out.println("Operação cancelada pelo usuário.");
        }
    }
}
