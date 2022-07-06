algoritmo "Vetor 6"

var
   vetorA: vetor[0..9] de inteiro
   contador,soma,somaM,divisor,iguais :inteiro
   media: real

inicio
   divisor:= 1
   para contador de 0 ate 9 faca
      escreva("Insira o valor para vetor A[",contador," ] : ")
      leia (vetorA[contador])
      se (vetorA[contador] < 15) entao
         soma:= soma + vetorA[contador]
      senao
         se (vetorA[contador] > 15) entao
            somaM:= vetorA[contador] + somaM
            divisor:= divisor+1
         fimse
      fimse
   fimpara
   se (divisor=1) entao
      media:= somaM/divisor
   senao
      se (divisor>1) entao
         divisor:= divisor - 1
         media:= somaM/divisor
      fimse
   fimse
   escreval("Resultados: ")
   escreval("Soma: ",soma)
   escreval(" ")
   escreval("Média: ",media)
   escreval(" ")
   escreva("Indices de valores iguais: ")
   para contador de 0 ate 9 faca
      se (vetorA[contador]=15) entao
         escreva(contador)
      fimse
   fimpara
   escreval(" ")

fimalgoritmo