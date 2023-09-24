package Exercícios;

import java.util.Scanner;

public class Exercício19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double altura, peso, sexo;
        int feminino=1, masculino=2;System.out.print(
        "\n Informe seu sexo conforme os números abaixo:"+
        "\n 1: Feminino."+
        "\n 2: Masculino."
        );
        System.out.print("\n Informe seu sexo: ");
        sexo = entrada.nextInt();

        switch(feminino){
            case 1:
           
            
            System.out.print("Informe sua altura: ");
             altura = entrada.nextDouble();
             peso = altura - 44.7;
             System.out.print("O peso ideal é: " + peso);
            break;

            case 2:
            System.out.print("Informe sua altura: ");
             altura = entrada.nextDouble();
             peso = altura - 44.7;
             System.out.print("O peso ideal é: " + peso);
            break;
        }
        entrada.close();
    }
}
