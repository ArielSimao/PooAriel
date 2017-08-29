/*
 * Aulas professor Maromo.
 */
package gerenciarcaixa;

/**
 *
 * @author maromo
 */
public class GerenciarCaixaException extends Exception {
    @Override
    public String toString(){
        //Poderia gravar um log aqui
        //codigo para gravar o log
        //depois retorna o erro para o usuario
        return "Sem saldo suficiente";
    }
}
