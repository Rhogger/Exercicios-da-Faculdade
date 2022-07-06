algoritmo "Vetor2_5"

var
   vetorT: vetor[1..10] de caractere
   nomes1,nomes2,times: inteiro

inicio

   escreval("Informativo: ")
   escreval("Não é possível o campeonato ter mais que 10 times.")
   escreval(" ")
   escreva("Insira quantos times estão presente nesse campeonato: ")
   leia (times)

   enquanto (times<2) ou (times>10) faca
      escreva("Insira novamente a quantidade de times presente no campeonato: ")
      leia(times)
   fimenquanto
   limpatela

   escreval("=-=-=-=-=-=-=-= Apresentação dos Times =-=-=-=-=-=-=-=")
   escreval(" ")

   para nomes1 de 1 ate times faca
      escreva("Informe o nome do Time: ")
      leia(vetorT[nomes1])
   fimpara

   escreval("=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")

   escreval(" ")
   escreval(" ")
   escreval("=-=-=-=-=-=-=-=-= Tabela do Campeonato =-=-=-=-=-=-=-=-=")
   escreval(" ")

   para nomes1 de 1 ate times faca
      nomes2:= nomes1
      para nomes1 de 1 ate times faca
         se (nomes1<>nomes2) entao
            escreval(vetorT[nomes1]:3,"X":3,vetorT[nomes2])
         fimse
      fimpara
   fimpara

   escreval(" ")
   escreval("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
   escreval(" ")
   escreval(" ")

fimalgoritmo