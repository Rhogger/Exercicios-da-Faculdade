algoritmo "Vetor2_3"

var
   vetorN: vetor[1..10] de caractere
   nome: caractere
   contador,total: inteiro

inicio

   escreval("=-=-=-=-=-= Listagem de Nomes =-=-=-=-=-=")
   escreval(" ")

   para contador de 1 ate 10 faca
      escreva("Insira um nome: ")
      leia(nome)
      se (copia(maiusc(nome),1,1)="M") ou (copia(minusc(nome),1,1)="m") entao
         total:= total+1
         vetorN[total]:= nome
      fimse
   fimpara

   escreval(" ")
   escreval(" ")
   escreval("=-=-=-=-=-= Nomes apenas iniciados em 'M' =-=-=-=-=-=")
   escreval(" ")

   para total de 1 ate total faca
      escreval(vetorN[total])
   fimpara

   escreval(" ")
   escreval(" ")

fimalgoritmo