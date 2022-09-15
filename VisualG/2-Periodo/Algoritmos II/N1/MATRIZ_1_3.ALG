algoritmo "Matriz_1_3"

var
   matrixA,matrixB: vetor[1..5,1..5] de inteiro

   linha,coluna: inteiro

inicio

   escreval("Matriz de ordem 5: ")
   escreval(" ")

   aleatorio 1,99

   para linha de 1 ate 5 faca
      para coluna de 1 ate 5 faca
         leia(matrixA[linha,coluna])
         limpatela
         se (matrixA[linha,coluna] % 2 = 0) entao
            matrixB[linha,coluna] := 0
         senao
            matrixB[linha,coluna] := 1
         fimse
      fimpara
   fimpara
   aleatorio off

   escreval("Matriz A de ordem 5: ")
   escreval(" ")

   para linha de 1 ate 5 faca
      para coluna de 1 ate 5 faca
         escreva(matrixA[linha,coluna])
         se (matrixA[linha,coluna] / 10 < 1) entao
            escreva(" ")
         fimse
      fimpara
      escreval(" ")
   fimpara

   escreval(" ")
   escreval(" ")
   escreval("Matriz B de ordem 5: ")
   escreval(" ")

   para linha de 1 ate 5 faca
      para coluna de 1 ate 5 faca
         escreva(matrixB[linha,coluna])
         se (matrixB[linha,coluna] / 10 < 1) entao
            escreva(" ")
         fimse
      fimpara
      escreval(" ")
   fimpara



fimalgoritmo