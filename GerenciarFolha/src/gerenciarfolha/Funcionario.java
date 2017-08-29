/*
 * Aulas professor Maromo.
 */
package gerenciarfolha;

/**
 *
 * @author maromo
 */
public abstract class Funcionario {
    private int idFuncionario;
    private String nome;
    public Endereco endereco;
    private double salarioMes;

    //Definir construtor
    public Funcionario(){
        this.endereco = new Endereco();
    }
    
    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

    public double getSalarioMes() {
        return salarioMes;
    }

    public void setSalarioMes(double salarioMes) {
        this.salarioMes = salarioMes;
    }
    
    public void imprimir(){
        System.out.println("Imprimir os dados do Funcionario");
        System.out.println("Nome: " + nome);
        System.out.println("Cidade de Residencia: " + endereco.getCidade());
        System.out.println("Salário Mês: " + salarioMes);
    }
}
