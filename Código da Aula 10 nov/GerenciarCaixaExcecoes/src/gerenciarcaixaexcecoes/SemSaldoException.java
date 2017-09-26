package gerenciarcaixaexcecoes;

/**
 *
 * @author maromo
 */
public class SemSaldoException extends Exception {
    
    @Override
    public String getMessage(){
        return "Sem saldo disponível na conta";
    }
}
