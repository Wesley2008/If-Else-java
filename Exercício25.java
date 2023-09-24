package Exercícios;

import java.util.Scanner;

public class Exercício25{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horaExtras, horaFalta, H;
        double premio;

        System.out.print("Informe o número de horas extras: ");
        horaExtras = entrada.nextInt();

        System.out.print("Informe o número de horas que o funcionário faltou: ");
        horaFalta = entrada.nextInt();

        H = horaExtras - (horaExtras - (2 * horaFalta / 3)) * 60;

        if (H >= 2400) {
            premio = 500;
        }else if(H >= 1800){
            premio = 400;
        }else if (H >= 1200) {
            premio = 300;
        }else if (H >= 600) {
            premio = 200;
        }else{
            premio = 100;
        }

        System.out.print("O seu prêmio é: R$"+premio);

        entrada.close();
    }
}
