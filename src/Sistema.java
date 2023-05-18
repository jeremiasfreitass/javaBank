import java.util.Scanner;

/*
************************
Dados iniciais do cliente:

Nome: Jacqueline Oliveira
Tipo conta: Corrente
Saldo inicial: R$ 2500,00

************************

Operações

1- Consultar saldos
2- Depositar valor
3- Transferir valor
4- Sair

Digite a opção desejada:

* */
public class Sistema {
    public static void main(String[] args) {

        String nome = "Jeremias Freitas";
        String tipoConta = "Corrente";
        double saldo = 1700.25;

        int opcao = 0;
        Scanner leitura = new Scanner(System.in);

        double valorDepositado = 0.0;
        double valorTransferencia = 0.0;


        System.out.println("\nBem vindo ao JavaBank!\n");

        System.out.println("***************************");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo Inicial: " + saldo);
        System.out.println("***************************");


        String menu = """
                Operações:\n
                1 - Consultar saldo
                2 - Depositar valor
                3 - Transferir valor
                4 - Sair
                \nDigite sua opção:                
                """;

        while (opcao != 4) {

            if (opcao < 0 || opcao > 4) {
                System.out.println("\n!!! Opção inválida!!!");
            }
            System.out.print("\n" + menu);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a depositar");
                    valorDepositado = leitura.nextDouble();
                    saldo += valorDepositado;
                    System.out.print("Saldo Atual: " + saldo);
                    break;
                case 3:
                    //transfereValor(valorTransferencia);
                    break;
                case 4:
                    //sair();
                    break;
            }
        }
    }
}


/*
    static void depositaValor(double valor){

    }
    static double consultaValor(){
        return 0;
    }

    static double transfereValor(double valorTransferencia){
        return saldo -= valorTransferencia;
    }
    static void sair(){}

 */
