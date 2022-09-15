algoritmo "Apresentação de termos de 1 a 10"

var
A,C,X,aux: inteiro
termo: caractere
inicio
termo:= "° Termo: 1/"
escreva("Insira um valor para mostrar a tabuada dele com expoente -1: ")
leia(X)
aux:= X
para A de 1 ate 10 faca
escreval(A,termo,X)
A:= A+1
X:= aux*A
fimpara

fimalgoritmo