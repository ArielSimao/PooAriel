
package novojogopalavrasembaralhadas;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestEmbaralhadorInversor {
    
    
    @Test
    public void TestEmbaralhadorInversor() {
        Embaralhador e = new EmbaralhadorInversor();
        String palavra = e.embaralhaString("Arroz");
        assertEquals("zorrA", palavra);
    }
    @Test
    public void TestEmbaralhadorInversorPelaMetade() {
        Embaralhador e = new EmbaralhadorInversorPelaMetade();
        String palavra = e.embaralhaString("Arroz");
        assertEquals("rAzor",palavra);
    }
    @Test
    public void TestEmbaralhadorTrocaParidade() {
        Embaralhador e = new EmbaralhadorTrocaParidade();
        String palavra = e.embaralhaString("Arroz");
        assertEquals("rAorz",palavra);
    }
    
    
}
