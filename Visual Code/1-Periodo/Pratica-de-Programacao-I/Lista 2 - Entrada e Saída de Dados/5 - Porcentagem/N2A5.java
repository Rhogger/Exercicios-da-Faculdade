import java.util.Scanner;

public class N2A5 {

    public static void main(String[] args) {

        String nome;
        int code, quantidade;
        double salario, comissao;
        float preco;

        Scanner leia = new Scanner(System.in);

        System.out.print("\nIdentificacao do funcionario: ");
        nome = leia.nextLine();
        System.out.print("\nCodigo do produto: ");
        code = leia.nextInt();
        System.out.print("\nPreco da peca: ");
        preco = leia.nextFloat();
        System.out.print("\nQuantidade vendida nesse mes: ");
        quantidade = leia.nextInt();
        salario = (preco * quantidade) * 1.05;
        comissao = (preco * quantidade) * 0.05;
        System.out.printf("\nO salario do funcionario e de R$ %f sendo R$ %f so de comissao", salario, comissao);
        System.out.println("\n");
    }
}
