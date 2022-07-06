algoritmo "23"

var
A,X,C: inteiro

inicio
escreval("O algoritmo irá mostrar números indefinidamente e se são primos ou não.")
X:=1
escreval("   ")
escreval("Insira os valores para dar continuidade e 0 para cancelar.")
enquanto (X<>0) faca
leia (X)
escreval("   ")
para A de 1 até X faca
se (X%A=0) entao
C:= C+1
fimse
A:=A+1
se (C=2) entao
escreval("O número ",X," é primo!")
senao
escreval("O número ",X," não é primo!")
fimse
fimpara

fimalgoritmo