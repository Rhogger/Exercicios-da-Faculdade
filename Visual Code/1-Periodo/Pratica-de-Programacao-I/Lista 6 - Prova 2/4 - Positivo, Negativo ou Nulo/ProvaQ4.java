import java.util.Scanner;

public class ProvaQ4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A;

        System.out.print("\nInsira um numero para saber se ele e positivo ou negativo: ");
        A = sc.nextInt();
        if (A > 0) {
            System.out.printf("\nO numero" + A + " e positivo!\n");
        } else if (A < 0) {
            System.out.printf("\nO numero" + A + " e negativo!\n");
        } else {
            System.out.print("\nO numero e igual a zero!\n");
        }
    }
}
