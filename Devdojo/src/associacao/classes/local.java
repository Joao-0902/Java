package associacao.classes;

public class local {
    private String rua;
    private String bairro;

    public local(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }

    public local() {
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

}
