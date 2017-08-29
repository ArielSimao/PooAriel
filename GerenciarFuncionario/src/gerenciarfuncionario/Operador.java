/*
 * Aulas professor Maromo.
 */
package gerenciarfuncionario;

/**
 *
 * @author maromo
 */
public class Operador extends Funcionario{
    private double salarioHora;

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Salario Hora: " + salarioHora);
    }
    
}
