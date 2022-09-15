import java.util.Scanner;

public class N3A5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X, C = 1, M, result;

        System.out.print("\nInsira um valor para ser feito a tabuada: ");
        X = sc.nextInt();
        System.out.print("\nInsira um valor para sabermos ate onde sera multiplicado: ");
        M = sc.nextInt();
        for (C = 1; C <= M; C++) {
            result = X * C;
            System.out.print("\n");
            System.out.printf(X + " * " + C + " = " + result);
            System.out.print("\n");
        }
    }
}
