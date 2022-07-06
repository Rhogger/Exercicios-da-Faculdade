algoritmo "Vetor2_1"

var
vetorA: vetor[0..19] de inteiro
vetorB : vetor[0..19] de inteiro
contador: inteiro

inicio
escreval("Insira valores para o Vetor A[] :")
para contador de 0 ate 19 faca
escreva("A[ ",contador,"] = ")
leia(vetorA[contador])
escreval(" ")
vetorB[5-contador]:= vetorA[contador]
fimpara
escreval("Vetor B[]")
para contador de 0 ate 19 faca
escreval("B[ ",contador,"] = ",vetorB[contador])
fimpara

fimalgoritmo