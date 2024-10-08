//import java.util.Scanner;
//
//public class SistemaBancario {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Bem-vindo ao Sistema Bancário!");
//        System.out.println("Selecione o tipo de conta: ");
//        System.out.println("1 - Conta Corrente");
//        System.out.println("2 - Conta Poupança");
//        int tipoConta = sc.nextInt();
//
//        if (tipoConta == 1) {
//            ContaCorrente cc = new ContaCorrente("Titular Conta Corrente");
//            menuContaCorrente(cc);
//        } else if (tipoConta == 2) {
//            System.out.print("Informe a taxa Selic atual (%): ");
//            double selic = sc.nextDouble();
//            ContaPoupanca cp = new ContaPoupanca("Titular Conta Poupança", selic);
//            menuContaPoupanca(cp);
//        } else {
//            System.out.println("Opção inválida!");
//        }
//    }
//
//    // Menu para Conta Corrente
//    public static void menuContaCorrente(ContaCorrente conta) {
//        Scanner sc = new Scanner(System.in);
//        int opcao;
//        do {
//            System.out.println("\n--- Menu Conta Corrente ---");
//            System.out.println("1 - Depositar");
//            System.out.println("2 - Sacar");
//            System.out.println("3 - Usar Cheque Especial");
//            System.out.println("4 - Exibir Dados da Conta");
//            System.out.println("5 - Sair");
//            opcao = sc.nextInt();
//
//            switch (opcao) {
//                case 1:
//                    System.out.print("Valor para depósito: R$ ");
//                    double valorDeposito = sc.nextDouble();
//                    conta.depositar(valorDeposito);
//                    break;
//                case 2:
//                    System.out.print("Valor para saque: R$ ");
//                    double valorSaque = sc.nextDouble();
//                    conta.sacar(valorSaque);
//                    break;
//                case 3:
//                    conta.usarChequeEspecial();
//                    break;
//                case 4:
//                    conta.exibirDados();
//                    break;
//                case 5:
//                    System.out.println("Saindo do sistema...");
//                    break;
//                default:
//                    System.out.println("Opção inválida!");
//            }
//        } while (opcao != 5);
//    }
//
//    // Menu para Conta Poupança
//    public static void menuContaPoupanca(ContaPoupanca conta) {
//        Scanner sc = new Scanner(System.in);
//        int opcao;
//        do {
//            System.out.println("\n--- Menu Conta Poupança ---");
//            System.out.println("1 - Depositar");
//            System.out.println("2 - Sacar");
//            System.out.println("3 - Calcular Rendimento");
//            System.out.println("4 - Exibir Dados da Conta");
//            System.out.println("5 - Sair");
//            opcao = sc.nextInt();
//
//            switch (opcao) {
//                case 1:
//                    System.out.print("Valor para depósito: R$ ");
//                    double valorDeposito = sc.nextDouble();
//                    conta.depositar(valorDeposito);
//                    break;
//                case 2:
//                    System.out.print("Valor para saque: R$ ");
//                    double valorSaque = sc.nextDouble();
//                    conta.sacar(valorSaque);
//                    break;
//                case 3:
//                    conta.calcularRendimento();
//                    break;
//                case 4:
//                    conta.exibirDados();
//                    break;
//                case 5:
//                    System.out.println("Saindo do sistema...");
//                    break;
//                default:
//                    System.out.println("Opção inválida!");
//            }
//        } while (opcao != 5);
//    }
//}
//
//// Classe Conta Corrente
//class ContaCorrente {
//    private String titular;
//    private double saldo;
//    private double chequeEspecial = 1000.00;
//
//    public ContaCorrente(String titular) {
//        this.titular = titular;
//        this.saldo = 0.0;
//    }
//
//    public void depositar(double valor) {
//        saldo += valor;
//        System.out.println("Depósito de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
//    }
//
//    public void sacar(double valor) {
//        if (saldo >= valor) {
//            saldo -= valor;
//            System.out.println("Saque de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
//        } else {
//            System.out.println("Saldo insuficiente!");
//        }
//    }
//
//    public void usarChequeEspecial() {
//        System.out.println("Usando cheque especial de R$ 1000,00.");
//        saldo += chequeEspecial;
//        chequeEspecial = 0.0; // Após usar, o cheque especial é "zerado"
//        System.out.println("Saldo atual: R$ " + saldo);
//    }
//
//    public void exibirDados() {
//        System.out.println("Titular: " + titular);
//        System.out.println("Saldo: R$ " + saldo);
//        System.out.println("Cheque Especial disponível: R$ " + chequeEspecial);
//    }
//}
//
//// Classe Conta Poupança
//class ContaPoupanca {
//    private String titular;
//    private double saldo;
//    private double selic;
//
//    public ContaPoupanca(String titular, double selic) {
//        this.titular = titular;
//        this.saldo = 0.0;
//        this.selic = selic;
//    }
//
//    public void depositar(double valor) {
//        saldo += valor;
//        System.out.println("Depósito de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
//    }
//
//    public void sacar(double valor) {
//        if (saldo >= valor) {
//            saldo -= valor;
//            System.out.println("Saque de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
//        } else {
//            System.out.println("Saldo insuficiente!");
//        }
//    }
//
//    public void calcularRendimento() {
//        double rendimento;
//        if (selic > 8.5) {
//            rendimento = 0.005 * saldo;
//        } else {
//            rendimento = 0.007 * selic * saldo;
//        }
//        saldo += rendimento;
//        System.out.println("Rendimento calculado: R$ " + rendimento);
//        System.out.println("Saldo após rendimento: R$ " + saldo);
//    }
//
//    public void exibirDados() {
//        System.out.println("Titular: " + titular);
//        System.out.println("Saldo: R$ " + saldo);
//        System.out.println("Taxa Selic: " + selic + "%");
//    }
//}import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calculo calculo = new Calculo();

        System.out.println("Distancia da corrida(KM): ");
        calculo.setDistancia(sc.nextDouble());

        System.out.println("Tempo de espera(Minutos)");
        calculo.setTempoEspera(sc.nextInt());

        System.out.println("Tarifa base: ");
        calculo.setTarifaBase(sc.nextDouble());

        System.out.println("Fator de demanda: ");
        calculo.setFatorDemanda(sc.nextDouble());

        calculo.calcularValorCorrida();
        calculo.exibirDetalhesCorrida();

    }
}