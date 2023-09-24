package Exercícios;

import java.util.Scanner;

public class Exercício05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Double num1, num2, média, divisão, subtração, multiplicação;
        int opcao=1;

        System.out.print(
         "\n Escolha uma opção: " +
         "\n 1: Média entre os números digitados " +
         "\n 2: Diferença do maior pelo menor " +
         "\n 3: Produto entre os números digitados " +
         "\n 4: Divisão do primeiro pelo segundo " 
         );
         System.out.print("\n Escolha uma das opções: ");
         opcao = entrada.nextInt();
        switch(opcao){

            case 1:
            System.out.print("Insira um número: ");
            num1 = entrada.nextDouble();
            System.out.print("Insira outro número: ");
            num2 = entrada.nextDouble();
            média = (num1 + num2) /2;
            System.out.print("Sua média final equivale a: " + média);
            break;

            case 2:
            System.out.print("Insira um numero: ");
            num1 = entrada.nextDouble();
            System.out.print("Insira outro número: ");
            num2 = entrada.nextDouble();
            subtração = num1 - num2;
            System.out.print("A diferença do maior pelo menor equivale a: " + subtração);
            break;

            case 3:
            System.out.print("Insira um número: ");
            num1 = entrada.nextDouble();
            System.out.print("Insira outro número: ");
            num2 = entrada.nextDouble();
            multiplicação = num1 * num2;
            System.out.println();
            break;

            case 4:
             System.out.print("Insira um número: ");
            num1 = entrada.nextDouble();
            System.out.print("Insira outro número: ");
            num2 = entrada.nextDouble();
            divisão = num1 / num2;
            System.out.print("A divisão equivale a: " + divisão );
            break;
        }
        if((opcao>=1)&&(opcao<=4)){
            System.out.println();
        }else{
            System.out.print("Opção inválida!");
        }
        entrada.close();
    }
}