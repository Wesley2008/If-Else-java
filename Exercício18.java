package Exercícios;

import java.util.Scanner;

public class Exercício18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;

        System.out.print("Insira sua idade: ");
        idade = entrada.nextInt();

        if(idade >= 18){
            System.out.print("Você já atingiu a maior de idade! ");
        }else{
            System.out.print("Você ainda não atingiu a maior idade! ");
        }
        entrada.close();
    }
    
}
