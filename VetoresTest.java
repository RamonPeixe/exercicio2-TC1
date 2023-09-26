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

    @Test
    public void testSomaVetoresNegativo(){
        int[] vetorA = {-2, -5, -8, -34, -5};
        int[] vetorB = {-8, -51, -2, -16, -5};
        int[] esperado = {-10, -56, -10, -50, -10};
        int[] obtido = Vetores.somaVetores(vetorA, vetorB);
        assertArrayEquals(esperado, obtido);
    }

    @Test
    public void testSomaVetoresMisto(){
        int[] vetorA = {-10, 0, 10, 20, 30};
        int[] vetorB = {100, 50, 0, -50, -100};
        int[] esperado = {90, 50, 10, -30, -70};
        int[] obtido = Vetores.somaVetores(vetorA, vetorB);
        assertArrayEquals(esperado, obtido);
    }
    @Test
    public void testSomaVetorComZeros(){
        int[] vetorA = {1, 1, 2, 3, 5};
        int[] vetorB = {0, 0, 0, 0, 0};
        int[] esperado = {1, 1, 2, 3, 5};
        int[] obtido = Vetores.somaVetores(vetorA, vetorB);
        assertArrayEquals(esperado, obtido);
    }

    @Test
    public void testSomaVetoresComZero(){
        int[] vetorA = {0, 0, 0, 0, 0};
        int[] vetorB = {0, 0, 0, 0, 0};
        int[] esperado = {0, 0, 0, 0, 0};
        int[] obtido = Vetores.somaVetores(vetorA, vetorB);
        assertArrayEquals(esperado, obtido);
    }

    @Test
    public void testSomaVetoresIguais(){
        int[] vetorA = {8, 13, 21, 34, 55};
        int[] vetorB = {8, 13, 21, 34, 55};
        int[] esperado = {16, 26, 42, 68, 110};
        int[] obtido = Vetores.somaVetores(vetorA, vetorB);
        assertArrayEquals(esperado, obtido);
    }

    @Test
    public void testSomaVetoresInvertidos(){
        int[] vetorA = {13, 14, 21, 22, 23};
        int[] vetorB = {-13, -14, -21, -22, -23};
        int[] esperado = {0, 0, 0, 0, 0};
        int[] obtido = Vetores.somaVetores(vetorA, vetorB);
        assertArrayEquals(esperado, obtido);
    }
}
