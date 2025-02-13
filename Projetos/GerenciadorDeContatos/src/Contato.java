import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contato {
    private List<Pessoa> contatos;

    public Contato() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato() { //Esse método recebe um objeto Pessoa como argumento e o adiciona à lista contatos.
        Scanner entrada_dados = new Scanner(System.in);
        String cpf, nome, email, telefone;
        int idade,id = contatos.size()+1;
        System.out.print("Digite o nome para adicionar ao contato: ");
        nome = entrada_dados.nextLine();
        System.out.print("Digite o CPF para adicionar ao contato: ");
        cpf = entrada_dados.nextLine();
        System.out.print("Digite o email para adicionar ao contato: ");
        email = entrada_dados.nextLine();
        System.out.print("Digite o telefone para adicionar ao contato: ");
        telefone = entrada_dados.nextLine();
        System.out.print("Digite a idade para adicionar ao contato: ");
        idade = entrada_dados.nextInt();
        entrada_dados.nextLine();// Limpa o buffer deixado por nextInt
        Pessoa pessoa = new Pessoa(cpf, nome, email, telefone, idade, id++);     //instancia a classe Pessoa passando os dados coletados acima para criar
        contatos.add(pessoa);                                                    //o objeto pessoa e adicionar ao arrayList da class Contato
        System.out.println("Contato Adicionado com sucesso !");
    }

    public void listarContatos() {                                               //Lista todos os contatos cadastrados
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado");
        } else {
            for (int i = 0; i < contatos.size(); i++) {
                System.out.println("---------------");
                contatos.get(i).exibirInfo();
                System.out.println("---------------");
            }
        }
    }

    public void excluircontatos() {                                            //Exclui algum contato filtrado pelo nome
        Scanner entrada_dados = new Scanner(System.in);
        String escolha;
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado");
        } else {
            System.out.print("Escreva o nome do contato que deseja excluir: ");
            escolha = entrada_dados.nextLine();
            for (int i = 0; i < contatos.size(); i++) {
                if (escolha.equalsIgnoreCase(contatos.get(i).getNome())){
                    contatos.remove(i);
                }else {
                    System.out.println("Contato digitado não encontrado");
                }
            }
        }
    }

    public void buscacontatos() {                                           //Busca algum contato filtrando pelo nome
        Scanner entrada_dados = new Scanner(System.in);
        String escolha;
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado");
        } else {
            System.out.print("Escreva o nome para que o contato seja carregado: ");
            escolha = entrada_dados.nextLine();
            for (int i = 0; i < contatos.size(); i++) {
                if (escolha.equalsIgnoreCase(contatos.get(i).getNome())){
                    contatos.get(i).exibirInfo();
                }else {
                    System.out.println("Contato digitado não encontrado");
                }

            }
        }
    }

}