algoritmo "Divisíveis por 11 com resto 5"

var
X: inteiro

inicio
X:=1000
escreval("Sequência:")
enquanto (X>=1000) e (X<=2000) faca
escreva("   ")
se (X%11=5) entao
escreva("   \",X,"\ ")
fimse
X:= X+1
fimenquanto

fimalgoritmo