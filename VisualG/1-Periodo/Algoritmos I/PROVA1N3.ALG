algoritmo "Prova1N3"

var
salario,media,nota1,nota2,nota3: real
alunos,A: inteiro
nome,categoria: caractere

inicio
escreva("Insira o n�mero do aluno: ")
leia (alunos)
escreva("Insira o nome do aluno: ")
leia(nome)
escreval("Insira as notas da primeira, segunda e terceira prova: ")
leia (nota1)
leia(nota2)
leia(nota3)
media:= (nota1+nota2+nota3)/3
limpatela
se (media>=6) e (media<7) entao
categoria:= "C"
salario:= 1000
escreva("O seu est�gio � do tipo C e voc� receber� R$ ",salario)
senao
 se (media>=7) e (media<8) entao
 categoria:= "B"
 salario:= 2000
 escreva("O seu est�gio � do tipo B e voc� receber� R$ ",salario)
 senao
  se (media>8)entao
  categoria:= "A"
  salario:= 3000
  escreva("O seu est�gio � do tipo A e voc� receber� R$ ",salario)
  senao
  escreval("Sua media n�o entra dentro dos requisitos para estagiar!")
  fimse
 fimse
fimse
escreval("N�mero do aluno: ", alunos)
escreval("Nome: ", nome)
escreval("Media final: ", media)
escreval("Categoria de est�gio: ", categoria,", com sal�rio de: ", salario)
leia (A)
limpatela
enquanto (alunos>0) fa�a
escreva("Insira o n�mero do aluno: ")
leia (alunos)
escreva("Insira o nome do aluno: ")
leia(nome)
escreval("Insira as notas da primeira, segunda e terceira prova: ")
leia (nota1)
leia(nota2)
leia(nota3)
media:= (nota1+nota2+nota3)/3
limpatela
se (media>=6) e (media<7) entao
categoria:= "C"
salario:= 1000
escreva("O seu est�gio � do tipo C e voc� receber� R$ ",salario)
senao
 se (media>=7) e (media<8) entao
 categoria:= "B"
 salario:= 2000
 escreva("O seu est�gio � do tipo B e voc� receber� R$ ",salario)
  senao
  se (media>8) entao
  categoria:= "A"
  salario:= 3000
  escreva("O seu est�gio � do tipo A e voc� receber� R$ ",salario)
   senao
   escreval("Sua media n�o entra dentro dos requisitos para estagiar!")
   fimse
  fimse
 fimse
escreval("N�mero do aluno: ", alunos)
escreval("Nome: ", nome)
escreval("Media final: ", media)
escreval("Categoria de est�gio: ", categoria,", com sal�rio de: ", salario)
leia (A)
limpatela
fimenquanto



fimalgoritmo