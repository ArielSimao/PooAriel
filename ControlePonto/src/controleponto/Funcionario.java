
package controleponto;

public abstract class Funcionario {
    private int id;
    private String nome;
    private String email;
    private String documento;

     public Funcionario(int id, String nome, String email, String documento){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.documento = documento;
     }
     
     public void imprimir(){
        System.out.println("Id: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Cidade: " + getEmail());
        System.out.println("Documento: " + getDocumento());
     }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getDocumento() {
        return documento;
    }

    
    public void setDocumento(String documento) {
        this.documento = documento;
    }
}