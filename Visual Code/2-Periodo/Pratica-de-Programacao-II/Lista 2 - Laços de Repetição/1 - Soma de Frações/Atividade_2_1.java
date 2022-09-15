public class Atividade_2_1 {
  public static void main(String[] args) {

    float numerator = 1, denominator = 1, result;

    while (numerator <= 99) {
      result = numerator / denominator;
      System.out.printf("\n" + numerator + "/" + denominator + " = " + result + "\n");
      numerator = numerator + 2;
      denominator = denominator + 1;
    }
  }
}
