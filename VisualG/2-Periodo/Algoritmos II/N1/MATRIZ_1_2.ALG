algoritmo "Matriz_1_2"

var
   matrix: vetor[1..5,1..5] de inteiro
   linha,coluna,contador: inteiro
   soma_linha1,soma_coluna3,diagonal_p,diagonal_s,soma_total: inteiro
inicio

   aleatorio 0,99
   para linha de 1 ate 5 faca
      para coluna de 1 ate 5 faca
         leia(matrix[linha,coluna])
         limpatela

         //soma 1° linha
         se (linha=1) entao
            soma_linha1:= matrix[linha,coluna] + soma_linha1
         fimse

         //soma 3° coluna
         se (coluna=3) entao
            soma_coluna3:= matrix[linha,coluna] + soma_coluna3
         fimse

         //soma da Diagonal Principal
         se (linha=coluna) entao
            diagonal_p:= matrix[linha,coluna] + diagonal_p
         fimse

         //soma da Diagonal Secundária
         se (linha+coluna= 6)  entao
            diagonal_s:= matrix[linha,coluna] + diagonal_s
         fimse

         //soma de todos elementos da matriz
         soma_total:= matrix[linha,coluna] + soma_total

      fimpara
   fimpara
   aleatorio off
   
   escreval("Matriz de ordem 5: ")
   escreval(" ")

   para linha de 1 ate 5 faca
      para coluna de 1 ate 5 faca
         escreva(matrix[linha,coluna])

         // 1 digitos
         se (matrix[linha,coluna] / 10 < 1 ) entao
            escreva(" ")
         fimse

      fimpara
      escreval(" ")
   fimpara

   escreval(" ")
   escreval(" ")
   escreval("A soma dos elementos da 1° linha é: ",soma_linha1)
   escreval("A soma dos elementos da 3° coluna é: ",soma_coluna3)
   escreval("A soma da Diagonal Principal é: ",diagonal_p)
   escreval("A soma da Diagonal Secundária é: ",diagonal_s)
   escreval("A soma de todos os elementos da matriz é: ",soma_total)
   escreval(" ")

fimalgoritmo