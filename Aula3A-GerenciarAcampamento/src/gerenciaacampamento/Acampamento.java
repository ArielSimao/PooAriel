
package gerenciaacampamento;

public class Acampamento {
    private String nome;
    private char equipe;
    private int idade;
    
    public void imprimir(){
        System.out.println("-------------------------");
        System.out.println("Nome do acampante "+nome);
        System.out.println("Idade do acampante "+idade);
        System.out.println("Equipe do acampante "+equipe);
        System.out.println("-------------------------");
    }
    public void separaGrupo(){
        if(idade < 6)
            equipe = '-';
        else
            if(idade < 11)
                equipe = 'A';
            else
                if(idade < 21)
                    equipe = 'B';
                else
                    equipe = 'C';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
