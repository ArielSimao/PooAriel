
package controleponto;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class RegistroPonto{
    
    Funcionario func;
    
    private long idRegPonto;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;
    
    
    
    public long getIdRegPonto(){
        return idRegPonto;
    }
    
    public void setIdRegPonto(){
        this.idRegPonto = idRegPonto;
    }
    
    
    
    //Funcionario
    public Funcionario getFunc(){
        return func;
    }
    
    public void setFunc(Funcionario func){
        this.func = func;
    }
    
    
    //LOCAL DATES
    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro() {
        this.dataRegistro = LocalDate.now();
    }

    
    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada() {
        this.horaEntrada = LocalDateTime.now();
    }
    
    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

     public void setHoraSaida() {
        this.horaSaida = LocalDateTime.now();
     }
     
    public void apresentarRegistroPonto(Funcionario func) throws InterruptedException{
        setHoraEntrada();
        setDataRegistro();
        System.out.println("Nome: " + func.getNome());
        System.out.println("Data de registro: " + dataRegistro);
        System.out.println("Horario de entrada: " + horaEntrada);
        Thread.sleep(1000);
        setHoraSaida();
        System.out.println("Horario de saida: " + horaSaida);
        System.out.println("===================================");
    }
}
