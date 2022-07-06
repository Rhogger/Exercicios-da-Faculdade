Algoritmo "Média Ponderada"
//Faça um algoritmo que receba três notas e seus respectivos pesos, calcule e
//e mostre a média ponderada dessas notas.
//Mostre uma mensagem com a situação do aluno, sabendo que a média  para aprovação é 7.0.

Var
   Nota1,Nota2,Nota3,Media: real
   peso1,Peso2,Peso3: inteiro

Inicio
   escreva("Insira a 1° nota do aluno: ")
   leia (Nota1)
   escreva("Qual o peso dessa 1° avaliação?: ")
   leia (Peso1)
   escreva("Insira a 2° nota do aluno: ")
   leia (Nota2)
   escreva("Qual o peso dessa 2° avaliação?: ")
   leia (Peso2)
   escreva("Insira a 3° nota do aluno: ")
   leia (Nota3)
   escreva("Qual o peso dessa 3° avaliação?: ")
   leia (Peso3)
   Media:= ((Nota1*Peso1) + (Nota2*Peso2) + (Nota3*Peso3))/(Peso1+Peso2+Peso3)
   Se (Media>= 7) entao
      escreval("Parabéns! O aluno foi aprovado com a média de: ", Media)
   Senao
      se (Media<7) entao
         escreva("O aluno foi reprovado com a média de: ", Media)
      fimse
   fimse
Fimalgoritmo