package Exercícios;

import java.util.Scanner;

public class Exercício21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double preço;
        int codigo=1, procedencia=2;

        System.out.print("Informe o preço do seu produto: ");
        preço = entrada.nextDouble();
        System.out.print("Informe o cócigo do seu produto: ");
        codigo = entrada.nextInt();

        if((codigo  >0)&&(codigo <2)){
            System.out.print("A procedência do seu produto é do sul!");
        }
       else if((codigo >1)&&(codigo <3)){
        System.out.print("A procedência do seu produto é do norte");
       }
       else if((codigo >2)&&(codigo<4)){
        System.out.print("A procedência do seu produto é do leste!");
       }
       else if((codigo >3)&&(codigo<5)){
        System.out.print("A procedência do seu produto é do oeste!");
       }
       else if((codigo >4)&&(codigo<7)){
        System.out.print("A procedência do seu produto é do nordeste!");
       }
       else if((codigo >6)&&(codigo<10)){
        System.out.print("A procedência do seu produto é do sudeste!");
       }
       else if((codigo >9)&&(codigo<21)){
        System.out.print("A procedência do seu produto é do centro-oeste!");
       }
       else if((codigo >20)&&(codigo<31)){
        System.out.print("A procedência do seu produto é do nordeste!");
       }else{
        System.out.print("Seu produto não possui procedência!");
       }
       entrada.close();
    }
    
}
