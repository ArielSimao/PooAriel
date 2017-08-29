/*
 * Aulas professor Maromo.
 */
package gerenciarcaixa;

/**
 *
 * @author maromo
 */
public class Caixa {

    private double saldo;

    public String sacar(double valor) throws GerenciarCaixaException {
        try {
            if (valor < 0){
                throw new IllegalArgumentException("Valor não pode ser negativo");
            }
            if(valor > saldo){
                throw new GerenciarCaixaException();
            }
        } catch(GerenciarCaixaException erro){
            throw erro;
        } catch (Exception e) {
            throw e;
        }
        
        return "Valor inválido ou saldo insuficiente";
    }

    public String depositar(double valor) {
        try {
            if (valor > 0) {
                saldo += valor;
                return "Depósito efetuado com sucesso";
            }else{
                throw new IllegalArgumentException("Valor não pode ser negativo");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
