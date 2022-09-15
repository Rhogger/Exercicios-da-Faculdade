algoritmo "Vetor 9"

var
   A: vetor[0..5] de inteiro
   contador,aux: inteiro

inicio

   para contador de 0 ate 5 faca
      escreva("Insira um valor para o vetor A[",contador," ] : ")
      leia(A[contador])
      limpatela
   fimpara

   escreval("Vetor A: ")
   para contador de 0 ate 5 faca
      escreval(A[contador])
   fimpara


   para contador de 0 ate 2 faca
      aux:= A[contador]
      A[contador]:= A[5-contador]
      A[5-contador]:=aux
   fimpara

   escreval("Vetor A inverso: ")
   para contador de 0 ate 5 faca
      escreval(A[contador])
   fimpara

fimalgoritmo