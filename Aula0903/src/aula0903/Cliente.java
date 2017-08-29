package aula0903;

public class Cliente {

    private int codigo;
    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimir() {
        System.out.println("Dado do cliente");
        System.out.println("Cod: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("");
    }

}
