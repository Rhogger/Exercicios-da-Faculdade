Algoritmo "Calcular IMC"
//Faça um algoritmo que leia o nome, altura e peso do usuário.
//Faça o cálculo do IMC do usuário  e escreva o valor do IMC obtido. A fórmula do IMC é a seguinte:

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
escreva("O seu IMC é de: ", IMC, " Kg/m²")

Fimalgoritmo