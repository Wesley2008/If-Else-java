package Exercícios;

import java.util.Scanner;

public class Exercício01 {
    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, soma, média;
        
        //Entrada de dados
        System.out.print("Informe sua primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.print("Informe sua segunda nota: ");
        nota2 = entrada.nextDouble();
        System.out.print("Informe sua terceira nota: ");
        nota3 = entrada.nextDouble();
        System.out.print("Informe sua quarta nota: ");
        nota4 = entrada.nextDouble();

        //Processamento de dados
        soma = (nota1 + nota2 + nota3 + nota4);
        média = soma / 4;

        //Saída de dados
        System.out.print("Sua média final equivale a: " + média);
       if(média >= 7){
        System.out.println("\n Aprovado! ");
       }else{
        System.out.println("\n Reprovado! ");
       }
       entrada.close();
    }
}
