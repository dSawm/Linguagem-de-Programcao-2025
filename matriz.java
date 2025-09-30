
public class matriz {

    public static void main(String[] args) {

        int linha = 3;
        int coluna = 3;
        int n = 0;

        int[][] matriz = new int[linha][coluna];

        matriz(matriz, linha, coluna);

        imprimirMatriz(matriz);

        int somaElementos = somaElementosMatriz(matriz);
        System.out.println("A soma dos elementos é: " + somaElementos);

        int somaLinha = somaElementosLinha(matriz, n);
        System.out.println("A soma dos elementos da linha é: " + somaLinha);

    }

    public static int[][] matriz(int[] [] matriz, int linha, int coluna) {

        int valores = 10;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = valores;
                valores += 10;

            }

        }

        return matriz;

    }

    public static void imprimirMatriz(int[] [] matriz){

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.println(matriz[i] [j]);
                
            }
            
        }

    }

    public static int somaElementosMatriz(int[] [] matriz ){

        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                
                soma += matriz[i] [j];

            }
    
        }

        return soma;
        
    }

    public static int somaElementosLinha(int[] [] matriz, int n){

        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            
            soma += matriz [n] [i];

        }

        return soma;

    }

    

    //fazer maior elemento posicao
    //fazer soma todas as linhas


}
