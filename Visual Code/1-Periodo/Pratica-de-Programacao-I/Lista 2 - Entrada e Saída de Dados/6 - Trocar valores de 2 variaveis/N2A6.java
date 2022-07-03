import java.util.Scanner;

public class N2A6 {

    public static void main(String[] args)

    {

        int A, B;

        Scanner leia = new Scanner(System.in);

        System.out.print("\nInsira o valor de A: ");
        A = leia.nextInt();
        System.out.print("\nInsira o valor de B: ");
        B = leia.nextInt();
        A = A ^ B;
        B = A ^ B;
        A = A ^ B;
        System.out.printf("\nAgora %d (A) possui valor de %d (B) \n", A, B);
    }
}
