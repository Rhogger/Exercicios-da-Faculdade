algoritmo "N�mero Perfeito"

var
X,A,soma: inteiro

inicio
escreva("Insira um valor para determinar se esse n�mero � perfeito: ")
leia (X)
escreval(" ")
soma:= 0
para A de 1 ate (X-1) faca
se (X%A=0) entao
soma:= soma+A
fimse
A:=1
fimpara
se (soma=X) entao
escreval("O n�mero",X," � perfeito!")
senao
escreval("O n�mero",X," n�o � perfeito!")
fimse

fimalgoritmo