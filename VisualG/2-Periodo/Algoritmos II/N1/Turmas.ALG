algoritmo "Turmas"

var
c1,c2,matriculados,matricula,presentes,ausentes,ac:inteiro
perc_A: real
turma,choice: caractere

inicio
escreval("Preencha os dados abaixo para mostrar as informa��es das turmas")
escreval("  ")

para c1 de 1 ate 14 faca
  escreva("Insira a letra da turma (A,B,C,1,2,3...): ")
  leia(turma)
  escreval("  ")
  escreva("Insira o n�mero de alunos matriculados nessa turma: ")
  leia(matriculados)

  repita
    se (matriculados>0) entao
      escreval("  ")
    senao
     se matriculados<=0) entao
       escreva("N�mero inserido inv�lido. Por favor, insira novamente: ")
       leia (matriculados)
       escreval("  ")
     fimse
    fimse
  ate (matriculados>0)

 para c2 de 1 ate matriculados faca
   escreval("-------------------------------------------------------------------------------------------")
   escreva("Insira o n�mero da matr�cula do ",c2,"�aluno: ")
   leia (matricula)
   escreval("  ")
   escreval("Este aluno de n�mero da matr�cula: ",matricula," se encontra presente ou ausente?")
   escreva("Insira 'A' para Ausente e 'P' para Presente:   ")
   leia (choice)
   escreval("  ")
   escreval("  ")

   repita
    se (choice="P") ou (choice="p") entao
      presentes:= presentes+1
    senao
     se (choice="A") ou (choice="a") entao
       ausentes:= ausentes+1
     senao
      se (choice<>"P") ou (choice<>"p") ou (choice<>"A") ou (choice<>"a") entao
        escreva("Resposta inserida inv�lida. Por favor, insira novamente: ")
        leia (choice)
        escreval("  ")
      fimse
     fimse
    fimse
   ate (choice="P") ou (choice="p") ou (choice="A") ou (choice="a")
 fimpara

 timer (1000)
   limpatela
   escreva("Calculando")
   escreva(".")
   escreva(".")
   escreva(".")
   limpatela
 timer (0)

 perc_A:= (ausentes*100)/(presentes+ausentes)
 escreval("A turma ",turma," possui ",perc_A,"% de alunos ausentes")

 se (perc_A>5) entao
   ac:= ac+1
 fimse
 timer (1500)
   escreval("  ")
   limpatela
 timer (0)

fimpara

escreval("A quantidade total de turmas superiores a 5% de aus�ncia �: ",ac)
fimalgoritmo
