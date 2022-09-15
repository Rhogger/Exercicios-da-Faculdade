import java.util.Scanner;

public class N2A4 {

    public static void main(String[] args) {

        double cotacao, dolar, real;

        Scanner leia = new Scanner(System.in);

        System.out.print("\nA cotacao do dolar esta em $ ");
        cotacao = leia.nextDouble();
        System.out.print("\nDigite o valor em dolar que deseja-se converter para real: $ ");
        dolar = leia.nextDouble();
        real = dolar * cotacao;
        System.out.printf("\nA convercao de $ %f ficou em R$ %f \n", dolar, real);
    }
}
