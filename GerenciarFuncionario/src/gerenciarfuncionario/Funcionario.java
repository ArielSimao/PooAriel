/*
 * Aulas professor Maromo.
 */
package gerenciarfuncionario;

/**
 *
 * @author maromo
 */
public abstract class Funcionario {
    private int id;
    private String nome;
    public Endereco endereco;
    private double salario;
    
    public Funcionario(){
        this.endereco = new Endereco();
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

    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void imprimir(){
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }
    
}
