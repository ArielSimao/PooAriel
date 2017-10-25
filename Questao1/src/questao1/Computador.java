
package questao1;

public class Computador {
    private int idComp;
    private String descricao;
    private double valor;
    
    public int getIdComp(){
        return idComp;
    }
    public String getDescricao(){
        return descricao;
    }
    public double valor(){
        return valor;
    }
    public void setIdComp(int idComp){
        this.idComp = idComp;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    //Questao 4
    //a)
    public void listarDados(){
        System.out.println("Id do computador: " + idComp);
        System.out.println("Nome do Computador: " + descricao );
        System.out.println("Valor: " + valor);
    }
    
    //b)
    public int atualizarPreco(Usuario usu, double preco){
        if(usu.getNivel()==2){
            this.valor = preco;
            return 0;
        }
        return 1;
    }
}
