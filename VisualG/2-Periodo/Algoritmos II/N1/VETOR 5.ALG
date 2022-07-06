algoritmo "Vetor 5"

var
   vetorA: vetor[0..9] de inteiro
   contador: inteiro

inicio
   para contador de 0 ate 9 faca
      escreva("Insira o valor para vetor A[",contador," ] : ")
      leia (vetorA[contador])
   fimpara

   timer 1000
   limpatela
   timer 0

   escreval("Resultado: ")
   para contador de 0 ate 9 faca
      se (vetorA[contador] % 2 = 0) entao
         escreval(vetorA[contador])
      fimse
   fimpara

fimalgoritmo