import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.example.Circulo;

public class CirculoTest {
    @Test
    public void testCalcularAreaCirculo(){
        Circulo circulo = new Circulo(5);
        double area = circulo.calcularArea();
        System.out.println(area);
        assertEquals(78, area);
    }

    @Test
    public void testCalcularPerimetroCirculo(){
        Circulo circulo = new Circulo(5);
        double perimetro = circulo.calcularPerimetro();
        System.out.println(perimetro);
        assertEquals(31, perimetro);
    }
}
