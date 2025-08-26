package aula1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        Conta conta;
        //construir um objeto conta
        conta = new Conta();
        conta.numero = 01;
        conta.titular = "Gabriel";
        conta.saldo = 1020;
        conta.imprimirDados();
        //Cria uma conta2
        //pedir o usario digitar os dados
        Conta conta2;
        conta2 = new Conta();
        System.out.println("Digite o numero da conta:");
        conta2.numero = scanner.nextInt();
        System.out.println("Digite o titular da conta: ");
        conta2.titular = scanner.next();
        conta2.saldo = 0;
        conta2.depositar();
        conta2.sacar();
        conta2.imprimirDados();

    }
}

