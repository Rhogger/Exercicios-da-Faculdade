algoritmo "Atividade2_1"

var
   vetorA: vetor[1..7] de inteiro
   contador,pares: inteiro

inicio

   escreval("Insira 7 valores, e ao fim descubra quais s�o pares.")
   escreval(" ")

   para contador de 1 ate 7 faca
      escreva("Digite o",contador,"� valor: ")
      leia(vetorA[contador])
      escreval(" ")
   fimpara

   escreval(" ")
   escreval(" ")

   para contador de 1 ate 7 faca
      se (vetorA[contador] % 2 = 0) entao
         pares:= pares+1
         escreval("O valor",vetorA[contador],"[",contador," ], � par.")
         escreval(" ")
      fimse
   fimpara

   escreval(" ")
   escreval("Dentre os 7 valores,",pares," s�o pares!")
   escreval(" ")

fimalgoritmo