algoritmo "Matriz_1_4"

var
   matrixA: vetor[1..5,1..2] de inteiro
   matrixB: vetor[1..2,1..7] de inteiro
   matrixC: vetor[1..5,1..7] de inteiro
   linhaA,colunaA,linhaB,colunaB,linhaC,colunaC,soma: inteiro

inicio
   linhaA:= 5
   colunaA:= 2
   linhaB:= 2
   colunaB:= 7

   escreval("A multiplicação da Matriz A pela Matriz B é possível?")
   escreval(" ")
   timer 800
   escreva("Analisando")
   escreva(".")
   escreva(".")
   escreva(".")
   timer 0

   se (colunaA=linhaB) entao
      escreval("É possível!")

      aleatorio 0,99
      
      para linhaA de 1 ate 5 faca
         para colunaA de 1 ate 2 faca
            leia(matrixA[linhaA,colunaA])
            limpatela
         fimpara
      fimpara

      para linhaB de 1 ate 2 faca
         para colunaB de 1 ate 7 faca
            leia(matrixB[linhaB,colunaB])
            limpatela
         fimpara
      fimpara
      
      aleatorio off

      escreval("Matriz A de ordem 5x2: ")
      escreval(" ")

      para linhaA de 1 ate 5 faca
         para colunaA de 1 ate 2 faca
            escreva(matrixA[linhaA,colunaA])
            se (matrixA[linhaA,colunaA] / 10 < 1) entao
               escreva(" ")
            fimse
         fimpara
         escreval(" ")
      fimpara

      escreval(" ")
      escreval(" ")
      escreval("Matriz B de ordem 2x7: ")
      escreval(" ")

      para linhaB de 1 ate 2 faca
         para colunaB de 1 ate 7 faca
            escreva(matrixB[linhaB,colunaB])
            se (matrixB[linhaB,colunaB] / 10 < 1) entao
               escreva(" ")
            fimse
         fimpara
         escreval(" ")
      fimpara


      linhaC:= linhaA
      colunaC:= colunaB
      linhaA:=0


      para linhaC de 1 ate 5 faca
      linhaA:= linhaA+1
      colunaA:= 0
      linhaB:= 1
      colunaB:= 1
         para colunaC de 1 ate 7 faca
            para linhaB de 1 ate 2 faca
            colunaA:= colunaA+1
               se (colunaB=8) entao
                  colunaB:= colunaB-1
                  linhaA:=linhaA+1
               fimse
               se (linhaA=6) entao
                  linhaA:= linhaA-1
               fimse
               matrixC[linhaC,colunaC]:= matrixA[linhaA,colunaA] * matrixB[linhaB,colunaB]
               soma:= soma+ matrixC[linhaC,colunaC]
               se (colunaA=2) entao
                  colunaA:=0
                  colunaB:= colunaB+1
               fimse
            fimpara
            matrixC[linhaC,colunaC]:= soma
            soma:=0

         fimpara
      fimpara

      escreval(" ")
      escreval(" ")
      escreval("Matriz C: ")
      escreval(" ")

      para linhaC de 1 ate 5 faca
         para colunaC de 1 ate 7 faca
            escreva(matrixC[linhaC,colunaC])
            se (matrixC[linhaC,colunaC] /10 >1000) entao
               escreva(" ")
            senao
               se (matrixC[linhaC,colunaC] /10 >100) entao
                  escreva("  ")
               senao
                  se (matrixC[linhaC,colunaC] /10 >10) entao
                     escreva("   ")
                  senao
                     se (matrixC[linhaC,colunaC] /10 >1) entao
                        escreva("   ")
                     senao
                        se (matrixC[linhaC,colunaC] /10 <1) entao
                           escreva("    ")
                        fimse
                     fimse
                  fimse
               fimse
            fimse

         fimpara
         escreval(" ")
      fimpara
      
   fimse
fimalgoritmo