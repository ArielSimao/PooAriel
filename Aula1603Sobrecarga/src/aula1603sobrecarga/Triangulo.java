package aula1603sobrecarga;

public class Triangulo {

    private int l1;
    private int l2;
    private int l3;

    public int getL1() {
        return l1;
    }

    public void setL1(int l1) {
        this.l1 = l1;
    }

    public int getL2() {
        return l2;
    }

    public void setL2(int l2) {
        this.l2 = l2;
    }

    public int getL3() {
        return l3;
    }

    public void setL3(int l3) {
        this.l3 = l3;
    }

    public Triangulo() {
        l1 = 5;
        l2 = 5;
        l3 = 5;
    }

    public Triangulo(int l1, int l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public Triangulo(int l3) {
        this();
        this.l3 = l3;
    }
    public void imprimir(){
        System.out.println("Lado 1: " + l1);
        System.out.println("Lado 2: " + l2);
        System.out.println("Lado 3: " + l3);
    }
}
