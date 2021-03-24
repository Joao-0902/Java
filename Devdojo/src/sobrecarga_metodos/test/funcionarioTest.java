package sobrecarga_metodos.test;

import sobrecarga_metodos.classes.funcionario;

public class funcionarioTest {
    public static void main(String[] args) {
        funcionario funcionario = new funcionario("João", "111.222.333-55",4.500, "5555-55");
        funcionario funcionario2 = new funcionario();
        funcionario.imprime();
        funcionario2.imprime();
    }
}
