algoritmo "C�digo aluno e altura"

var
cod_aluno,aux_cod_aluno,A,alt,aux_alt: inteiro

inicio
aux_alt:= 0
alt:= 100
A:=1
escreval("----------------------------------------------Aviso ----------------------------------------------")
escreval("V�lidos somente n�meros positivos e de 1 a 100 para o n�mero do aluno e 100 at� 210cm para altura.")
escreval(" ")
enquanto (A<6) faca
escreva("Insira o n�mero do aluno: ")
leia(cod_aluno)
se (cod_aluno<1) ou (cod_aluno>100) entao
 escreval("N�mero inserido est� inv�lido!")
 escreval(" ")
 A:=A-1
senao
 escreva("Insira a altura (em cent�metros) do aluno: ")
 leia(alt)
 escreval(" ")
fimse
se (alt<100) ou (alt>210) entao
 escreval("N�mero inserido est� inv�lido!")
 escreval(" ")
 A:=A-1
senao
 se (alt>aux_alt) entao
  aux_alt:= alt
  aux_cod_aluno:= cod_aluno
 fimse
fimse
A:=A+1
fimenquanto
escreval(" ")
escreval("O aluno mais alto � o N�",aux_cod_aluno," com altura de",aux_alt,"cm.")
escreval(" ")

fimalgoritmo