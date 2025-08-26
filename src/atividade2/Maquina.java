package atividade2;

/*Exercício 2: Máquina de Produção
Desenvolva uma classe Maquina que modele uma máquina industrial. Ela deve ter
atributos para identificação, capacidade máxima de produção por hora e status
(ligada/desligada). Crie métodos para ligar/desligar a máquina e calcular a produção
diária baseada em horas trabalhadas.*/

 public class Maquina {

     private String modelo;
     private double capacidadeMaximaProducaoPorHora;
     private Boolean status = false;
     private double horasTrabalhadas;
     private double producaoDiria;

     public void producaoDiaria(){
        producaoDiria = capacidadeMaximaProducaoPorHora * horasTrabalhadas;
     }
    //metodo ligar maquina

     public void ligarMaquina(){
         status = true;
         System.out.println("Maquina ligada.");
     }
     //metodo desligar maquina
     public void desligarMaquina(){
         status = false;
         System.out.println("Maquina desligada.");
     }

 }
