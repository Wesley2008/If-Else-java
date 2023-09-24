package Exercícios;

import java.util.Scanner;

public class Exercício10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        double preco, custo;

        System.out.print ("Informe o custo de fábrica: ");
        custo = entrada.nextDouble ();

        if (custo <= 12000.0){
            preco = custo + (custo * 0.05);
        }else if(custo > 12000.0 && custo < 25000.0){
            preco = custo + (custo * 0.10) + (custo * 0.15);
        }else {
            preco = custo + (custo * 0.15) + (custo * 0.20);
        }

        System.out.println("Preço ao Consumidor: R$ " + preco);

        entrada.close ();

    }
}

