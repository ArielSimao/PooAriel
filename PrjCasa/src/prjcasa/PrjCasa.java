package prjcasa;

import prjporta.Porta;

public class PrjCasa {

   
    public static void main(String[] args) {
        // TODO code application logic here
        //Definir duas portas
        Porta pa = new Porta();
        Porta pb = new Porta("Laranja");
        pa.setAltura(180);
        pa.setLargura(100);
        pa.setProfundidade(6);
        
        pb.setAltura(210);
        pb.setLargura(100);
        pb.setProfundidade(7);
        
        pa.listarPorta();
        pb.listarPorta();
        System.out.printf("\n\n\n");
        
        Casa casa = new Casa(pa, pb);
        casa.setComodos(3);
        casa.setPintura("Branco Sereno");
        casa.listarDescricao();
        
    }
    
}
