package Exercícios;

import java.util.Scanner;

public class Exercício22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double peso;
        int idade;

        System.out.print("Informe sua idade: ");
        idade = entrada.nextInt();

        System.out.print("Informe seu peso: ");
        peso = entrada.nextDouble();

        if((idade <20)&&(peso <=60)){
            System.out.print("Você está no grupo de risco 9!");
        }
        else if((idade <20)&&(peso >60)&&(peso <=90)){
            System.out.print("Você está no grupo de risco 8!");
        }
        else if((idade <20)&&(peso >90)){
            System.out.print("Você está no grupo de risco 7!");
        }
        else if((idade >=20)&&(idade <=50)&&(peso <=60)){
            System.out.print("Você está no grupo de risco 6!");
        }
        else if((idade >=20)&&(idade <=50)&&(peso >60)&&(peso <=90)){
            System.out.print("Você está no grupo de risco 5!");
        }
        else if((idade >=20)&&(idade <=50)&&(peso >90)){
            System.out.print("Você está no grupo de risco 4!");
        }
        else if((idade >50)&&(peso <=60)){
            System.out.print("Você está no grupo de risco 3!");
        }
        else if((idade >50)&&(peso >60)&&(peso <=90)){
            System.out.print("Você está no grupo de risco 2!");
        }
        else if((idade >50)&&(peso >90)){
            System.out.print("Você está no grupo de risco 1!");
        }
        entrada.close();
    }
}
