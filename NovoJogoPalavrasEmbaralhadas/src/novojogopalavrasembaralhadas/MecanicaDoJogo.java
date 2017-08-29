
package novojogopalavrasembaralhadas;

public interface MecanicaDoJogo {
    public String getNome();
    public String getDescricao();
    public String getPalavraEmbaralhada();
    public String getSituacao(String palavra, String resposta);
    public boolean acabou();
    public int getAcertos();
    public String getPalavra();
}
