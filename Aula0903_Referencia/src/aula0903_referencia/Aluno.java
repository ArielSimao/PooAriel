package aula0903_referencia;

public class Aluno {
    private int ra;
    private String nome;

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void listarAluno(){
        System.out.println("Dados do Aluno");
        System.out.println("Ra: " + ra);
        System.out.println("Nome: " + nome);
        System.out.println("");
    }
    
    
}
