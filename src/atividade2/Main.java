package atividade2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Maquina maquina;
        maquina = new Maquina();
        maquina.producaoDiaria();
        maquina.ligarMaquina();
        maquina.desligarMaquina();
    }
}
