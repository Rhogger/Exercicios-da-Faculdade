algoritmo "Vetor2_6"

var
   vetorN: vetor[1..10] de caractere
   vetorQ: vetor[1..5] de caractere
   vetorM: vetor[1..5] de real

   questao,nome,media,alunos,nota: inteiro
   alternativa: caractere
   media_turma: real

inicio

   escreval("Informativo: ")
   escreval("- Não é possível ter mais que 10 alunos na turma.")
   escreval("- As únicas alternativas das Questões são A,B,C e D")
   escreval(" ")
   escreva("Insira quantos alunos tem na turma: ")
   leia (alunos)

   enquanto (alunos<1) ou (alunos>10) faca
      escreva("Insira novamente a quantidade de alunos na sala: ")
      leia(alunos)
   fimenquanto
   limpatela

   escreval("=-=-=-=-=-=-=-= Cadastro do Gabarito =-=-=-=-=-=-=-=")
   escreval(" ")
   escreval("Insira as respostas das questões: ")

   para questao de 1 ate 5 faca
      escreva("Questão",questao," : ")
      leia(vetorQ[questao])

      enquanto (vetorQ[questao]<>"a") e (vetorQ[questao]<>"A") e (vetorQ[questao]<>"b") e (vetorQ[questao]<>"B") e (vetorQ[questao]<>"c") e (vetorQ[questao]<>"C") e (vetorQ[questao]<>"d") e (vetorQ[questao]<>"D") faca
         escreva("Insira novamente a alternativa: ")
         leia(vetorQ[questao])
      fimenquanto

   fimpara

   questao:=0
   escreval(" ")
   escreval("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
   escreval(" ")
   escreval(" ")
   escreval("=-=-=-=-=-=-=-=-=-= Correção Aluno =-=-=-=-=-=-=-=-=-=")
   escreval(" ")

   para nome de 1 ate alunos faca
      escreva("Insira o nome do aluno: ")
      leia(vetorN[nome])
      escreval(" ")
      escreval("Gabarito do aluno: ")
      para media de 1 ate 5 faca
         questao:= questao+1
         escreva("Questão",media,": ")
         leia(alternativa)

         enquanto (alternativa<>"a") e (alternativa<>"A") e (alternativa<>"b") e (alternativa<>"B") e (alternativa<>"c") e (alternativa<>"C") e (alternativa<>"d") e (alternativa<>"D") faca
            escreva("Insira novamente a alternativa: ")
            leia(alternativa])
         fimenquanto
         se (alternativa=vetorQ[questao]) entao
            nota:= nota + 2
         fimse
      fimpara
      vetorM[media]:= nota/5
      media_turma:= vetorM[media] + media_turma
      escreval("Média: ",vetorM[media])
      escreval(" ")
   fimpara

   media_turma:= media_turma/alunos
   escreval(" ")
   escreval("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
   escreval(" ")
   escreval(" ")
   escreval("A média da Turma foi de: ",media_turma)

fimalgoritmo