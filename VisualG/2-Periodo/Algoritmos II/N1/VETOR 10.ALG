algoritmo "Vetor 10"

var
   vetorA: vetor[0..99] de inteiro
   contador,aux,maior,contador2,contador3: inteiro

inicio
   contador3:= -1
   escreval("Vetor A[contador]")
   para contador de 0 ate 99 faca

      aleatorio on
      escreva("Índice [",contador," ] :   ")
      leia(vetorA[contador])
      limpatela
      escreval(" ")

      para contador2 de 0 ate 99 faca
         se (contador<>contador2) entao
            enquanto (vetorA[contador]=vetorA[contador2]) faca
               escreval("O Índice",contador," já foi repetido.")
               escreva("Insira outro valor: ")
               leia(vetorA[contador])
               limpatela
            fimenquanto
         fimse
      fimpara
      aleatorio off

      se (vetorA[contador]>aux) entao
         aux:= vetorA[contador]
         maior:= contador
      fimse
      contador3:= contador3+1

   fimpara

   para contador de 0 ate contador3 faca
      escreval("Índice [",contador," ] :   ",vetorA[contador])
   fimpara

   escreval(" ")
   escreva("O maior foi o índice: ", maior)

fimalgoritmo