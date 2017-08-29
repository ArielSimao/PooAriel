package aula0203_prjacampamento;


public class Acampamento {
    private String nome;
    private char equipe;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getEquipe() {
        return equipe;
    }

    public void setEquipe(char equipe) {
        this.equipe = equipe;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Equipe: " + equipe);
        System.out.println("");
    }
    public void separarGrupo(){
        if(idade<6){
            equipe = '-';
            return;
        }
        if(idade<=10){
            equipe = 'A';
            return;
        }
        if(idade<=20){
            equipe = 'B';
            return;
        }
        equipe = 'C';
    }
}