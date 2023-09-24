package Exercícios;

import java.util.Scanner;

public class Exercício14 {
    public static void main(String[] args) {
        
    
    Scanner entrada = new Scanner(System.in);
    double salario, novoSalario;

    System.out.print("Informe seu salário: R$ ");
    salario = entrada.nextDouble();

    if(salario <= 300){
        novoSalario = salario * 1.50;
        System.out.print("Seu novo salário será de: R$ " +novoSalario);
    }
     else if((salario > 300)&&(salario <= 500)){
        novoSalario = salario * 1.40;
        System.out.print("Seu novo salário será de: R$ " +novoSalario);
    }
     else if((salario > 500)&&(salario <= 700)){
        novoSalario = salario * 1.30;
        System.out.print("Seu novo salário será de: R$ " +novoSalario);
    }
     else if((salario > 700)&&(salario <= 800)){
        novoSalario = salario * 1.20;
        System.out.print("Seu novo salário será de: R$ " +novoSalario);
    }
     else if((salario > 800)&&(salario <= 1000)){
        novoSalario = salario * 1.10;
        System.out.print("Seu novo salário será de: R$ " +novoSalario);
    }
     else{
        novoSalario = salario * 1.05;
        System.out.print("Seu novo salário será de: R$ " +novoSalario);
    }
    entrada.close();
    } 
}
