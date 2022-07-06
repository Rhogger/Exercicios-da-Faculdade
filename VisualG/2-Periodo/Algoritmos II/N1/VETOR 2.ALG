algoritmo "Vetor 2"

var
   vetorA: vetor[0..9] de inteiro
   vetorB: vetor[0..9] de inteiro
   contador: inteiro

inicio
   para contador de 0 ate 9 faca
      escreva("Insira um valor para o vetorA[",contador," ] : ")
      leia (vetorA[contador])
      vetorB[contador]:= vetorA[contador]*vetorA[contador]
      escreval("  ")
   fimpara
   escreval("vetorA           vetorB")
   para contador de 0 ate 9 faca
      escreval(vetorA[contador],"              ",vetorB[contador])
   fimpara

fimalgoritmo