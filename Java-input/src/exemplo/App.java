package exemplo;

import javax.swing.JOptionPane;

public class App {
    public void sayHello() {
        menu menu = new menu();
        n2 nm2 = new n2();
        String sel = JOptionPane.showInputDialog(null, "Selecione: \n 1) Entrar \n 2) Sair");
        int sl = Integer.parseInt(sel);
        if (sl == 1) {
            menu.principal();
        }else if (sl == 2) {
            nm2.sel2();
        }else{
            JOptionPane.showMessageDialog(null, "Digite um valor válido !");
        }
    }
}
