package exemplo;

import javax.swing.JOptionPane;

public class calc {
	public void mult(int sl) {
        n2 nm2 = new n2();
        n1 n1 = new n1();
        int a = sl;
        menu mn = new menu();
        int[] n = new int[11];
        System.out.println("----------------------");
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < n.length; j++) {
                n [j]= a* i;
            }
            //JOptionPane.showMessageDialog(null, a + "X" + i + "=" + n[i]);
            System.out.println(a + "X" + i + "=" + n[i]);
        }
        int sel = JOptionPane.showConfirmDialog(null, "Deseja continuar ?");
        if (sel == 0) {
            n1.sel1();
        } else if (sel == 1) {
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
