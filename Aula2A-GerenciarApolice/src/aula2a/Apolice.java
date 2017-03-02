
package aula2a;
  
public class Apolice {
    private String nomeSegurado;
    private int idade;
    private float valorPremio;
    
    
    //metodos personalizados
    public void imprimir(){
        System.out.println("Segurado: "+getNomeSegurado());
        System.out.println("Idade: "+getIdade());
        System.out.println("Vlr Premio: "+getValorPremio());
    }

    /**
     * @return the nomeSegurado
     */
    public String getNomeSegurado() {
        return nomeSegurado;
    }

    /**
     * @param nomeSegurado the nomeSegurado to set
     */
    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the valorPremio
     */
    public float getValorPremio() {
        return valorPremio;
    }

    /**
     * @param valorPremio the valorPremio to set
     */
    public void setValorPremio(float valorPremio) {
        this.valorPremio = valorPremio;
    }

    void setIdade(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setValorPremio(String f_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    
}
