import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

import br.com.example.Quadrado;

public class QuadradoTest {
    @Test
    public void  testCalcularAreaQuadrado(){
        Quadrado quadrado = new Quadrado(5);
        int area = quadrado.calcularArea();
        System.out.println(area);
        assertEquals(25, area);
    }

    @Test
    public void testCalcularPerimetroQuadrado(){
        Quadrado quadrado = new Quadrado(5);
        int perimetro = quadrado.calcularPerimetro();
        System.out.println(perimetro);
        assertEquals(20, perimetro);
    }
}
