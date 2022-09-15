import java.util.Scanner;

public class COND4 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        float dia;

        System.out.print("\nInsira um numero que ira corresponder a um dia da semana: ");
        dia = leia.nextFloat();

        if (dia == 1) {
            System.out.print("\nEsse numero corresponde a Domingo!\n");
        } else if (dia == 2) {
            System.out.print("\nEsse numero corresponde a Segunda-Feira!\n");
        } else if (dia == 3) {
            System.out.print("\nEsse numero corresponde a Terca-Feira!\n");
        } else if (dia == 4) {
            System.out.print("\nEsse numero corresponde a Quarta-Feira!\n");
        } else if (dia == 5) {
            System.out.print("\nEsse numero corresponde a Quinta-Feira!\n");
        } else if (dia == 6) {
            System.out.print("\nEsse numero corresponde a Sexta-Feira!\n");
        } else if (dia == 7) {
            System.out.print("\nEsse numero corresponde a Sabado!\n");
        } else {
            System.out.print("\nEsses numeros sao invalidos!\n");
        }
    }
}
