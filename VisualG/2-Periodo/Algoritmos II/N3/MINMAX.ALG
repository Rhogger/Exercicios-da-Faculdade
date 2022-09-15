algoritmo "MINMAX"

var

   matrix: vetor[1..4,1..7] de real
   l,c,auxL,auxC: inteiro
   min,minmax: real

inicio
   min:=101
   minmax:=0

   para l de 1 ate 4 faca
      para c de 1 ate 7 faca
         escreva("Insira valor para a Matriz[",l,c," ]")
         leia(matrix[l,c])
         matrix[l,c]:= matrix[l,c]
      fimpara
      limpatela
   fimpara

   para l de 1 ate 4 faca
      para c de 1 ate 7 faca

         se (matrix[l,c]<=9) entao
            escreva(" ",matrix[l,c]:2:2,"   ")
         senao
            se (matrix[l,c]>9) e (matrix[l,c]<99) entao
               escreva(matrix[l,c]:2:2,"   ")
            senao
               escreva(matrix[l,c]:2:2,"  ")
            fimse
         fimse

         se (min<matrix[l,c]) entao
            min:= matrix[l,c]
            auxL:= l
         fimse

      fimpara
      escreval(" ")
   fimpara

   para l de auxL ate auxL faca
      para c de 1 ate 7 faca
         se (minmax<matrix[l,c]) entao
            minmax:= matrix[l,c]
            auxC:= c
         fimse
      fimpara
   fimpara
   
   escreval(" ")
   escreval(" ")
   escreval(" ")
   escreval("O MINMAX dessa matriz se encontra na:")
   escreval(" ")
   escreval("Linha: ",auxL)
   escreval("Coluna: ",auxC)
   escreval("Sendo o valor do MINMAX: ",MINMAX)

fimalgoritmo