package Exercícios;

import java.util.Scanner;

public class Exercício09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double saldo, credito;

        System.out.print("Informe seu saldo: ");
        saldo = entrada.nextDouble();

        if(saldo >400){
            credito = saldo * 0.30;
        }else if((saldo <=400)&&(saldo >300)){
            credito = saldo * 0.25;
        }else if((saldo <=300)&&(saldo >200)){
            credito = saldo * 0.20;
        }else{
            credito = saldo * 0.10;
        }
        System.out.println("Seu saldo médio equivale a R$: " +saldo);
        System.out.println("O crédito equivale a: " +credito);

        entrada.close();
        }
    }
    

