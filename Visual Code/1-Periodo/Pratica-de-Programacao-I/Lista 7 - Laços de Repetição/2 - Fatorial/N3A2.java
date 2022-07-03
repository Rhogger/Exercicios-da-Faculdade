import java.util.Scanner;

public class N3A2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X, A = 1, C = 1, aux = 1;

        System.out.print("\nInsira um valor para ser calculado o fatorial: ");
        X = sc.nextInt();
        System.out.print("\n");
        if (X == 1) {
            System.out.print("1! = 1\n");
        } else if (X == 0) {
            System.out.print("0! = 1\n");
        } else if (X < 0) {
            System.out.print("Insira somente numeros positivos!\n");
        } else {
            do {
                result = soma * num;
                factorial++;
                soma = soma * factorial;
            } while (C < X);
            System.out.print("\n");
            System.out.printf(X + "! = " + aux);
            System.out.print("\n");
        }
    }
}
