algoritmo "Vetor 4"

var
   vetorA: vetor[0..9] de inteiro
   vetorB: vetor[0..9] de inteiro
   vetorC: vetor[0..9] de inteiro
   contador: inteiro

inicio
   para contador de 0 ate 9 faca
      escreva("Insira o valor para o vetor A[",contador," ] : ")
      leia (vetorA[contador])
      escreval(" ")
      escreva("Insira o valor para o vetor B[",contador," ] : ")
      leia (vetorB[contador])
      escreval(" ")
      escreval(" ")
      vetorC[contador]:= vetorA[contador]-vetorB[contador]
   fimpara
   timer 1000
   limpatela
   timer 0

   escreval("Resultado: ")
   para contador de 0 ate 9 faca
      escreval(vetorC[contador])
   fimpara

fimalgoritmo