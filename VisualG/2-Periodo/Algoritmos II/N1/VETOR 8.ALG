algoritmo "Vetor 8"

var
   vetorA: vetor[0..39] de inteiro
   contador,contador2,contador3,contador5,contador1,contador4,acumulador,num: inteiro


inicio
   num:= 1

   escreval("Vetor A[contador]")
   aleatorio on 1 ate 100
   para contador de 0 ate 39 faca


      escreva("Índice [",contador," ] :   ")
      leia(vetorA[contador])
      limpatela
      escreval(" ")

      para contador2 de 0 ate 39 faca
         se (contador<>contador2) entao
            enquanto (vetorA[contador]=vetorA[contador2]) faca
               escreval("O Índice",contador," já foi repetido.")
               escreva("Insira outro valor: ")
               leia(vetorA[contador])
               limpatela
            fimenquanto
         fimse
      fimpara
   fimpara

   escreval("Vetor A[]")
   para contador de 0 ate 39 faca
      escreval("Índice [",contador," ] : ", vetorA[contador])
   fimpara

   escreval("  ")
   escreval("---------------------------------------------------")
   escreval("  ")

   para contador5 de 1 ate 40 faca
      contador3:= contador3+1
      se (contador5=40) entao
         vetorA[num]:= 0
         escreva(contador3,"° : ",vetorA[num])
      senao
         escreva(contador3,"° : ")
         leia(vetorA[num])
      fimse

   fimpara

   escreval("  ")
   escreval("---------------------------------------------------")
   escreval("  ")

   aleatorio off

   para contador de 0 ate 39 faca
      escreva("Índice[",contador," ]: ")
      para num de 0 ate 39 faca
         se (vetorA[num]=vetorA[contador]) entao
            acumulador:= acumulador+1
         fimse
      fimpara
      escreva(acumulador)
      escreval(" ")
      acumulador:=0
      num:=num+1
   fimpara

fimalgoritmo