import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.example.Retangulo;

public class RetanguloTest {
    @Test
    public void testCalcularArea(){
        Retangulo retangulo = new Retangulo(5, 10);
        int area = retangulo.calcularArea();
        System.out.println(area);
        assertEquals(50, area);
    }

    @Test
    public void testCalcularPerimetro(){
        Retangulo retangulo = new Retangulo(5,10);
        int perimetro = retangulo.calcularPerimetro();
        System.out.println(perimetro);
        assertEquals(30, perimetro);
    }
}