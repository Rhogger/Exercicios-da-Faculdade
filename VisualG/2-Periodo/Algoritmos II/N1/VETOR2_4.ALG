algoritmo "Vetor2_4"

var
   vetorA: vetor[0..19] de inteiro
   contador,aux: inteiro

inicio
   escreval("Vetor A[] :")
   para contador de 0 ate 19 faca
      escreval(" ")
      escreva("A[",contador," ] = ")
      leia(vetorA[contador])
   fimpara
   para contador de 0 ate 9 faca
      aux:= vetorA[contador]
      vetorA[contador]:= vetorA[19-contador]
      vetorA[19-contador]:= aux
   fimpara
   escreval(" ")
   escreval(" ")
   escreval(" ")
   escreval("VetorA[] invertido: ")
   para contador de 0 ate 19 faca
      escreval(" ")
      escreval("A[",contador," ] = ",vetorA[contador])
   fimpara

fimalgoritmo