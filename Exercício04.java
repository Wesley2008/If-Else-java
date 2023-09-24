package Exercícios;

import java.util.Scanner;

public class Exercício04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double num1, num2, num3;

        System.out.print("Informe um número: ");
        num1 = entrada.nextDouble();
        System.out.print("Informe um segundo número: ");
        num2 = entrada.nextDouble();
        System.out.print("informe um ultimo número: ");
        num3 = entrada.nextDouble();

        if((num1 > num2) && (num1 > num3)){
            System.out.print(num1 + " é o maior ");
        }
        if((num2 > num1) && (num2 > num3)){
            System.out.print( num2 + " é o maior ");
        }
        if((num3 > num1) && (num3 > num2)){
            System.out.print(num3 + " é o maior ");
        }else{
            System.out.print(" São números iguais! ");
        }
        entrada.close();
    }
}
