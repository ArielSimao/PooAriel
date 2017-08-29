
package aula2302_prjapolice;

public class Apolice {
    private String nomeSegurado;
    private int idade;
    private float valorPremio;

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(float valorPremio) {
        this.valorPremio = valorPremio;
    }
    //Métodos personalizados
    public void imprimir(){
        System.out.println("Segurado: " + nomeSegurado);
        System.out.println("Idade: " + idade);
        System.out.println("Vlr. Premio: " + valorPremio);
    }
    
}
