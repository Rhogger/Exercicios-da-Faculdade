algoritmo "23"

var
A,X,C: inteiro

inicio
escreval("O algoritmo ir� mostrar n�meros indefinidamente e se s�o primos ou n�o.")
X:=1
escreval("   ")
escreval("Insira os valores para dar continuidade e 0 para cancelar.")
enquanto (X<>0) faca
leia (X)
escreval("   ")
para A de 1 at� X faca
se (X%A=0) entao
C:= C+1
fimse
A:=A+1
se (C=2) entao
escreval("O n�mero ",X," � primo!")
senao
escreval("O n�mero ",X," n�o � primo!")
fimse
fimpara

fimalgoritmo