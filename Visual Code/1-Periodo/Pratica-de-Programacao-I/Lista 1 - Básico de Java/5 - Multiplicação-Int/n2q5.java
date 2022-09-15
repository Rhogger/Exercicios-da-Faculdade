
//Faça um programa em Java, onde tenha dois números inteiros e retorne a multiplicação entre os dois números.
import java.util.Scanner;

public class n2q5 {

    public static void main(String[] args) {
        //var
        int a, b, result;

        //declaração de objeto
        Scanner sc = new Scanner(System.in);

        //processamento
        System.out.print("\n Insira o primeiro valor: ");
        a = sc.nextInt();
        System.out.print("\n Agora insira o segundo valor: ");
        b = sc.nextInt();
        result = a * b;
        System.out.printf("\n O resultado da multiplicassaun eh: " + result + "\n");
    }
}
