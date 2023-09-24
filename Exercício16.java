package Exercícios;

import java.util.Scanner;

public class Exercício16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o preço atual do produto: ");
        double precoAtual = entrada.nextDouble();

        System.out.println("Digite o código do produto: ");
        int codigoProduto = entrada.nextInt();

        double valorDesconto = 0.0;
        double novoPreco = 0.0;

        if (codigoProduto == 1) {
            if (precoAtual <= 30.0) {
                valorDesconto = 0.0; // Sem desconto
            } else if (precoAtual <= 100.0) {
                valorDesconto = precoAtual * 0.10; // 10% de desconto
            } else {
                valorDesconto = precoAtual * 0.15; // 15% de desconto
            }
        } else {
            System.out.println("Código de produto inválido.");
            System.exit(1); // Saída do programa em caso de código de produto inválido.
        }

        novoPreco = precoAtual - valorDesconto;

        System.out.println("Valor do Desconto: R$ " + valorDesconto);
        System.out.println("Novo Preço: R$ " + novoPreco);

        entrada.close();
    }
}
