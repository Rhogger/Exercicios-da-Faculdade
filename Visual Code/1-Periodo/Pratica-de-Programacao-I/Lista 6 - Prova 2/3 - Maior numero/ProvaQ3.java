import java.util.Scanner;

public class ProvaQ3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, C;

        System.out.print("\nInsira tres valores, em ordem, para ao fim mostrar o maior deles: \n");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        if (A > B && A > C) {
            System.out.printf("\nO maior dos numeros e o A: " + A + "\n");
        } else if (B > A && B > C) {
            System.out.printf("\nO maior dos numeros e o B: " + B + "\n");
        } else if (C > A && C > B) {
            System.out.printf("\nO maior dos numeros e o C: " + C + "\n");
        } else if (A > B && B == C) {
            System.out.printf("\nO maior dos numeros e o A: " + A + "\n");
        } else if (B > A && A == C) {
            System.out.printf("\nO maior dos numeros e o B: " + B + "\n");
        } else if (C > A && A == B) {
            System.out.printf("\nO maior dos numeros e o C: " + C + "\n");
        } else if (A < B && B == C) {
            System.out.printf("\nO maior dos numeros e o B e o C : " + B + ", " + C + "\n");
        } else if (B < A && A == C) {
            System.out.printf("\nO maior dos numeros e o A e o C: " + A + ", " + C + "\n");
        } else if (C < A && A == B) {
            System.out.printf("\nO maior dos numeros e o A e o B: " + A + ", " + B + "\n");
        } else {
            System.out.print("\nOs numeros sao todos iguais!\n");
        }
    }
}
