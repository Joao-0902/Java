package bloco_inicializacao.classes;

public class cliente {
    // 1 - Alocado espaço na memória para o objeto que será criado
    // 2 - Cada atributo de classe é criado e inicializado com seus valores default
    // ou valores explicitos
    // 3 - Bloco de inicialização é executado
    // 4 - O construtor é executado
    private int[] parcelas;

    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização");
        // inicializando valores do array
        for (int i = 1; i <= 100; i++) {
            parcelas[i - 1] = i;
        }
    }

    public cliente() {  

    }

    public int[] getParcelas() {
        return this.parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }

}
