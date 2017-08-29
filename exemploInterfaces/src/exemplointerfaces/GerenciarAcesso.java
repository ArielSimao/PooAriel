
package exemplointerfaces;

import java.util.ArrayList;
import java.util.List;


public class GerenciarAcesso {
    private static int totalAcesso = 0;
    private static List<Logavel>listaLogados = new ArrayList<>();
    
    //Métodos polimorficos
    public void acessar(Logavel obj){
        listaLogados.add(obj);
        totalAcesso++;
    }
    public void logoff(Logavel obj){
        listaLogados.remove(obj);
        totalAcesso--;
    }
    public int getTotalAcesso(){
        return totalAcesso;
    }
    public List<Logavel> getLista(){
        return listaLogados;
    }
}
