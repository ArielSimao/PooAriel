
package aula1a.Aula1A;

//Classe de modelagem Produto
public class Produto {
    //definir os atributos(caracteristicas), sempre camelCasing
    public int codProduto;
    public String descricao;
    public double preco;
    public int qntEstoque;
    
    //criar o metodo construtor da classe - construtor com msm nome da clase e maiusculo
    public Produto(){
        System.out.println("Cronstruindo o Obejeto");
        System.out.println("------------------------");
        codProduto = 0;
        descricao = "";
        preco = 0.0;
        qntEstoque = 0;       
    }
    
    //criar o metodo listar produto
    public void listarProduto(){
        //imprimir os dados do produto
        System.out.println("Dados do Produto");
        System.out.println("Codigo: " + codProduto);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: " + preco);
        System.out.println("Qnt. Estoque: " + qntEstoque);
        System.out.println("-----------------------------------------");
    }
    
}
