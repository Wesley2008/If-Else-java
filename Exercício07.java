package Exercícios;

import java.util.Scanner;

public class Exercício07 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double salario, novoSalario;
        int porcentagem=30;

        System.out.print("Informe seu salário R$: ");
        salario = entrada.nextDouble();

        novoSalario = (salario * porcentagem) /100;
        novoSalario = salario + novoSalario;

        if(salario<500){
            System.out.print("Seu novo salário é: " + novoSalario );
        }else{
            System.out.print("Você não receberá aumento! ");
        }
        entrada.close();
    }
    
}
