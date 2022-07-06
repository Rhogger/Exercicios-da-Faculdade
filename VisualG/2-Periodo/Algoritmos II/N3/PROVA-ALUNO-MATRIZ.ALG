algoritmo "Prova-Aluno-Matriz"

var
   matrix: vetor[1..10,1..3] de inteiro
   notas: vetor[1..10] de inteiro

   //Alunos são as LINHAS (l)
   //Provas são as COLUNAS (c)
   l,c,menor,prova: inteiro

inicio

   escreval("Insira as notas de cada aluno, em cada prova no sistema.")

   para l de 1 ate 10 faca
      para c de 1 ate 3 faca
         escreva("Insira a nota do Aluno",l," da prova",c," : ")
         leia(matrix[l,c])
         limpatela
      fimpara
   fimpara

   escreval("         |  Nota 1  |  Nota 2  |  Nota 3  |")
   para l de 1 ate 10 faca
      escreva("Aluno ",l:2," |")
      para c de 1 ate 3 faca
         escreva(matrix[l,c]:6)
            escreva("    |")
      fimpara
      escreval(" ")
   fimpara

   escreval("")
   escreval("")
   escreval("")
   menor:= 10;

   para l de 1 ate 10 faca

      para c de 1 ate 3 faca

         se (matrix[l,c] < menor) entao

            prova:=c
            menor:= matrix[l,c]

         fimse

      fimpara

      escreval("O Aluno ",l," esta com a menor nota na Prova ",prova)
      menor:= 10

   fimpara



fimalgoritmo