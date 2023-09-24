package Exercícios;

import java.util.Scanner;

public class Exercício13 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        double preco, novoPreco;

        System.out.print("Informe o preço do produto: R$ ");
        preco = entrada.nextDouble();

        if(preco <=50){
            novoPreco = preco * 1.05;
            }
            else if((preco >50)&&(preco <100)){
                novoPreco = preco * 1.10;
            }
            else{
                novoPreco = preco * 1.15;
            }

            if(novoPreco <= 80){
                System.out.println("O novo preço do produto será de: R$ " +novoPreco);
                System.out.print("O produto é Barato!");
            }
            else if((novoPreco >80)&&(novoPreco <=120)){
                System.out.println("O novo preço do produto será de: R$ " +novoPreco);
                System.out.print("O produto é Normal!");
            }
            else if((novoPreco >120)&&(novoPreco <=200)){
                System.out.println("O novo preço do produto será de: R$ " +novoPreco);
                System.out.print("O produto é Caro!");
            }else{
                System.out.println("O novo preço do produto será de: R$ " +novoPreco);
                System.out.print("O produto é Muito caro!");
            }
            entrada.close();
    
}
}
