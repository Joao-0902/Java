package exemplo;

import javax.swing.JOptionPane;

public class menu {
    public void principal() {
        App n0 = new App();
        n1 nm1 = new n1();
        mult nm2 = new mult();
        n2 nm3 = new n2();
        String sel = JOptionPane.showInputDialog(null, "Bem vindo ao menu ! \n 1) Tabuada \n 2) Multiplicar \n 3) Sair do Programa \n 0) Voltar ao menu anterior");
        int sl = Integer.parseInt(sel);
        if (sl == 1) {
            nm1.sel1();
        }else if(sl == 2) {
            nm2.multiplicar();
        }else if(sl == 3) {
            nm3.sel2();
        }else if (sl == 0) {
            n0.sayHello();
        } else {
            JOptionPane.showMessageDialog(null, "Digite um valor válido !");
        }
    }
}
