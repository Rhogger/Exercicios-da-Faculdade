public class ContaVogal {
  public static void main(String[] args) {
    String palavra = "Modularizacao em Java";
    int cont = 0;
    for (int i = 0; i < palavra.length(); i++) {
      if (ehVogal(palavra.charAt(i))) {
        cont++;
      }
    }
    System.out.println(cont);
  }

  public static boolean ehVogal(char letra) {
    switch (letra) {
      case 'a':
      case 'A':
      case 'e':
      case 'E':
      case 'i':
      case 'I':
      case 'o':
      case 'O':
      case 'u':
      case 'U':
        return true;
      default:
        return false;
    }
  }
}