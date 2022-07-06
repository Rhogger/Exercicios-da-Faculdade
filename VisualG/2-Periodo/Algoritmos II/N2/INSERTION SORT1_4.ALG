Algoritmo "Insertion Sort1_4"
// Todos os Casos
Var

   vetorA: vetor[0..15] de inteiro

   contador1,contador2,menor,aux: inteiro

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

   escreval("Melhor Caso: ")
   escreval(" ")
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
   para contador1 de 2 ate 6 faca
      menor:= vetorA[contador1]
      contador2:= contador1-1
      enquanto (contador2>0) e (vetorA[contador2] > menor) faca
         vetorA[contador2+1]:= vetorA[contador2]
         contador2:= contador2-1
      fimenquanto
      vetorA[contador2+1]:= menor
   fimpara
   cronometro off
   escreval(" ")
   escreval(" ")

   escreval("Vetor A[] (Ordenado): ")
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

   escreval(" ")
   escreval(" ")
   escreval(" ")
   escreval(" ")
   escreval("Médio Caso: ")
   escreval(" ")
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
   para contador1 de 2 ate 6 faca
      menor:= vetorA[contador1]
      contador2:= contador1-1
      enquanto (contador2>0) e (vetorA[contador2] > menor) faca
         vetorA[contador2+1]:= vetorA[contador2]
         contador2:= contador2-1
      fimenquanto
      vetorA[contador2+1]:= menor
   fimpara
   cronometro off
   escreval(" ")
   escreval(" ")

   escreval("Vetor A[] (Ordenado): ")
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

   vetorA[1]:= 83
   vetorA[2]:= 69
   vetorA[3]:= 59
   vetorA[4]:= 58
   vetorA[5]:= 47
   vetorA[6]:= 45
   vetorA[7]:= 41
   vetorA[8]:= 41
   vetorA[9]:= 31
   vetorA[10]:= 26
   vetorA[11]:= 19
   vetorA[12]:= 15
   vetorA[13]:= 11
   vetorA[14]:= 0
   vetorA[15]:= -5

   escreval(" ")
   escreval(" ")
   escreval(" ")
   escreval(" ")
   escreval("Pior Caso: ")
   escreval(" ")
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
   para contador1 de 2 ate 6 faca
      menor:= vetorA[contador1]
      contador2:= contador1-1
      enquanto (contador2>0) e (vetorA[contador2] > menor) faca
         vetorA[contador2+1]:= vetorA[contador2]
         contador2:= contador2-1
      fimenquanto
      vetorA[contador2+1]:= menor
   fimpara
   cronometro off
   escreval(" ")
   escreval(" ")

   escreval("Vetor A[] (Ordenado): ")
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