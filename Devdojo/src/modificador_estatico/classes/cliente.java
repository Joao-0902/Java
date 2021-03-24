package modificador_estatico.classes;

public class cliente {
    // 1 - Bloco de inicialização estático é executado quando a JVM carregar a
    // classe (é executado apenas uma vez)
    // 2 - Alocado espaço na memória para o objeto que será criado
    // 3 - Cada atributo de classe é criado e inicializado com seus valores default
    // ou valores explicitos
    // 4 - Bloco de inicialização é executado
    // 5 - O construtor é executado
    private static int[] parcelas;

    static {
        parcelas = new int[100];
        System.out.println("Bloco estático 1");
        // inicializando valores do array
        for (int i = 1; i <= 100; i++) {
            parcelas[i - 1] = i;
        }
    }

    public cliente() {

    }

    public static int[] getParcelas() {
        return parcelas;
    }
}
