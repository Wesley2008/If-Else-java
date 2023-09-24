package Exercícios;

import java.util.Scanner;

public class Exercício06 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        double elevado, raizQua1, raizQua2, raizCubi1, raizCubi2;
        int opcao=1, num1, num2;
        System.out.println(
       "\n Escolha uma opção: " +
       "\n 1: O primeiro número elevado ao segundo número. " + 
       "\n 2: Raiz quadrada de cada um dos números. " +
       "\n 3: Raiz cúbica de cada um dos números. "
        );
        System.out.print("Escolha uma opção: ");
        opcao = entrada.nextInt();
        switch(opcao){

            case 1:
            System.out.print("Insira um número: ");
        num1 = entrada.nextInt();
        System.out.print("Insira um segundo número: ");
        num2 = entrada.nextInt();
        elevado = Math.pow(num1, num2);
        System.out.print("O valor dos números elevados é: " + elevado);
        break;
        
        case 2:
        System.out.print("Insira um número: ");
        num1 = entrada.nextInt();
        System.out.print("Insira um segundo número: ");
        num2 = entrada.nextInt();
        raizQua1 = Math.sqrt(num1);
        raizQua2 = Math.sqrt(num2);
        System.out.print("\n A raiz quadrada do primeiro número equivale a: " + raizQua1);
        System.out.print("\n A raiz quadrada do segundo número equivale a: " + raizQua2);
        break;

        case 3:
        System.out.print("Insira um número: ");
        num1 = entrada.nextInt();
        System.out.print("Insira um segundo número: ");
        num2 = entrada.nextInt();
        raizCubi1 = Math.cbrt(num1);
        raizCubi2 = Math.cbrt(num2);
        System.out.print("\n A raiz cúbica do primeiro número equivale a: " + raizCubi1);
        System.out.print("\n A raiz cúbica do segundo número equivale a: " + raizCubi2);
        break;
        }
        if((opcao>=1) && (opcao<=3)){
            System.out.println();
        }else{
            System.out.print("Opção inválida!");
        }
        entrada.close();
    }
}