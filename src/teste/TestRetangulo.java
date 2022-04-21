package teste;

import dominio.Retangulo;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestRetangulo {
    @Test
    public void testArea() {
          Retangulo calc = new Retangulo(6,2); 
          assertEquals(8, calc.area(), 0);
        }
    
    @Test
    public void testPerimetro() {
          Retangulo calc = new Retangulo(6,2); 
          assertEquals(4, calc.perimetro(), 0);
        }
}
