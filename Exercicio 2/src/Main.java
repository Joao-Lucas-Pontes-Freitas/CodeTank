import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temperatura_inicial;
        double temperatura_final;

        char unidade_inicial;
        char unidade_final;

        System.out.println("Informe a temperatura: ");
        temperatura_inicial = sc.nextDouble();

        System.out.println("Qual a unidade de origem dessa temperatura? [C, K, F]");
        unidade_inicial = sc.next().charAt(0);

        if (unidade_inicial != 'C' && unidade_inicial != 'K' && unidade_inicial != 'F') {
            System.out.println("Unidade de origem inválida");
            System.exit(1);
        }

        System.out.println("Qual a unidade de destino dessa temperatura? [C, K, F]");
        unidade_final = sc.next().charAt(0);

        if (unidade_final != 'C' && unidade_final != 'K' && unidade_final != 'F') {
            System.out.println("Unidade de destino inválida");
            System.exit(2);
        }

        if (unidade_inicial== 'C' && unidade_final == 'F') {
            temperatura_final = (temperatura_inicial * 9 / 5) + 32;
        }
        else if (unidade_inicial == 'C' && unidade_final == 'K') {
            temperatura_final = 273.15 + temperatura_inicial;
        }
        else if (unidade_inicial == 'F' && unidade_final == 'C') {
            temperatura_final = (temperatura_inicial - 32) * 5 / 9;
        }
        else if (unidade_inicial == 'F' && unidade_final == 'K') {
            temperatura_final = (temperatura_inicial - 32) * 5 / 9 + 273.15;
        }
        else if(unidade_inicial == 'K' && unidade_final == 'C') {
            temperatura_final = temperatura_inicial - 273.15;
        }
        else if(unidade_inicial == 'K' && unidade_final == 'F') {
            temperatura_final = (temperatura_inicial - 273.15) * 9 / 5 + 32;
        }
        else {
            temperatura_final = temperatura_inicial;
        }

        System.out.printf("%.2f %c = %.2f %c\n",temperatura_inicial, unidade_inicial, temperatura_final, unidade_final);

        sc.close();
    }

    public static int[] ordenar(int[] input) {

        return input;
    }
}