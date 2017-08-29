package prjcasa;

import prjporta.Porta;


public class Casa {
    private int comodos;
    private String pintura;
    private Porta porta1;
    private Porta porta2;

    public Casa(Porta porta1, Porta porta2){
        this.porta1 = porta1;
        this.porta2 = porta2;
    }
    public int getComodos() {
        return comodos;
    }

    public void setComodos(int comodos) {
        this.comodos = comodos;
    }

    public String getPintura() {
        return pintura;
    }

    public void setPintura(String pintura) {
        this.pintura = pintura;
    }
    
    public void listarDescricao(){
        System.out.println("Dados da Casa comprada");
        System.out.println("Pintura Externa: " + pintura);
        System.out.println("Quantidade do comodos: " + comodos);
        System.out.println("Casa Possui duas portas");
        this.porta1.listarPorta();
        this.porta2.listarPorta();
        System.out.println("");
    }
    
}
