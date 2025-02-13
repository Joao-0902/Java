import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String opcao;
        Scanner entrada_dados = new Scanner(System.in);
        Contato contato = new Contato();
        while (true) {
            System.out.println("---------------");
            System.out.println("Criar - Criar um novo contato \nListar - Listar os contatos existentes \nBuscar - Buscar um contato existente \nexcluir - Excluir um contato existente");
            System.out.print("Digite o que deseja fazer: ");
            opcao = entrada_dados.nextLine();
            if (opcao.equalsIgnoreCase("criar")) {
                contato.adicionarContato();
            } else if (opcao.equalsIgnoreCase("listar")) {
                contato.listarContatos();
            }else if (opcao.equalsIgnoreCase("buscar")) {
                contato.buscacontatos();
            } else if (opcao.equalsIgnoreCase("excluir")) {
                contato.excluircontatos();
            } else if (opcao.equalsIgnoreCase("sair")) {
                break;
            }
        }
    }
}