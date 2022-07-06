algoritmo "semnome"

var
A,B,R: real

inicio
escreva("Insira o primeiro valor para ser dividido pelo segundo: ")
leia (A)
escreva("Agora insira o segundo valor: ")
leia (B)
R:= A/B
se (B=0) então
escreval("É impossível dividir por 0!")
fimse
escreva("Qual o valor dessa divisão?: ",R)

fimalgoritmo