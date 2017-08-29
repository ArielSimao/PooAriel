
package novojogopalavrasembaralhadas;

import java.util.Random;

public class MecanicaDoJogoTemporizador implements MecanicaDoJogo{
    private long inicio = System.currentTimeMillis();
    private int limite;
    private int acertos = 0;
    private String palavra;
    BancoDePalavras bp = new BancoDePalavras();
    Embaralhador e;    
    Random r = new Random(System.currentTimeMillis());
       
    MecanicaDoJogoTemporizador(){
        getLimite();
    }
    
    @Override
    public String getNome() {
        return " [Temporizador] ";
    }

    @Override
    public String getDescricao() {
        return "Você não sabe quanto tempo ainda lhe resta.\nAcerte o máximo que puder.";
    }

    @Override
    public String getPalavraEmbaralhada() {
        palavra = bp.getPalavraAleatoria();
        e = FabricaEmbaralhador.getEmbaralhador();
        return (String) e.embaralhaString(palavra);
    }

    @Override
    public String getSituacao(String palavra, String resposta) {
        if(palavra.equals(resposta)){
            acertos++;
            return "Acertou!";
        }    
        return "Errou";
    }

    @Override
    public boolean acabou() {               
        if(limite > (System.currentTimeMillis() - inicio))
            return false;
        return true;
    }

    @Override
    public int getAcertos() {
        return acertos;
    }
    @Override
    public String getPalavra(){
        return palavra;
    }
    
    private void getLimite(){
        int[] flag = {10000,20000,30000,40000,50000};
        limite = flag[r.nextInt(5)];       
    }
   
    
}
