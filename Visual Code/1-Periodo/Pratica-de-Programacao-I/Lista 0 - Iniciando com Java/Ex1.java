import java.util.Scanner;

public class Ex1 {

    public static void main(String[] arg) {
        //var
        Scanner leia;
        double C, K, F, Re, Ra;

        //Scanner

        leia = new Scanner(System.in);

        //processo

        System.out.printf("\nQual a temperatura Celsius que deseja converter para outras variantes de temperatura:");
        C = leia.nextDouble();
        K = (C + 273.15);
        System.out.printf("\nA conversão de Celsius para Kelvin e: %f \n", K);
        F = ((C * 1.8) + 32);
        System.out.printf("\nA conversão de Celsius para Fahrenheit e: %f \n" + F + "\n");
        Re = (C * 0.8);
        System.out.printf("\nA conversão de Celsius para Reaumur e:%f" + Re + "\n");
        Ra = ((C * 1.8) + (32 + 459.67));
        System.out.printf("\nA conversão de Celsius para Rankine e:%f" + Ra + "\n");
    }
}
