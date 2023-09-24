package Exercícios;

import java.util.Scanner;

public class Exercício11 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double salario, aumento, novoSalario;

        System.out.print("Informe seu salário: R$ ");
        salario = entrada.nextDouble();

        if(salario <= 300){
            novoSalario = salario * 1.15;
            System.out.print("Seu novo salário será: " +novoSalario);
        }else if((salario > 300)&&(salario <600)){
            novoSalario = salario * 1.10;
            System.out.print("Seu novo salário será: " +novoSalario);
        }else if((salario >= 600)&&(salario <= 900)){
            novoSalario = salario * 1.05;
            System.out.print("Seu novo salário será: " +novoSalario);
        }else{
            System.out.print("Você não receberá aumento!");
        }
        entrada.close();
    }
    
}
