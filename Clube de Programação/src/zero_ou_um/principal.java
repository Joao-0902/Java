package zero_ou_um;
import java.util.Random;

public class principal {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            int numero = random.nextInt(2);
            System.out.println(numero);
        }
    }
}
