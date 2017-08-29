package exemplohashcode;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ExemploHashCode {

    public static void main(String[] args) {
        // TODO code application logic here
        Conta c1 = new Conta();
         c1.id = 777;
         c1.nome = "Ana";
         c1.saldo = 700;
         Conta c2 = new Conta();
         c2.id = 349;
         c2.nome = "Ana";
         c2.saldo = 600;
         Conta c3 = new Conta();
         c3.id = 345;
         c3.nome = "Selma";
         c3.saldo = 100;
         Conta r = new Conta();
         r.id = 777;
         r.nome = "Ana";
        List<Conta> lista = new ArrayList<>();
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        lista.remove(r);
        for (Conta item : lista) {
            item.imprimir();
        }
        
        
        
        

    }

}
