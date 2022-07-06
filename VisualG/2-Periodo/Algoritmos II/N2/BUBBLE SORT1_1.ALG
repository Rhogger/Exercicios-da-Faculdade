Algoritmo "Bubble Sort1_2"
//Médio Caso
Var

   vetorA: vetor[0..15] de inteiro

   contador1,contador2,menor: inteiro

Inicio

   vetorA[1]:= 31
   vetorA[2]:= 41
   vetorA[3]:= 59
   vetorA[4]:= 26
   vetorA[5]:= 41
   vetorA[6]:= 58
   vetorA[7]:= 45
   vetorA[8]:= 47
   vetorA[9]:= 11
   vetorA[10]:= -5
   vetorA[11]:= 15
   vetorA[12]:= 0
   vetorA[13]:= 69
   vetorA[14]:= 83
   vetorA[15]:= 19

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