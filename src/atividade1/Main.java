
package atividade1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Funcionario funcionario;
        funcionario = new Funcionario();
        funcionario.setNome("GAbriel");
        funcionario.setMatricula(1);
        funcionario.setTurno("noite");
        funcionario.setSalarioBase(1500);
        funcionario.CalcularSalarioFinal();
    }
}
