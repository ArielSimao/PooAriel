
package novojogopalavrasembaralhadas;

import java.util.ArrayList;
import java.util.Random;

public class FabricaEmbaralhador {
    private static ArrayList<Embaralhador> listaEmbaralhador = new ArrayList<Embaralhador>();
    
    static{
        listaEmbaralhador.add(new EmbaralhadorInversor());
        listaEmbaralhador.add(new EmbaralhadorInversorPelaMetade());
        listaEmbaralhador.add(new EmbaralhadorTrocaParidade());
    }
    
    public static Embaralhador getEmbaralhador(){
        Random r = new Random(System.currentTimeMillis());
        return listaEmbaralhador.get(Math.abs(r.nextInt() % listaEmbaralhador.size()));
    }
           
}
