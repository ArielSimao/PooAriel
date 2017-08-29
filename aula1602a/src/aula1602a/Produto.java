package aula1602a;

//Classe de modelagem Produto
public class Produto {
    //Definir os atributos / características
    public int codProduto;
    public String descricao;
    public double preco;
    public int qtdEstoque;
    
    //Criar o método Construtor da Classe
    public Produto(){
        System.out.println("Construindo o objeto");
        codProduto = 0;
        descricao = "";
        preco = 0.0;
        qtdEstoque= 0;
    }
    
    //Outros Métodos
    public void listarProduto(){
        //Imprimir os dados do produto
        System.out.println("DADOS DO PRODUTO");
        System.out.println("Codigo: " + codProduto);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: " + preco);
        System.out.println("Qtd em Estoque: " + qtdEstoque);
        System.out.println("=============================");
    }
}
