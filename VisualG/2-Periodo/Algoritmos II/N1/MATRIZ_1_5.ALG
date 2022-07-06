algoritmo "Matriz_1_5"

var
   matrixA: vetor[1..5,1..8] de inteiro
   vetorA: vetor[1..8] de inteiro
   linha,coluna,soma: inteiro

inicio

   aleatorio 0,99
   para linha de 1 ate 5 faca
      para coluna de 1 ate 8 faca
         leia(matrixA[linha,coluna])
         limpatela

      fimpara
   fimpara
   aleatorio off

   escreval(" ")
   escreval("Matriz A de ordem 5x8 : ")
   escreval(" ")

   para linha de 1 ate 5 faca
      para coluna de 1 ate 8 faca
         escreva(matrixA[linha,coluna])
         se (matrixA[linha,coluna] / 10 <1) entao
            escreva(" ")
         fimse
      fimpara
      escreval(" ")
   fimpara

   escreval(" ")
   escreval(" ")
   escreval(" ")
   escreval("Vetor A[] : ")
   escreval(" ")

   para coluna de 1 ate 8 faca
      para linha de 1 ate  5 faca
         soma:= soma + matrixA[linha,coluna]
      fimpara
      vetorA[coluna]:= soma
      soma:= 0
      se (coluna < 8) entao
         escreva(vetorA[coluna],";")
      senao
         escreva(vetorA[coluna])
      fimse
   fimpara

   escreval(" ")

fimalgoritmo