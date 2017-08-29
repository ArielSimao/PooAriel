package aula1603;

public class Aula1603 {

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(5,5,5);
        //
        System.out.println("");
        Triangulo t2 = new Triangulo();
        t2.setLado1(7);
        t2.setLado2(5);
        t2.setLado3(5);
        t2.verificarTipoDeTriangulo();
        
        Triangulo t3 = new Triangulo(7,5);
        System.out.println("Lado 1:  " + t3.getLado1());
    }
    
}
