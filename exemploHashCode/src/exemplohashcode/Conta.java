
package exemplohashcode;



/**
 *
 * @author maromo
 */
public class Conta implements Comparable<Conta> {
    public int id;
    public String nome;
    public double saldo;

    @Override
    public int hashCode() {
        return this.nome.length();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Conta other = (Conta) obj;
        if (!this.nome.equals(other.nome)) {
            return false;
        }
        return true;
    }
    
    public void imprimir(){
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("");
    }

    @Override
    public int compareTo(Conta o) {
       return  this.nome.compareTo(o.nome);
    }
    
    
}
