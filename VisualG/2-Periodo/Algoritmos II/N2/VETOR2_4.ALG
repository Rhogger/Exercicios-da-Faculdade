algoritmo "Vetor2_4"

var
   vetorA: vetor[1..10] de inteiro
   aux,contador: inteiro

inicio

   escreval("Insira 10 valores!")
   escreval(" ")

   para contador de 1 ate 10 faca
      escreva(contador,"° valor: ")
      leia(vetorA[contador])
   fimpara

   para contador de 1 ate 9 faca
      para contador de 1 ate 9 faca
         se (vetorA[contador] < vetorA[contador+1]) entao
            aux:= vetorA[contador+1]
            vetorA[contador+1]:= vetorA[contador]
            vetorA[contador]:= aux
         fimse
      fimpara
   fimpara

   escreval(" ")
   escreval(" ")
   escreval("O vetor foi ordenado para decrescente. Observe: ")
   escreval(" ")
   escreval(" ")

   para contador de 1 ate 10 faca
      escreva(" |",vetorA[contador])
      se (contador=10) entao
         escreva(" |")
      fimse
   fimpara

   escreval(" ")
   escreval(" ")

fimalgoritmo