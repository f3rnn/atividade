import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.example.Triangulo;

public class TrianguloTest {
    @Test
    public void testCalcularAreaTriangulo(){
        Triangulo triangulo = new Triangulo(4, 6, 5);
        int area = triangulo.calcularArea();
        System.out.println(area);
        assertEquals(12, area);
    }

    @Test
    public void testCalcularPerimetroTriangulo(){
        Triangulo triangulo = new Triangulo(4, 6, 5);
        int perimetro = triangulo.calcularPerimetro();
        System.out.println(perimetro);
        assertEquals(15, perimetro);
    }
}
