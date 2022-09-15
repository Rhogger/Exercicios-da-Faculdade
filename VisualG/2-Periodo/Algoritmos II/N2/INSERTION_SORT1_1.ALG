algoritmo "Insertion_Sort1_1"

var
   vetorA: vetor[0..6] de inteiro

   contador1,contador2,maior: inteiro

inicio

   vetorA[1]:= 31
   vetorA[2]:= 41
   vetorA[3]:= 59
   vetorA[4]:= 26
   vetorA[5]:= 41
   vetorA[6]:= 58

   escreval("Vetor A[] (Desordenado): ")
   escreval(" ")

   para contador1 de 1 ate 6 faca
      escreva(" |",vetorA[contador1])
      se (contador1=6) entao
         escreva(" |")
      fimse
   fimpara

   escreval(" ")
   escreval(" ")

   para contador1 de 1 ate 6 faca
      maior:= vetorA[contador1]
      contador2:= contador1-1
      enquanto (contador2>0) e (vetorA[contador2] < maior) faca
         vetorA[contador2+1]:= vetorA[contador2]
         contador2:= contador2-1
      fimenquanto
      vetorA[contador2+1]:= maior
   fimpara

   escreval(" ")
   escreval(" ")
   escreval("Vetor A[] (Ordenado):")
   escreval(" ")

   para contador1 de 1 ate 6 faca
      escreva(" |",vetorA[contador1])
      se (contador1=6) entao
         escreva(" |")
      fimse
   fimpara

   escreval(" ")
   escreval(" ")

fimalgoritmo