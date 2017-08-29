
package novojogopalavrasembaralhadas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class BancoDePalavras {
    FileReader arquivo;
    BufferedReader palavra;
    private ArrayList<String> listaDePalavras = new ArrayList<String>();
    
    BancoDePalavras(){
        getPalavraArquivo();
    }
    
    private void getPalavraArquivo(){
        try{
        arquivo = new FileReader("/home/stephane/Área de Trabalho/Palavras.txt");
        palavra = new BufferedReader(arquivo);
        while(palavra.ready()){
            listaDePalavras.add(palavra.readLine());
        }
        }catch(FileNotFoundException ex){
            System.out.println("Arquivo não encontrado " +ex);
        }catch(Exception ex){
            System.out.println("Problemas com arquivo " +ex);
        }
    }
    
    public String getPalavraAleatoria(){
        Random r = new Random(System.currentTimeMillis());
        return (listaDePalavras.get(Math.abs(r.nextInt() % listaDePalavras.size())));
    }
    
}
