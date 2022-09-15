algoritmo "Vetor2_2"
var
//Vetor de Nomes
vetorN: vetor[1..10] de caractere
//Vetor da 1° Nota
vetorN1: vetor[1..10] de real
//Vetor da 2° Nota
vetorN2: vetor[1..10] de real
//Vetor das Médias
vetorM: vetor[1..10] de real

nota1,nota2,media,nome,aprovados,alunos: inteiro

inicio

escreval("=-=-=-=-=-= Listagem da Turma =-=-=-=-=-=")
escreval(" ")
escreval("Informativo: ")
escreval("- Cada turma pode somente até 10 alunos")
escreval("- As notas não podem ser menor que 0 ou mais que 10")
escreval(" ")
escreva("Informe o número de alunos: ")
leia(alunos)

enquanto (alunos<1) ou (alunos>10) faca
escreva("Quantidade inválida de alunos. Digite novamente: ")
leia(alunos)
escreval(" ")
fimenquanto
limpatela

para nome de 1 ate alunos faca
nota1:= nota1+1
nota2:= nota2+1
media:= media+1
escreva("Insira o nome do aluno",nome,": ")
leia(vetorN[nome])
escreva("Insira a 1° Nota: ")
leia(vetorN1[nota1])
enquanto (vetorN1[nota1]<0) ou (vetorN1[nota1]>10) faca
escreva("Insira a 1° Nota novamente: ")
leia(vetorN1[nota1])
fimenquanto
escreva("Insira a 2° Nota: ")
leia(vetorN2[nota2])
enquanto (vetorN2[nota2]<0) ou (vetorN2[nota2]>10) faca
escreva("Insira a 2° Nota novamente: ")
leia(vetorN2[nota2])
fimenquanto
vetorM[media]:= (vetorN1[nota1] + vetorN2[nota2])/2
escreval(" ")
escreval(" ")
fimpara

escreval(" ")
escreval(" ")
media:= 0
escreval("=-=-=-=-=-= Média dos alunos =-=-=-=-=-=")
escreval(" ")

para nome de 1 ate alunos faca
media:= media+1
escreval(vetorN[nome]:15,vetorM[media]:2:2)
se (vetorM[media]>6) entao
aprovados:= aprovados+1
fimse
fimpara

escreval("=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
escreval(" ")
escreval(" ")
escreva(aprovados," Alunos foram aprovados com média acima de 6.")
escreval(" ")
escreval(" ")

fimalgoritmo