
package novojogopalavrasembaralhadas;

public class EmbaralhadorInversorPelaMetade implements Embaralhador{

    @Override
    public String embaralhaString(String palavra) {
        StringBuilder palavraEmbaralhada = new StringBuilder();
        
        for (int i = palavra.length()/2 ; i > 0; i--) 
            palavraEmbaralhada.append(palavra.charAt(i-1));
        
        for (int i = palavra.length(); i > palavra.length()/2; i--)
            palavraEmbaralhada.append(palavra.charAt(i-1));
        
        return (String) palavraEmbaralhada.toString();
        
    }
        
}
