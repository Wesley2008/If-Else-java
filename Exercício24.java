package Exercícios;

 import java.util.Scanner;

public class Exercício24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        double perAumento, aumento, imposto, novoPreco, preco;
        int categoria;
        char situacao;
        String classificacao;

        System.out.print ("Informe o preço do produto: R$");
        preco = entrada.nextDouble();

        System.out.println ("Informe a categoria do produto: \n1 — limpeza\n2 — alimentação\n3 — vestuário.");
        categoria = entrada.nextInt ();

        System.out.println ("Informe a situação do produto:\nR — produtos que necessitam de refrigeração\nN — produtos que não necessitam de refrigeração.");
        situacao = entrada.next().toUpperCase ().charAt (0);

        if (preco <= 25){
            switch (categoria){
                case 1:
                    perAumento = 0.05;
                    break;
                case 2:
                    perAumento = 0.08;
                    break;
                case 3:
                    perAumento = 0.10;
                    break;
                default:
                    perAumento = 0;
                    System.out.println ("Categoria inválida!");
                    break;
            }
        }else{
            switch (categoria){
                case 1:
                    perAumento = 0.12;
                    break;
                case 2:
                    perAumento = 0.15;
                    break;
                case 3:
                    perAumento = 0.18;
                    break;
                default:
                    perAumento = 0;
                    System.out.println ("Categoria inválida!");
                    break;
            }
        }

        aumento = preco * perAumento;

        if (categoria == 2 && situacao == 'R'){
            imposto = preco * 0.05;
        }else {
            imposto = preco * 0.08;
        }

        novoPreco = preco + aumento - imposto;

        if (novoPreco <= 50){
            classificacao = "Barato";
        } else if (novoPreco >50 && novoPreco<120) {
            classificacao = "Normal";
        } else {
            classificacao = "Caro";
        }

        System.out.println ("O valor do aumento é: R$"+aumento);
        System.out.println ("O valor do imposto é: R$"+aumento);
        System.out.println ("O novo preço é: R$"+novoPreco);
        System.out.println ("O produto é classificado como: "+classificacao);

        entrada.close ();
    }
}
