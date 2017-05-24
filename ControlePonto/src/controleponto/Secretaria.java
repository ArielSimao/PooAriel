
package controleponto;

public class Secretaria extends Funcionario{
    
    String telefone;
    String ramal;
    
    
    public Secretaria(int id, String nome, String email, String documento, String telefone, String ramal) {
        super(id, nome, email, documento);
    
        this.ramal = ramal;
        this.telefone = telefone;
    
    }
    

    public String getTelefone(){
        return telefone;
    }
    
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getRamal(){
        return ramal;
    }

    public void setRamal(String ramal){
        this.ramal = ramal;
    }
}


