Algoritmo "M�dia Ponderada"
//Fa�a um algoritmo que receba tr�s notas e seus respectivos pesos, calcule e
//e mostre a m�dia ponderada dessas notas.
//Mostre uma mensagem com a situa��o do aluno, sabendo que a m�dia  para aprova��o � 7.0.

Var
   Nota1,Nota2,Nota3,Media: real
   peso1,Peso2,Peso3: inteiro

Inicio
   escreva("Insira a 1� nota do aluno: ")
   leia (Nota1)
   escreva("Qual o peso dessa 1� avalia��o?: ")
   leia (Peso1)
   escreva("Insira a 2� nota do aluno: ")
   leia (Nota2)
   escreva("Qual o peso dessa 2� avalia��o?: ")
   leia (Peso2)
   escreva("Insira a 3� nota do aluno: ")
   leia (Nota3)
   escreva("Qual o peso dessa 3� avalia��o?: ")
   leia (Peso3)
   Media:= ((Nota1*Peso1) + (Nota2*Peso2) + (Nota3*Peso3))/(Peso1+Peso2+Peso3)
   Se (Media>= 7) entao
      escreval("Parab�ns! O aluno foi aprovado com a m�dia de: ", Media)
   Senao
      se (Media<7) entao
         escreva("O aluno foi reprovado com a m�dia de: ", Media)
      fimse
   fimse
Fimalgoritmo