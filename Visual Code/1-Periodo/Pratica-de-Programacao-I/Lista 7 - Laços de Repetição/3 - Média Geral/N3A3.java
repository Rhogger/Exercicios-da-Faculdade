import java.util.Scanner;

public class N3A3 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    float Nota1, Nota2, C;
    float Media;

    System.out.print("\nO algoritmo ira mostrar a media de 5 alunos!\n");
    for (C = 1; C < 5;) {
      System.out.printf("\nInsira as notas da primeira e segunda provas do aluno " + C + ", respectivamente: \n");
      Nota1 = sc.nextInt();
      Nota2 = sc.nextInt();
      if (Nota1 < 0 || Nota2 < 0) {
        System.out.print("Insira numeros positivos para o Aluno!");
        C--;
      } else {
        Media = (Nota1 + Nota2) / 2;
        System.out.printf("\nA media do aluno e: " + Media);
        System.out.print("\n");
        C++;
      }
    }
  }
}
