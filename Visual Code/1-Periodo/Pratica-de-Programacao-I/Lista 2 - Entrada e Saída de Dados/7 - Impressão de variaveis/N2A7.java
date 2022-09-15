import java.util.Scanner;

public class N2A7 {

    public static void main(String[] args)

    {

        String desc, nome;
        float valor, valorf;
        int quantidade;

        Scanner leia = new Scanner(System.in);

        System.out.print("\nQual a descricao do produto que deseja comprar? R: ");
        desc = leia.nextLine();
        System.out.print("\nQual o valor do produto? R$ ");
        valor = leia.nextFloat();
        System.out.print("\nQuantidade do produto? ");
        quantidade = leia.nextInt();

        Scanner leia2 = new Scanner(System.in);

        System.out.print("\nNome do produto: ");
        nome = leia2.nextLine();

        valorf = quantidade * valor;
        System.out.printf("\nValor da compra: %f \n", valorf);
    }

}
