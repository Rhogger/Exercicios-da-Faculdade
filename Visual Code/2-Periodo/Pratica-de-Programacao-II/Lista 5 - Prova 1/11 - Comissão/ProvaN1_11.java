import java.util.Scanner;

public class ProvaN1_11 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double[] Vwage = new double[5];
    String[] Vnames = new String[5];
    double[] Vtime = new double[5];

    int name = 0, time = 0, wage = 0, rel1 = 0;

    System.out.print("\n\n=-=-=-=-= Reajuste- Salario =-=-=-=-=");
    for (int i = 0; i < Vwage.length; i++) {
      System.out.print("\n\n\nInforme o Nome do Funcionario: ");
      Vnames[name] = input.nextLine();

      System.out.print("\nInforme o Salario atual do Funcionario: ");
      Vwage[wage] = input.nextDouble();

      System.out.print("\nInforme o Tempo(em anos) em que o Funcionario trabalha na Empresa: ");
      Vtime[time] = input.nextDouble();

      if (Vtime[time] > 5 && Vwage[wage] < 800) {
        Vwage[wage] = Vwage[wage] * 1.35;
      } else if (Vtime[time] > 5) {
        Vwage[wage] = Vwage[wage] * 1.25;
      } else if (Vwage[wage] < 800) {
        Vwage[wage] = Vwage[wage] * 1.15;
      }

      name++;
      wage++;
      time++;
    }

    name = 0;
    wage = 0;
    time = 0;

    System.out
        .print("\n\n\n\n=-=-=-=-= RELATORIO- NAO OBTEVE AUMENTO DE SALARIO =-=-=-=-=\n\n                    Nomes:");

    for (name = 0; name < Vnames.length; name++) {
      if (Vtime[time] <= 5 && Vwage[wage] >= 800 || Vtime[time] <= 5 || Vwage[wage] >= 800) {
        System.out.printf("\n\n                    -" + Vnames[name]);
        rel1++;
      }
      wage++;
      time++;
    }
    if (rel1 == 0) {
      System.out.print("\n\n            Nenhum Funcionario ficou sem aumento!");
    }

    rel1 = 0;
    name = 0;
    wage = 0;
    time = 0;

    System.out.print("\n\n\n\n=-=-=-=-= RELATORIO- NOVO SALARIO =-=-=-=-=\n");

    for (name = 0; name < Vnames.length; name++) {
      if (Vtime[time] > 5 && Vwage[wage] < 800 || Vtime[time] < 5 || Vwage[wage] < 800) {
        System.out.print("\n\nNome: " + Vnames[name]);
        System.out.print("\nSalario Reajustado: " + Vwage[wage]);
        rel1++;
      }
      wage++;
      time++;
    }

    if (rel1 == 0) {
      System.out.print("\n\n            Nenhum Funcionario teve aumento!");
    }
  }
}