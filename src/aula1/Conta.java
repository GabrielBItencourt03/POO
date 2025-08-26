package aula1;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

//servir de molde
public class Conta {
    int numero;
    String titular;
    double saldo;
    //funções da conta
    public void imprimirDados() {//conta.imprimirDados
        System.out.println("*** Dados da Conta ***");
        System.out.println("Numero: " + this.numero);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);

    }
    public void sacar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto você deseja sacar?");
        double valorSaque = scanner.nextDouble();
        if (saldo >= valorSaque) {
        this.saldo -= valorSaque;
        System.out.println("Saldo atual: " + this.saldo);}
        else System.out.println("Saldo indisponivel");

    }
    public void depositar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto você quer depositar?");
        double valorDeposito = scanner.nextDouble();
        this.saldo += valorDeposito;
        System.out.println("Saldo atual: " + this.saldo);
    }
}