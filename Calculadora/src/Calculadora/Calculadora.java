package calculadora;

public class Calculadora {
    private double vlr1;
    private double vlr2;
    private double result;

    public void somar(double valor1, double valor2){
        setResult(valor1 + valor2);
    }
    public void subtrir(double valor1, double valor2){
       setResult(valor1 - valor2);
    }
    public void dividir(double valor1, double valor2){
        setResult(valor1 / valor2);
    }
    public void multiplicar(double valor1, double valor2){
        setResult(valor1 * valor2);
    }
    
    public double getVlr1() {
        return vlr1;
    }

    public void setVlr1(double vlr1) {
        this.vlr1 = vlr1;
    }

    public double getVlr2() {
        return vlr2;
    }

    public void setVlr2(double vlr2) {
        this.vlr2 = vlr2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
    
}
