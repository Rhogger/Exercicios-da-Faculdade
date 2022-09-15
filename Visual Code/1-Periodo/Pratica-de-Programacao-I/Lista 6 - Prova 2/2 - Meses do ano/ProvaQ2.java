import java.util.Scanner;

public class ProvaQ2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mes;

        System.out.print("\nInsira um numero que sera correspondido ao mes do ano: ");
        mes = sc.nextInt();
        switch (mes) {
            case 1:
                System.out.print("\nO mes 1 corresponde ao mes de janeiro!\n");
                break;
            case 2:
                System.out.print("\nO mes 2 corresponde ao mes de fevereiro!\n");
                break;
            case 3:
                System.out.print("\nO mes 3 corresponde ao mes de marco!\n");
                break;
            case 4:
                System.out.print("\nO mes 4 corresponde ao mes de abril!\n");
                break;
            case 5:
                System.out.print("\nO mes 5 corresponde ao mes de maio!\n");
                break;
            case 6:
                System.out.print("\nO mes 6 corresponde ao mes de junho!\n");
                break;
            case 7:
                System.out.print("\nO mes 7 corresponde ao mes de julho!\n");
                break;
            case 8:
                System.out.print("\nO mes 8 corresponde ao mes de agosto!\n");
                break;
            case 9:
                System.out.print("\nO mes 9 corresponde ao mes de setembro!\n");
                break;
            case 10:
                System.out.print("\nO mes 10 corresponde ao mes de outubro!\n");
                break;
            case 11:
                System.out.print("\nO mes 11 corresponde ao mes de novembro!\n");
                break;
            case 12:
                System.out.print("\nO mes 12 corresponde ao mes de dezembro!\n");
                break;
            default:
                System.out.print("\nEsse numero nao corresponde a nenhum mes do ano!\n");
                break;
        }
    }
}
