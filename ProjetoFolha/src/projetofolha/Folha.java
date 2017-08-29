package projetofolha;

public class Folha {

    public int idFunc;
    public String nomeFunc;
    private double salario; //Só adm ve e altera

    public double getSalario(Tipo tpUsuario) {
        if (tpUsuario == Tipo.administrador) {
            return salario;
        }
        return 0.0;
    }

    public void setSalario(double salario, Tipo tpUsuario) {
        if(tpUsuario == Tipo.administrador){
            this.salario = salario;
        }
    }

}
