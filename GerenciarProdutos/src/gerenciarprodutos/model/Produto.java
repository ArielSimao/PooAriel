package gerenciarprodutos.model;


public class Produto {
    private int idProduto;
    private String descricao;
    private int qtdDisponivel;
    private double preco;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public String entrada(int qtd){
        if(qtd > 0){
            qtdDisponivel += qtd;
            return "Entrada efetuada com sucesso";
        }
        return "Valor inválido para entrada";
    }
    public String saida(int qtd){
        if((qtd > 0) && (qtd <= getQtdDisponivel())){
            qtdDisponivel -= qtd;
            return "Retirada efetuada com sucesso";
        }
        return "Valor inválido ou insuficiente para saída";
    }

    public int getQtdDisponivel() {
        return qtdDisponivel;
    }
    
}
