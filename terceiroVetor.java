import java.util.Scanner;

public class terceiroVetor {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        int N = 6;

        int[] vetor1 = criarVetor(N);
        System.out.println("Vetor 1");
        imprimirVetor(vetor1);

        int[] vetor2 = criarVetor(N);
        System.out.println("Vetor 2");
        imprimirVetor(vetor2);

        int[] vetor3 = somarVetor(vetor1, vetor2, N);
        System.out.println("Vetor 3");
        imprimirVetor(vetor3);

        int numero = 5;
        imprimirMaiores(vetor3, numero);
        imprimirMaiores(vetor2, numero);
        imprimirMaiores(vetor1, numero);

        int[] vetor4  = inverterVetor(vetor1);
        System.out.println("Vetor 1 invertido");
        imprimirVetor(vetor4);

    }

    public static int[] criarVetor(int tamanho) {

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {

            vetor[i] = LER.nextInt();

        }

        return vetor;

    }

    public static void imprimirVetor(int[] vetor1) {

        for (int i = 0; i < vetor1.length; i++) {

            System.out.printf(" %d ", vetor1[i]);

        }

        System.out.println();

    }

    public static int[] somarVetor(int[] vetor1, int[] vetor2, int tamanho) {

        int[] vetor3 = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {

            vetor3[i] = vetor1[i] + vetor2[i];
            
        }

        return vetor3;

    }

    public static void imprimirMaiores(int[] v, int numero) {

        for (int i = 0; i < v.length; i++) {

            if (v[i] > numero) {

                System.out.printf(" %d ", v[i]);
                
            }
            
        }

    }

    public static int[] inverterVetor(int[] v) {

        int[] vetorInvertido = new int [v.length];
        int tamanho = v.length;

        for (int i = 0; i < tamanho; i++) {

            vetorInvertido[tamanho - 1] = vetorInvertido[i];
            
        }

        return vetorInvertido;

    }

}

//zelda ocarina of time, mario party 3, pokemon soulsilver version, zelda a link to the past  four swords, zelda the minish cap, kirby 