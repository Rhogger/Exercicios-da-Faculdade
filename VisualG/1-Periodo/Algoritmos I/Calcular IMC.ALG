Algoritmo "Calcular IMC"
//Fa?a um algoritmo que leia o nome, altura e peso do usu?rio.
//Fa?a o c?lculo do IMC do usu?rio  e escreva o valor do IMC obtido. A f?rmula do IMC ? a seguinte:

Var
Nome: Caractere
Peso,Altura,IMC: real

Inicio
escreva("Nome: ")
leia (Nome)
escreva("Qual sua altura?: ")
leia (Altura)
escreva("Qual seu peso?: ")
leia (Peso)
IMC:= Peso/(Altura^2)
escreva("O seu IMC ? de: ", IMC, " Kg/m?")

Fimalgoritmo