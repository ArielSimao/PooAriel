
package novojogopalavrasembaralhadas;

import java.util.ArrayList;
import java.util.Random;

public class FabricaMecanicaDoJogo {
    private static ArrayList<MecanicaDoJogo> listaMecanica = new ArrayList<MecanicaDoJogo>();
    static{
        listaMecanica.add(new MecanicaDoJogoCincoVidas());
        listaMecanica.add(new MecanicaDoJogoMorteSubita());
        listaMecanica.add(new MecanicaDoJogoTemporizador());        
    }
    public static MecanicaDoJogo getMecanicaDoJogo(){
        Random r = new Random(System.currentTimeMillis());
        return listaMecanica.get(Math.abs(r.nextInt() % listaMecanica.size()));
    }
}
