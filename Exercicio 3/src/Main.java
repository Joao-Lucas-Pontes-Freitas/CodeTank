import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Você deverá criar um programa Java que receberá um número inteiro e desenhará um triângulo equilátero começando pela base utilizando asteriscos. Por exemplo:

        int t = 0;
        System.out.println("Digite o npumero inteiro: ");
        t = sc.nextInt();

        char[][] matriz = new char[t][t];

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                matriz[i][j] = '*';
            }
        }

        int meio1 = t/2;
        int meio2 = meio1;
        int altura = 0;

        for (int i = 0; i < t; i++) {
            for (int j = 0; j <  t; j++) {
                if (j < meio2 && j > meio1) {
                    System.out.print(matriz[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            meio1--;
            meio2++;
            System.out.println();
            altura++;
            if(altura > t/2+1){
                break;
            }
        }

        sc.close();
    }

    public static int[] ordenar(int[] input) {

        return input;
    }
}