algoritmo "ProvaN3"

var
num_alunos,A: inteiro
nome: caractere
N1,N2,N3,media: real //pesos 3,3,4

inicio
escreva("Insira o número de alunos: ")
leia(num_alunos)
limpatela
para A de 0 ate num_alunos faca
escreva("Escreva o nome do aluno: ")
leia(nome)
escreval("Insira as notas das 3 provas do aluno: ")
leia(N1)
leia(N2)
leia(N3)
media:= ((N1*3)+(N2*3)+(N3*4))/3+3+4
limpatela
escreval("Nome: ", nome)
escreval("Notas: ",N1,",",N2,"e ",N3,". Com média de: ", media)
leia(A)
limpatela
fimpara
fimalgoritmo
