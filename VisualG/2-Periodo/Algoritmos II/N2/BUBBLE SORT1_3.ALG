Algoritmo "Bubble Sort1_3"
// Melhor Caso
Var

   vetorA: vetor[0..15] de inteiro

   contador1,contador2,menor: inteiro

Inicio

   vetorA[1]:= -5
   vetorA[2]:= 0
   vetorA[3]:= 11
   vetorA[4]:= 15
   vetorA[5]:= 19
   vetorA[6]:= 26
   vetorA[7]:= 31
   vetorA[8]:= 41
   vetorA[9]:= 41
   vetorA[10]:= 45
   vetorA[11]:= 47
   vetorA[12]:= 58
   vetorA[13]:= 59
   vetorA[14]:= 69
   vetorA[15]:= 83

   escreval("Vetor A[] (Desordenado): ")
   escreval(" ")
   escreval(" ")

   para contador1 de 1 ate 15 faca
      escreva(" |",vetorA[contador1])
      se (contador1=15) entao
         escreva(" |")
      fimse
   fimpara

   escreval(" ")
   escreval(" ")

   cronometro on
   para contador1 de 1 ate 15 faca
      para contador2 de contador1+1 ate 15 faca
         se vetorA[contador1] > vetorA[contador2] entao
            menor:= vetorA[contador1]
            vetorA[contador1]:= vetorA[contador2]
            vetorA[contador2]:= menor
         fimse
      fimpara
   fimpara
   cronometro off
   escreval(" ")
   escreval(" ")

   para contador1 de 1 ate 15 faca
      escreva(" |",vetorA[contador1])
      se (contador1=15) entao
         escreva(" |")
      fimse
   fimpara

   escreval(" ")
   escreval(" ")

Fimalgoritmo