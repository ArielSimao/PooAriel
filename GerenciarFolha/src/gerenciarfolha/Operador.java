/*
 * Aulas professor Maromo.
 */
package gerenciarfolha;

/**
 *
 * @author maromo
 */
public class Operador extends Funcionario {
    private double salHora;

    public double getSalHora() {
        return salHora;
    }

    public void setSalHora(double salHora) {
        this.salHora = salHora;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Salario Hora: " + salHora);
    }
}
