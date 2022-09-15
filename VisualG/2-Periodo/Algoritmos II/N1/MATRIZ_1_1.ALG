algoritmo "Matriz_1_1"

var
   matrix: vetor[0..2,0..2] de inteiro
   contador1,contador2: inteiro

inicio
  escreval("Matriz Identidade de ordem 3: ")
  escreval(" ")
   para contador1 de 0 ate 2 faca
      para contador2 de 0 ate 2 faca
         se (contador1=contador2) entao
            matrix[contador1,contador2]:= 1
         senao
            matrix[contador1,contador2]:= 0
         fimse
         escreva(matrix[contador1,contador2])
      fimpara
      escreval(" ")
   fimpara

fimalgoritmo