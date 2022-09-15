algoritmo "Prova N2 Q1"

var
   vetorA: vetor[1..5] de inteiro

   contador1, contador2, comp, troca,aux,menor: inteiro

inicio

   vetorA[1]:= 11
   vetorA[2]:= 31
   vetorA[3]:= 13
   vetorA[4]:= 17
   vetorA[5]:= 23

   escreval("Bubble Sort")
   escreval("O Vetor A[] desordenado: ")
   escreval(" ")

   para contador1 de 1 ate 5 faca
      escreva(" | ",vetorA[contador1])
      se (contador1 = 5) entao
         escreva(" |")
      fimse
   fimpara

   escreval(" ")
   escreval(" ")

   para contador1 de 1 ate 4 faca
      para contador2 de contador1+1 ate 5 faca
         comp:= comp+1
         se (vetorA[contador1+1] < vetorA[contador1]) entao
            troca:= troca+1
            aux:= vetorA[contador1]
            vetorA[contador1]:= vetorA[contador1+1]
            vetorA[contador1+1]:= aux
         fimse
      fimpara
   fimpara

   para contador1 de 1 ate 5 faca
      escreva(" | ",vetorA[contador1])
      se (contador1 = 5) entao
         escreva(" |")
      fimse
   fimpara

   escreval(" ")
   escreval(" ")
   escreval("A quantidade de trocas foram: ",troca)
   escreval("A quantidade de comparações foram: ",comp)
   escreval(" ")
   escreval(" ")
   escreval(" ")
   escreval(" ")
   escreval(" ")
   escreval("Selection Sort: ")
   escreval("O Vetor A[] desordenado: ")
   escreval(" ")

   vetorA[1]:= 11
   vetorA[2]:= 31
   vetorA[3]:= 13
   vetorA[4]:= 17
   vetorA[5]:= 23
   troca:= 0
   comp:= 0

   para contador1 de 1 ate 5 faca
      escreva(" | ",vetorA[contador1])
      se (contador1 = 5) entao
         escreva(" |")
      fimse
   fimpara

   para contador1 de 1 ate 5 faca
      menor:= contador1
      para contador2 de contador1+1 ate 5 faca
         se (vetorA[contador2] < vetorA[menor]) entao
            menor:= contador2
         fimse
         comp:= comp+1
      fimpara
      se (contador1<>menor) entao
         aux:= vetorA[contador1]
         vetorA[contador1]:= vetorA[menor]
         vetorA[menor]:= aux
         troca:= troca+1
      fimse
   fimpara

   escreval(" ")
   escreval(" ")

   para contador1 de 1 ate 5 faca
      escreva(" | ",vetorA[contador1])
      se (contador1 = 5) entao
         escreva(" |")
      fimse
   fimpara

   escreval(" ")
   escreval(" ")
   escreval("A quantidade de trocas foram: ",troca)
   escreval("A quantidade de comparações foram: ",comp)

fimalgoritmo