package Exercícios;

import java.util.Scanner;

public class Exercício02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      Double  nota1, nota2, média;

      System.out.print("Informe sua primeira nota: ");
      nota1 = entrada.nextDouble();
      System.out.print("Informe sua segunda nota: ");
      nota2 = entrada.nextDouble();

      média = (nota1 + nota2) /2;
      
      System.out.print("Sua média final equivale a: " + média );
      if((média >= 0) && (média < 3)) {
        System.out.println(" Reprovado! ");
      }
      if((média >= 3) && (média <7)){
        System.out.println(" Exame!  ");
      }
      if(( média >= 7) && (média <= 10)){
        System.out.println(" Aprovado! ");
      }else{
        System.out.println(" Nota inválida! ");

        entrada.close();
      }
    }
}
