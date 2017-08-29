package prjfuncionarios;

public class Funcionario {
    public String nome;
    public String departamento;
    public double salario;
    public String rg;
    public boolean estaNaEmpresa;
    
    public void bonificar(double aumento){
        salario+= aumento;
    }
    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: " + salario);
        System.out.println("RG: " + rg);
        if(estaNaEmpresa){
            System.out.println("Funcionário Ativo");
        }else{
            System.out.println("Funcionário Inativo");
        }
    }
}
