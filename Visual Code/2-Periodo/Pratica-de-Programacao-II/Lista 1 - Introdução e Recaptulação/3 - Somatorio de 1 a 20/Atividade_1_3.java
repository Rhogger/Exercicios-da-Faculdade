public class Atividade_1_3 {
  public static void main(String[] args) {

    // Calcular a soma dos valores de 1 até 20.

    int soma = 0, result;

    for (int i = 1; i <= 20; i++) {

      result = soma + i;
      System.out.printf("\n" + i + " + " + soma + " = " + result);
      soma = result;

    }
  }
}
