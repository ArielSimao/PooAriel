package exemploordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacao {

    public static void main(String[] args) {
        // TODO code application logic here
        List<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Oscar");
        lista.add("Ana");
        lista.remove(1);
        while(lista.contains("Ana"))
            lista.remove("Ana");
        lista.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(lista);
        

    }

}
