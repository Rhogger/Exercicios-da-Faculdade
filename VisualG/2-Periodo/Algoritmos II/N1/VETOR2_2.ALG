algoritmo "Vetor2_2"
var
vetorA: vetor[0..5] de inteiro
vetorB: vetor[0..5] de inteiro
vetorC: vetor[0..11] de inteiro
contador1,contador2: inteiro

inicio
escreval("Insira valores para o Vetor A[] :")
para contador1 de 0 ate 5 faca
escreva("A[ ",contador1,"] = ")
leia(vetorA[contador1])
escreval(" ")
vetorC[contador1]:= vetorA[contador1]
fimpara
escreval("Insira valores para o Vetor B[] :")
para contador2 de 0 ate 5 faca
contador1:= contador1+1
escreva("B[ ",contador2,"] = ")
leia(vetorB[contador2])
escreval(" ")
vetorC[contador1]:= vetorB[contador2]
fimpara
escreval("Apresentação do Vetor C[] :")
para contador1 de 0 ate 11 faca
escreval("C[ ",contador1,"] = ",vetorC[contador1])
fimpara

fimalgoritmo