
package gerenciavendapc;

public class Computador {
    private String marca;    
    private String cor;    
    private String modelo;    
    private long numeroSerie;    
    private double preco;
    
    public void imprimir(){
        System.out.println("Marca " +marca);
        System.out.println("Cor "+cor);
        System.out.println("Modelo "+modelo);
        System.out.println("Número Série " +numeroSerie);
        System.out.println("Preço "+preco);
    }
    public void calculaValor(){
        
        if(marca.equalsIgnoreCase("HP")){
            preco *= 1.30;
        }else  if(marca.equalsIgnoreCase("IBM")){
                preco *= 1.50;    
        }
    }
    public int alteraValor(double valor){
        if(valor > 0){
            preco = valor;
            return 1;
        }
        return 0;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNumeroSerie(long numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
      
}
