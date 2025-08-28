import java.util.Scanner;

public class segundoVetor {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        int qtdAlunos = 0;
        int somaNotas = 0;
        int media = 0;

        qtdAlunos = LER.nextInt();

        media = (gerarMediaAlunos(qtdAlunos, somaNotas) / qtdAlunos);

        System.out.println(media);

    }

    public static int gerarMediaAlunos(int qtdAlunos, int somaNotas) {

        int[] notas = new int[qtdAlunos];

        for (int i = 0; i < notas.length; i++) {

            notas[i] = lerInt();

        }

        for (int j = 0; j < notas.length; j++) {

            somaNotas += notas[j];

        }

        return somaNotas;
    }

    public static int lerInt() {

        int valor = 0;

        valor = LER.nextInt();

        return valor;

    }

}