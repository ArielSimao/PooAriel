package gerenciarvolei;

public class Jogador {
    private int id;
    private String nome;
    
    //Get / set na mão
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void imprimir(){
        System.out.println("Dados do Jogador");
        System.out.println("----------------");
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("");
    }
    
}
