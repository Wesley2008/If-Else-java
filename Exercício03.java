package Exercícios;

import java.util.Scanner;

public class Exercício03 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        Double num1, num2;

        System.out.print("Informe um número: ");
        num1 = entrada.nextDouble();
        System.out.print("Informe outro número: ");
        num2 = entrada.nextDouble();

       if(num1 > num2){
        System.out.println(num2 + " menor que " + num1);
       } else if (num2 < num1) {
        System.out.println(num1 + " menor que " + num2 );
       }else{
        System.out.println(" São iguais ");
       }
       entrada.close();
    }
}
