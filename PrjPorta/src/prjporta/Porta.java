package prjporta;

public class Porta {
    private int largura;
    private int altura;
    private int profundidade;
    private String cor;

    //Método construto
    //Nossa fábrica só faz porta azul.
    public Porta(){
        this.cor = "Azul";
    }
    //Clientes especiais podem escolher a cor
    public Porta(String cor){
        this.cor = cor;
    }
    
    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(int profundidade) {
        this.profundidade = profundidade;
    }

    public String getCor() {
        return cor;
    }

    
    
    public void listarPorta(){
        System.out.println("Descrição da Porta: ");
        System.out.println("Larg: " + largura);
        System.out.println("Alt: " + altura);
        System.out.println("Profundidade: " + profundidade);
        System.out.println("Coloração: " + cor);
    }
}
