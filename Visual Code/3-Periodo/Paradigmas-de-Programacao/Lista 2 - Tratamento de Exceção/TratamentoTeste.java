import java.util.Scanner;
import java.io.IOException;

public class TratamentoTeste {

  public static void LimpaTela(Scanner input) throws IOException, InterruptedException {

    //LimpaTela(input);

    char enter;

    System.out.print("\nInsira qualquer coisa para continuar...\n");
    enter = input.next().charAt(0);
    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
  }

  public static void main(String[] args) throws IOException, InterruptedException {

    Scanner input = new Scanner(System.in);

    int idade = 0, iteracao = 0, salario = 0, aumento = 0, condicaoStop = 0;
    String nome;
    boolean stop = false, condicaoIdade = false, condicaoSalario = false;

    do {

      //Etapa 1: Nome

      System.out.print("\n\nInsira o nome do funcionario: ");
      nome = input.nextLine();

      //Etapa 2: Idade

      while (condicaoIdade == false) {

        try {

          System.out.print("\nInsira idade do funcionario: ");
          idade = input.nextInt();

        } catch (java.util.InputMismatchException Tipagem_Invalida) {

          ExceptionTipoInvalido();

        } finally {

          if (idade > 0 && idade < 18) {

            System.out.print("\n\nA empresa nao aceita funcionarios abaixo de 18 anos!\n\n");
            condicaoSalario = true;
            condicaoIdade = true;
            LimpaTela(input);

          } else if (idade > 90) {

            System.out.print("\n\nA empresa nao aceita funcionarios acima de 90 anos!\n\n");
            condicaoSalario = true;
            condicaoIdade = true;
            LimpaTela(input);

          } else if (idade < 0) {

            System.out.print("\n\nEntrada de Dados invalido.\n\n");
            condicaoIdade = false;
            LimpaTela(input);

          } else {

            condicaoIdade = true;

          }
        }
      }

      //Zera valores
      condicaoIdade = false;

      //Etapa 3: Salario
      while (condicaoSalario == false) {

        try {

          System.out.print("\nInsira o salario do funcionario: ");
          salario = input.nextInt();

        } catch (java.util.InputMismatchException Tipagem_Invalida) {

          ExceptionTipoInvalido();

        } finally {

          if (salario < 0) {

            System.out.print("\n\nEntrada de Dados invalida. Valor negativo.\n");
            condicaoSalario = false;
            LimpaTela(input);

          } else if (salario > 8000) {

            System.out.print("\n\nA empresa nao paga mais que 8000.\n");
            condicaoSalario = false;

          } else {

            condicaoSalario = true;

          }
        }
        //Etapa 5: Aumento
        if (condicaoSalario == true) {

          System.out.print("\n\nDeu a LOUCA no patrao e ele vai dar um bonus por semana de R$(salario / idade).\n\n");

        }
      }

      try {

        aumento = salario / idade;

      } catch (java.lang.ArithmeticException Dividir_Por_0) {

        System.out.print("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.print("\n\nA idade esta com valor zerado.");
        System.out.print("\nEsta tentando dividir por 0.");
        System.out.print("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        LimpaTela(input);

      }

      //Zera valores
      condicaoIdade = false;
      condicaoSalario = false;
      condicaoStop = 0;

      iteracao++;

      System.out.print("\n\n=-=-=-= Informacoes =-=-=-=\n\n");
      System.out.printf("Nome: %s\n", nome);
      System.out.printf("Idade: %d\n", idade);
      System.out.printf("Salario: %d\n", salario);
      System.out.printf("Aumento: %d\n", aumento);
      System.out.printf("Iteracao: %d", iteracao);
      System.out.print("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=\n\n");

      LimpaTela(input);

      do {

        try {

          System.out.print("\n\nDeseja encerrar o processo?\n1- SIM \n2- NAO\n\nEscolha: ");
          condicaoStop = input.nextInt();

        } catch (java.util.InputMismatchException Tipagem_Invalida) {

          ExceptionTipoInvalido();

        } finally {

          if (condicaoStop == 1) {

            System.out.print("\n\nProcesso encerrado\n\n");
            stop = true;

          } else if (condicaoStop == 2) {

            LimpaTela(input);
            break;

          } else {

            LimpaTela(input);
            System.out.print("\n\nEntrada invalida...Insira novamente.\n\n");

          }
        }
      } while (stop == false);

      input.nextLine();

    } while (stop == false);
  }

  public static void ExceptionTipoInvalido() {

    //ExceptionTipoInvalido();

    System.out.print("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.print("\n\n!!! ERRO !!!\n\n");
    System.out.print("Descricao: entrada de dados nao eh permitida.\n");
    System.out.print("Tipo permitido: inteiro\n\n");
    System.out.print("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

  }
}