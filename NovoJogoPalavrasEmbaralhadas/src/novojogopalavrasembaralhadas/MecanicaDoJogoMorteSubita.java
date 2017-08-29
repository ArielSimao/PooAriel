
package novojogopalavrasembaralhadas;

public class MecanicaDoJogoMorteSubita implements MecanicaDoJogo{
    private int acertos = 0;
    private boolean acabou = false;
    private String palavra;
    BancoDePalavras bp = new BancoDePalavras();
    Embaralhador e;
    @Override
    public String getNome() {
        return "Morte Súbita";
    }

    @Override
    public String getDescricao() {
        return "O jogo acaba quando você erra uma vez";
    }

    @Override
    public String getPalavraEmbaralhada() {
        palavra = bp.getPalavraAleatoria();
        e = FabricaEmbaralhador.getEmbaralhador();
        return (e.embaralhaString(palavra));
    }

    @Override
    public String getSituacao(String palavra, String resposta) {
        if(palavra.equals(resposta)){
            acertos++;
            return "Acertou :)";
        }
        acabou = true;
        return "Errou :(";
    }

    @Override
    public boolean acabou() {
        return acabou;
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
