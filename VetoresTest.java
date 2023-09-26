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

    @Test
    public void testSomaVetoresReversos(){
        int[] vetorA = {1, 2, 3, 4, 5};
        int[] vetorB = {5, 4, 3, 2, 1};
        int[] esperado = {6, 6, 6, 6, 6};
        int[] obtido = Vetores.somaVetores(vetorA, vetorB);
        assertArrayEquals(esperado, obtido);
    }

    @Test
    public void testSomaVetoresMuitoGrandes(){
        int[] vetorA = {12345678, 87654321, 1010101010, 5555555, 11422134};
        int[] vetorB = {11234567, 88765432, 1101010101, 7777777, 88888888};
        int[] esperado = {23580245, 176419753, 2111111111, 13333332, 100311022};
        int[] obtido = Vetores.somaVetores(vetorA, vetorB);
        assertArrayEquals(esperado, obtido);
    }

    @Test
    public void testSomaVetoresNumerosComecandoComZero(){
        int[] vetorA = {01, 02, 03, 04, 05};
        int[] vetorB = {1, 2, 3, 4, 5};
        int[] esperado = {2,4,6,8,10};
        int[] obtido = Vetores.somaVetores(vetorA, vetorB);
        assertArrayEquals(esperado, obtido);
    }
}
