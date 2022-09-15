import java.util.*;

public class ProvaPotenciacao {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int expo;
    float num, result;

    System.out.print("\n\nInsira um numero: ");
    num = input.nextFloat();
    result = num;

    System.out.print("\n\ninsira a expoente: ");
    expo = input.nextInt();

    System.out.printf("\n\nO resultado eh: %f\n\n", Potenciacao(num, expo, result));

  }

  public static float Potenciacao(float number, int exponent, float resultado) {

    if (exponent < 1) {

      resultado = resultado / number;
      exponent++;

    } else if (exponent > 1) {

      resultado = resultado * number;
      exponent--;

    } else {

      return resultado;

    }

    return Potenciacao(number, exponent, resultado);

  }
}
