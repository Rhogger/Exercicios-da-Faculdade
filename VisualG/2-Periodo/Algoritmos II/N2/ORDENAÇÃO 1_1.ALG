algoritmo "ORDENAÇÃO 1_1"

var
   vetorA: vetor[1..40] de inteiro
   contador1,contador2,aux,menor: inteiro

inicio
   contador1:=1

   escreval("=-=-=-=-= Leitura do Vetor =-=-=-=-=")
   escreval(" ")

   aleatorio 1,100
   para contador1 de 1 ate 40 faca
      escreva("Posição ",contador1,": ")
      leia(vetorA[contador1])

      para contador2 de 1 ate contador1 faca
         se (contador2<>contador1) entao
            enquanto (vetorA[contador1] = vetorA[contador2]) faca
               limpatela
               escreval("Número digitado já foi inserido. Digite novamente: ")
               escreval("Posição ",contador1,": ")
               leia(vetorA[contador1])
               timer 500
               limpatela
               timer 0
               limpatela
            fimenquanto
         fimse
      fimpara
      limpatela
   fimpara
   aleatorio off

   escreval("Vetor A[]: ")
   escreval(" ")
   para contador1 de 1 ate 40 faca
      escreva(" | ",vetorA[contador1])
      se (contador1=40) entao
         escreva(" |")
      fimse
   fimpara

   escreval(" ")
   escreval(" ")

   para contador1 de 1 ate 39 faca
      menor:= contador2
      para contador2 de contador1 ate 40 faca
         se (vetorA[menor] < vetorA[contador2]) entao
            menor:= contador2
         fimse
      fimpara
      se contador1<>menor entao
         aux:= vetorA[contador1]
         vetorA[contador1]:= vetorA[menor]
         vetorA[menor]:= aux
      fimse
   fimpara

   escreval(" ")
   escreval(" ")

   escreval("Vetor A[] Formatado: ")
   escreval(" ")
   para contador1 de 1 ate 40 faca
      escreva(" | ",vetorA[contador1])
      se (contador1=40) entao
         escreva(" |")
      fimse
   fimpara
   escreval(" ")

fimalgoritmo
