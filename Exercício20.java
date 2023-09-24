package Exercícios;

import java.util.Scanner;

public class Exercício20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int  idade;

        System.out.print("Informe sua idade: ");
        idade = entrada.nextInt();

        if((idade >=5) && (idade<=7)){
            System.out.print("Sua categoria é infantil!");
        }
        else if((idade >=8) && (idade<=10)){
            System.out.print("Sua categoria é juvenil!");
        }
        else if((idade >=11)&&(idade <=15)){
            System.out.print("Sua categoria é adolescente!");
        }
        else if((idade >=16)&&(idade <=30)){
            System.out.print("Sua categoria é adulto!");
        }
        else if(idade >30){
            System.out.print("Sua categoria é sênior!");
        }
        else{
            System.out.print("Você não tem uma categoria especificada!");
        }
        entrada.close();
    }
    
}
