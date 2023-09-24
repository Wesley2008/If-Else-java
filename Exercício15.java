package Exercícios;

import java.util.Scanner;

public class Exercício15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor, rendimento;
        int opcao=1;

        System.out.print(
        "\n Escolha uma das opções abaixo:"+
        "\n 1 Poupança"+
        "\n 2 Fundos de renda fixa"
        );
        System.out.print("\n Escolha uma opção: ");
        opcao = entrada.nextInt();

        switch(opcao){
            case 1:
            System.out.print("Insira o valor: R$ ");
            valor = entrada.nextDouble();

            rendimento = valor * 1.3;
            System.out.print("O rendimento mensal foi de: R$ " +rendimento);
            break;

            case 2:
            System.out.print("Insira o valor: R$ ");
            valor = entrada.nextDouble();

            rendimento = valor * 1.4;
            System.out.print("O rendimento mensal foi de: R$ " +rendimento);
            break;
        }
        entrada.close();
    }
}
