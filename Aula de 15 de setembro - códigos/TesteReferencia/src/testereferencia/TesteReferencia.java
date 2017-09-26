package testereferencia;

public class TesteReferencia {

    int x;
    int y;
    
    public static void main(String[] args) {
        TesteReferencia tr1 = new TesteReferencia();
        System.out.println(Math.PI);
        System.out.println(Math.pow(5.0, 2.0));
        TesteReferencia tr2 = new TesteReferencia();
        tr1.x = 10;
        tr1.y = 11;
        tr2.x = 11;
        tr2.y = 12;
        
        tr1 = tr2;
        tr1.x = 120;
        System.out.println(tr1.x);
        System.out.println(tr1.y);
        System.out.println(tr2.x);
        System.out.println(tr2.y);
        String texto = "Maromo";
        tr2.passagem(texto);
        System.out.println(texto);
    }
    
    public void passagem(String t){
       t = "maria";
    }
    
}
