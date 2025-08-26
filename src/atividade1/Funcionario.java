///Exercício 1: Funcionário da Fábrica///
///Crie uma classe Funcionario que represente um trabalhador de uma indústria. A
///classe deve ter atributos para nome, matrícula, turno (manhã, tarde, noite) e salário///
///basse. Implemente métodos para calcular o salário final (considerando adicional noturno
///de 20% para turno da noite) e exibir os dados do funcionário.///

package atividade1;

public class Funcionario {

        private String nome;
        private int matricula;
        private String turno;
        private double salarioBase;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void CalcularSalarioFinal() {
            if (turno.equalsIgnoreCase("noite")) {
                salarioBase = salarioBase * 1.2;
                System.out.println("Nome:" + nome +
                        " Matricula:" + matricula +
                        " Turno:"+ turno +
                        " Salario Base:" + salarioBase);
            } else if (turno.equals("tarde")) {
                System.out.println("Nome:" + nome +
                        " Matricula:" + matricula +
                        " Turno:"+ turno +
                        " Salario Base: " + salarioBase);
            } else if (turno.equals("manhã")) {
                System.out.println("Nome:" + nome +
                        " Matricula:" + matricula +
                        " Turno:"+ turno +
                        " Salario Base:" + salarioBase);

            }
        }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", turno='" + turno + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
