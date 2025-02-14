/**
Classe que representa uma tarefa com título, descrição e um identificador único (ID).
**/
public class Tarefas {
    private String titulo,descricao;            // Atributos privados para armazenar as informações da tarefa
    private int id;

    public Tarefas(String titulo, String descricao, int id) {
        this.id = id;                          //Construtor da classe Tarefas.
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String exibirInfo(){                 //Metodo que retorna as informações da tarefa formatadas em uma string.
        return "ID: " + id + "\nTítulo: " + titulo + "\nDescrição: " + descricao;
    }

    public int getId() {                    // Métodos getters e setters para acessar e modificar os atributos da classe.
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
