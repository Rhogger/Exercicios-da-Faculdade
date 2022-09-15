import java.util.Scanner;

public class ProvaQ1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year;

        System.out.print("\nInsira um ano para saber se ele sera bisexto ou nao: ");
        year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.print("\nO ano e bisexto!\n");
        } else {
            System.out.print("\nO ano não e bisexto!\n");
        }
    }
}