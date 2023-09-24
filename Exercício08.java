package Exercícios;

import java.util.Scanner;

public class Exercício08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, novoSalario;

        System.out.print("Informe seu salário R$: ");
        salario = entrada.nextDouble();

        if(salario <300){
            novoSalario = salario * 1.35;
        }else{
            novoSalario = salario * 1.15;
        }
        System.out.print("Seu novo salário é R$: " + novoSalario);
        entrada.close();
    }
}