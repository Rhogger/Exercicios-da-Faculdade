import java.util.Scanner;

public class COND3 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        float salario_minimo = 1100;
        float salario_usuario, media;

        System.out.print("\nQuantos reais voce recebe? \tR$ ");
        salario_usuario = leia.nextFloat();
        if (salario_usuario < 1100) {
            System.out.print("\nVoce recebe menos que um salario minimo! Por tanto esse valor e invalido\n");
        } else {
            media = salario_usuario / salario_minimo;
            System.out.printf("\nVoce recebe " + media + " salarios minimos!\n");
        }

    }
}
