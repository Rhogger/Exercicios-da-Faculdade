algoritmo "Vetor 7"

var
   vetorA: vetor[0..4] de inteiro
   vetorB: vetor[5..9] de inteiro
   vetorC: vetor[10..14] de inteiro
   vetorD: vetor[0..14] de inteiro
   contador: inteiro

inicio

   para contador de 0 ate 14 faca
      se (contador<=4) entao
         escreva("Insira o valor para vetor A[",contador," ] : ")
         leia (vetorA[contador])
         escreval(" ")
         vetorD[contador]:= vetorA[contador]
         fimse
         se (contador>4) e (contador<=9) entao
            escreva("Insira o valor para vetor B[",contador," ] : ")
            leia (vetorB[contador])
            escreval(" ")
            vetorD[contador]:= vetorB[contador]
            fimse
            se (contador>10) e (contador<=14) entao
               escreva("Insira o valor para vetor C[",contador," ] : ")
               leia (vetorC[contador])
               escreval(" ")
               vetorD[contador]:= vetorC[contador]
            fimse
   fimpara

   timer 3000
   limpatela
   timer 0

   para contador de 0 ate 14 faca
      escreval("O vetor D, indice",contador," : ",vetorD[contador])
   fimpara

fimalgoritmo