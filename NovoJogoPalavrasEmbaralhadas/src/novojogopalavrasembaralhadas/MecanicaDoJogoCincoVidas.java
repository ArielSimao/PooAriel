
package novojogopalavrasembaralhadas;

public class MecanicaDoJogoCincoVidas implements MecanicaDoJogo{
    private int acertos = 0;
    private int errosConsecutivos;
    private int erros = 0;
    private String palavra;
    BancoDePalavras bp = new BancoDePalavras();
    Embaralhador e;
    
    @Override
    public String getNome() {
        return " [Cinco Vidas]";
    }

    @Override
    public String getDescricao() {
        return "Você pode erra cinco vezes, mas se erra três vezes consecutivas morre.\nTenha cuidado!";
    }

    @Override
    public String getPalavraEmbaralhada() {
        palavra = bp.getPalavraAleatoria();
        e = FabricaEmbaralhador.getEmbaralhador();
        return e.embaralhaString(palavra);
    }

    @Override
    public String getSituacao(String palavra, String resposta) {
        if(palavra.equals(resposta)){
            acertos++;
            errosConsecutivos = 0;
            return "Acertou :)";
        }
        erros++;
        errosConsecutivos++;
        return "Errou :(";
    }

    @Override
    public boolean acabou() {
        if((errosConsecutivos > 2) || (erros > 4))
            return true;
        return false;
    }

    @Override
    public int getAcertos() {
        return acertos;
    }
    @Override
    public String getPalavra(){
        return palavra;
    }
    
    
}
