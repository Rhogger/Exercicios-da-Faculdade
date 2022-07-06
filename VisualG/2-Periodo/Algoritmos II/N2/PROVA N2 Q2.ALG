algoritmo "Prova N2 Q2"

var
   Gabarito: vetor[1..13] de inteiro
   Prova: vetor[1..13] de inteiro

   contador1, contador2, acertos, apostadores, ID: inteiro

inicio

   Gabarito[1]:= 1
   Gabarito[2]:= 2
   Gabarito[3]:= 3
   Gabarito[4]:= 1
   Gabarito[5]:= 3
   Gabarito[6]:= 3
   Gabarito[7]:= 3
   Gabarito[8]:= 2
   Gabarito[9]:= 2
   Gabarito[10]:= 1
   Gabarito[11]:= 2
   Gabarito[12]:= 3
   Gabarito[13]:= 1

   escreva("Insira a quantidade de apostadores na casa, lembrando que só é possível haver 100 apostadores: ")
   leia(apostadores)
   escreval(" ")

   enquanto (apostadores < 1 ) ou (apostadores > 100) faca
      escreva("Quantidade inválida! Insira novamente: ")
      leia(apostadores)
      escreval(" ")
   fimenquanto

   escreval("Marque a prova com '1, 2 ou 3', qualquer outra letra ou número será anulado")
   escreval(" ")
   escreval(" ")
   para contador1 de 1 ate apostadores faca
      escreva("Insira a ID no cartão do apostador",contador1,": ")
      leia(ID)
      escreval(" ")
      escreval(" ")
      escreval("Marque a prova de aposta:")
      escreval(" ")
      escreval(" ")
      para contador2 de 1 ate 13 faca
         escreva("Questão ",contador2,": ")
         leia(Prova[contador2])
         escreval(" ")
         se (Gabarito[contador2] = Prova[contador2]) entao
            acertos:= acertos+1
         fimse
      fimpara
      se (acertos=13) entao
         escreval(" ")
         escreval(" ")
         escreva("Parabéns! O Apostador ",ID," ganhou!")
      senao
         escreva("Perdeu, passa o dinheiro pra cá. O Apostador ",ID," perdeu!")
      fimse
      escreval(" ")
      escreval(" ")
      escreval(" ")
      escreval(" ")
   fimpara

fimalgoritmo