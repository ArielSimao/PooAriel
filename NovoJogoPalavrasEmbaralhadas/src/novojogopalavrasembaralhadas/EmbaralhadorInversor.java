
package novojogopalavrasembaralhadas;

public class EmbaralhadorInversor implements Embaralhador{
    
    @Override
    public String embaralhaString(String palavra) {
        StringBuilder palavraEmbaralhada = new StringBuilder();
        
        for (int i = palavra.length(); i > 0 ; i--)
            palavraEmbaralhada.append(palavra.charAt(i-1));
        
        return (String) palavraEmbaralhada.toString();
    }
}
