package calcularvolume;


public class Esfera {
    private double raio;
    
    public double getVolume(){
        double resultado;
        resultado = 4.0/3.0 * Math.PI * Math.pow(raio, 3.0);
        return resultado;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
