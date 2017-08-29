
package novojogopalavrasembaralhadas;

public class EmbaralhadorTrocaParidade implements Embaralhador{

    @Override
    public String embaralhaString(String palavra) {
        StringBuilder palavraEmbaralhada = new StringBuilder();
        for (int i = 0; i < palavra.length(); i++) {
            if(i % 2 != 0){
                palavraEmbaralhada.append(palavra.charAt(i));
                palavraEmbaralhada.append(palavra.charAt(i-1));
            }
            else 
                if(i == palavra.length()-1)
                    palavraEmbaralhada.append(palavra.charAt(i));
        }
        return (String) palavraEmbaralhada.toString();
    }
    
}
