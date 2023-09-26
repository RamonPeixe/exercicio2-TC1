public class Vetores {
    public static int[] somaVetores(int[] vetorA, int[] vetorB){

        int[] vetorC = new int[5];

        for(int i=0; i<5; i++){
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        return vetorC;
    }
}
