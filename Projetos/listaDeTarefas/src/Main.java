import java.util.ArrayList; // Importa a classe ArrayList para armazenar as tarefas dinamicamente
import java.util.Iterator; // Importa Iterator (embora não esteja sendo usado no código atual)
import javax.swing.JOptionPane; // Importa JOptionPane para entrada e saída de dados via pop-ups

public class Main {
    public static void main(String[] args) {
        ArrayList<Tarefas> lista_tarefas = new ArrayList<>(); // Cria uma lista para armazenar as tarefas
        String entrada_usuario; // Variável para armazenar a entrada do usuário

        while (true) { // Loop infinito para manter o programa rodando até o usuário sair
            entrada_usuario = JOptionPane.showInputDialog(
                    "Criar - Criar uma nova tarefa \n" +
                            "Listar - Listar todas as tarefas \n" +
                            "Excluir - Excluir alguma tarefa \n" +
                            "Sair - Sair do sistema \n" +
                            "Digite o que deseja fazer:"
            );

            entrada_usuario = entrada_usuario.toLowerCase(); // Normaliza a entrada para evitar problemas com maiúsculas/minúsculas

            switch (entrada_usuario) { // Estrutura de controle para definir ações com base na escolha do usuário
                case "criar":
                    // Solicita ao usuário o título e a descrição da nova tarefa
                    String titulo_tarefa = JOptionPane.showInputDialog(null, "Digite o título da tarefa: ");
                    String descricao_tarefa = JOptionPane.showInputDialog(null, "Digite a descrição da tarefa: ");
                    if (titulo_tarefa.isEmpty() || descricao_tarefa.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Digite informações válidas");
                    } else {
                        // Define um ID único baseado no tamanho da lista
                        int id = lista_tarefas.size() + 1;

                        // Cria uma nova tarefa e adiciona à lista
                        Tarefas tarefas = new Tarefas(titulo_tarefa, descricao_tarefa, id);
                        lista_tarefas.add(tarefas);

                        JOptionPane.showMessageDialog(null, "Tarefa adicionada com sucesso!");

                    }
                    break;

                case "listar":
                    StringBuilder listaDeTarefas = new StringBuilder(); // Usa StringBuilder para melhor desempenho ao concatenar strings

                    if (lista_tarefas.isEmpty()) { // Verifica se há tarefas cadastradas
                        JOptionPane.showMessageDialog(null, "Nenhuma tarefa cadastrada, verifique!");
                    } else {
                        for (int i = 0; i < lista_tarefas.size(); i++) {
                            // Adiciona cada tarefa à string de exibição, separando-as por uma linha
                            listaDeTarefas.append(lista_tarefas.get(i).exibirInfo()).append("\n-----\n");
                        }
                        JOptionPane.showMessageDialog(null, listaDeTarefas.toString());
                    }
                    break;

                case "excluir":
                    entrada_usuario = JOptionPane.showInputDialog(null, "Digite o título da tarefa para excluir: ");
                    boolean removido = false; // Flag para verificar se a tarefa foi removida

                    for (int i = 0; i < lista_tarefas.size(); i++) {
                        if (entrada_usuario.equalsIgnoreCase(lista_tarefas.get(i).getTitulo())) {
                            lista_tarefas.remove(i); // Remove a tarefa da lista pelo índice
                            JOptionPane.showMessageDialog(null, "Tarefa removida com sucesso!");
                            removido = true;
                            break; // Sai do loop assim que encontrar e remover a tarefa
                        }
                    }
                    if (!removido) { // Se nenhuma tarefa foi removida, exibe uma mensagem de erro
                        JOptionPane.showMessageDialog(null, "Nenhuma tarefa encontrada!");
                    }
                    break;
                case "sair":
                    JOptionPane.showMessageDialog(null, "Encerrando...");
                    return; // Encerra o programa
                default:
                    JOptionPane.showMessageDialog(null, "Digite uma opção válida!"); // Mensagem caso o usuário digite algo inválido
            }
        }
    }
}
