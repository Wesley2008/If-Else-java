package Exercícios;

import java.util.Scanner;

public class Exercício17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int senha=1;

        System.out.print("Insira sua senha: ");
        senha = entrada.nextInt();

        if((senha > 4530)&&(senha <4532)){
            System.out.print("Senha correta!");
        }else{
            System.out.print("Senha incorreta!");
        }
        entrada.close();
    }
    
}