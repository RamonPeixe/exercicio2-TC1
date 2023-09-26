import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class VetoresTest {

    @Test
    public void testSomaVetoresPositivo(){
        int[] vetorA = {2, 5, 8, 34, 5};
        int[] vetorB = {8, 51, 2, 16, 5};
        int[] esperado = {10, 56, 10, 50, 10};
        int[] obtido = Vetores.somaVetores(vetorA, vetorB);
        assertArrayEquals(esperado, obtido);
    }
}
