algoritmo "semnome"

var
A,B,R: real

inicio
escreva("Insira o primeiro valor para ser dividido pelo segundo: ")
leia (A)
escreva("Agora insira o segundo valor: ")
leia (B)
R:= A/B
se (B=0) ent�o
escreval("� imposs�vel dividir por 0!")
fimse
escreva("Qual o valor dessa divis�o?: ",R)

fimalgoritmo