algoritmo "Vetor2_5"

var
vetorA,vetorB: vetor[0..19] de inteiro
contador: inteiro

inicio
escreval("Insira valores para o Vetor A[]: ")
para contador de 0 ate 19 faca
escreva("A[",contador," ] = ")
leia(vetorA[contador])
escreval(" ")
fimpara
escreval("Vetor A[] compactado: ")
para contador de 0 ate 19 faca
se (vetorA[contador]>0) entao
vetorB[contador]:= vetorA[contador]
escreval(vetorB[contador])
fimse
fimpara

fimalgoritmo