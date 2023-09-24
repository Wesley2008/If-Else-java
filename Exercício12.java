package Exercícios;

import java.util.Scanner;

public class Exercício12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, valorRecebido;

        System.out.print("Informe seu salário: R$ ");
        salario = entrada.nextDouble();

        if(salario <=350){
            valorRecebido = (salario + 100) * 0.7;
            System.out.print("Sua gratificação será de: "+valorRecebido);
        }else if((salario > 350)&&(salario < 600)){
            valorRecebido = (salario + 75) * 0.7;
            System.out.print("Sua gratificação será de: "+valorRecebido);
        }else if((salario >= 600)&&(salario <= 900 )){
            valorRecebido = (salario + 50) * 0.7;
            System.out.print("Sua gratificação será de: "+valorRecebido);
        }else{
            valorRecebido = (salario + 35) * 0.7;
            System.out.print("Sua gratificação será de: " +valorRecebido);
        }
        entrada.close();
    }
    
}
