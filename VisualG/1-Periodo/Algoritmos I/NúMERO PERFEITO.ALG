algoritmo "Número Perfeito"

var
X,A,soma: inteiro

inicio
escreva("Insira um valor para determinar se esse número é perfeito: ")
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
escreval("O número",X," é perfeito!")
senao
escreval("O número",X," não é perfeito!")
fimse

fimalgoritmo