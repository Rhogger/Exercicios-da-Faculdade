algoritmo "Vetor 3"

var
   vetorA: vetor[0..9] de inteiro
   vetorB: vetor[0..9] de inteiro
   contador: inteiro

inicio
   para contador de 0 ate 9 faca
      escreva("Insira o valor para o vetorA[",contador," ] : ")
      leia(vetorA[contador])
      vetorB[contador]:= vetorA[contador]*contador
      escreval(" ")
   fimpara
   escreval("vetorA[contador]              vetorB[contador]")
   para contador de 0 ate 9 faca
      escreval(vetorA[contador],"                  ",vetorB[contador])
   fimpara

fimalgoritmo