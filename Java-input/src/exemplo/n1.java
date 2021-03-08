package exemplo;

import javax.swing.JOptionPane;

public class n1 {
    public void sel1() {
        calc calc = new calc();
        String sel = JOptionPane.showInputDialog(null, "Escolha um número para mostrar a tabuada: \n");
        int sl = Integer.parseInt(sel);
        calc.mult(sl);
    }
}
