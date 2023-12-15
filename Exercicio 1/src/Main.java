import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total_saldo_devedor;
        int total_de_meses;
        double juros_mensal;
        double saldo_devedor_atual;
        double juros_ao_mes;
        double parcela_mensal;

        double soma_prestacao = 0;
        double soma_juros = 0;
        double soma_amortizacao = 0;

        System.out.print("\nDigite o valor do empréstimo: ");
        total_saldo_devedor = sc.nextDouble();
        saldo_devedor_atual = total_saldo_devedor;

        System.out.print("Digite a taxa de juros do empréstimo: ");
        juros_ao_mes = sc.nextDouble();
        juros_ao_mes /= 100;

        System.out.print("Digite o tempo para pagamento: ");
        total_de_meses = sc.nextInt();

        final double amortizacao = total_saldo_devedor / total_de_meses;

        System.out.printf("\nValor total fixo da amortização R$ %.2f, Saldo devedor total: R$ %.2f com um juros de %.1f%% ao mês\n", amortizacao, total_saldo_devedor, juros_ao_mes);

        for (int i = 0; i < total_de_meses; i++) {
            juros_mensal = saldo_devedor_atual * juros_ao_mes;
            parcela_mensal = juros_mensal + amortizacao;
            saldo_devedor_atual = saldo_devedor_atual - amortizacao;

            soma_prestacao += parcela_mensal;
            soma_juros += juros_mensal;
            soma_amortizacao += amortizacao;

            System.out.printf("Parcela %d | Juros: R$ %.2f | Prestação R$ %.2f | Saldo devedor: R$ %.2f\n", (i+1), juros_mensal, parcela_mensal, saldo_devedor_atual);
        }

        System.out.printf("\nTotal: Prestação R$ %.2f, Juros R$ %.2f, Amortização R$ %.2f\n", soma_prestacao, soma_juros, soma_amortizacao);

        sc.close();
    }
}