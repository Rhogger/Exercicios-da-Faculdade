algoritmo "ORDENAÇÃO1_2"

var
   vetorA: vetor[1..10] de inteiro
   contador1,contador2,aux,tamanho,menor,impares: inteiro
   media: real

inicio

   escreval("Insira os valores ao vetor menores que 5000: ")
   escreval(" ")

   repita
      aleatorio on 1,1000
      contador1:= contador1+1
      escreva("Posição ",contador1,": ")
      leia(vetorA[contador1])

      enquanto (vetorA[contador1] > 5000) faca
         escreva("Insira novamente um valor: ")
         leia(vetorA[contador1])
      fimenquanto

      se (vetorA[contador1] = 999) entao
         tamanho:= contador1-1
      senao
         se (contador1 =10) entao
            tamanho:= contador1
         fimse
      fimse

      se (vetorA[contador1]%2=1) e (vetorA[contador1]>50) entao
         impares:= impares+1
      fimse
      aleatorio off
   ate (vetorA[contador1] = 999) ou (contador1 =10)


   escreval(" ")
   escreval(" ")
   escreval(" ")
   escreval(" ")

   para contador1 de 1 ate tamanho faca
      escreva(" | ",vetorA[contador1])
      se (contador1=tamanho) entao
         escreva(" |")
      fimse
   fimpara

   escreval(" ")
   escreval(" ")
   escreval(" ")
   escreval(" ")
   escreval("Elementos que tiveram a diferença igual ou maior que 10:  ")

   para contador1 de 1 ate (tamanho-1) faca
      se (vetorA[contador1] - vetorA[contador1+1] >= 10) entao
         escreva(" | ",vetorA[contador1])
      fimse
      se (contador1=(tamanho-1)) entao
         escreva(" |")
      fimse
   fimpara

   escreval(" ")
   escreval(" ")
   escreval(" ")
   escreval(" ")

   contador2:= contador1

   para contador1 de 1 ate tamanho faca
      menor:= contador2
      para contador2 de contador1 ate tamanho faca
         se (vetorA[menor] > vetorA[contador2]) entao
            menor:= contador2
         fimse
      fimpara
      se contador1<>menor entao
         aux:= vetorA[contador1]
         vetorA[contador1]:= vetorA[menor]
         vetorA[menor]:= aux
      fimse
   fimpara

   escreval(" ")
   escreval(" ")
   escreval(" ")
   escreval(" ")

   escreval("Vetor A[] Formatado: ")
   escreval(" ")
   para contador1 de 1 ate tamanho faca
      escreva(" | ",vetorA[contador1])
      se (contador1=tamanho) entao
         escreva(" |")
      fimse
   fimpara
   escreval(" ")

   media:= impares/tamanho

   escreval(" ")
   escreval(" ")
   escreval(" ")
   escreval(" ")
   escreva("A média dos números ímpares e maior que 50 é de ",media)
   escreval(" ")
   escreval(" ")
   escreval(" ")
   escreval(" ")

fimalgoritmo