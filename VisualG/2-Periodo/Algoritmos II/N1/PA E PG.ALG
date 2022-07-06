algoritmo "PA e PG"

var
c,posicao_termo: inteiro
termo1,razao: real

inicio
escreval("Informar os primeiros termos de uma PA: ")
escreval(" ")
escreval(" ")
escreval("Insira a razão: ")
leia (razao)
escreval(" ")
escreval("Insira o 1° termo: ")
leia (termo1)
escreval(" ")
escreval("Insira a posição do termo: ")
leia (posicao_termo)
escreval(" ")
escreval("Os primeiros termos da PA são: ")
escreva("        ")
para c de 1 ate posicao_termo faca
escreva(termo1)
termo1:= termo1+razao
fimpara
escreval(" ")
escreval(" ")
escreval("Agora para informar os primeiros termos de PG!")
escreval(" ")
termo1:= 0
razao:= 0
posicao_termo:= 0
escreval(" ")
escreval("Insira a razão: ")
leia (razao)
escreval(" ")
escreval("Insira o 1° termo: ")
leia (termo1)
escreval(" ")
escreval("Insira a posição do termo: ")
leia (posicao_termo)
escreval(" ")
escreval("Os primeiros termos da PG são: ")
escreva("        ")
para c de 1 ate posicao_termo faca
escreva(termo1)
termo1:= termo1*razao
fimpara
fimalgoritmo