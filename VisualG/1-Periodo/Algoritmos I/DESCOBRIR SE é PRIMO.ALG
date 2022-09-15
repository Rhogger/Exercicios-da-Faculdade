algoritmo "Descobrir se é primo"

var
A,X,C,A2,A3,D,Enter: inteiro
soma:real

inicio
escreval("Este algoritmo irá identificar se o número digitado é primo ou não!")
escreval("    ")
escreva("Só será válido números de 1 a 1000")
escreval("   ")
escreval("...Tecle Enter para iniciar...")
leia(Enter)
limpatela
para A2 de 1 ate 100 faca
 escreva("Insira o valor desejado: ")
 leia (X)
 escreval("   ")
 escreval("...Tecle Enter para continuar...")
 leia(Enter)
 limpatela
se (X>1) entao
para A3 de 1 ate X faca
 soma:= X/A3
 se (X%A3=0) entao
  D:=D+1
 fimse
 A3:= A3+1
fimpara
fimse
para A de 1 ate X faca
 se (X>1) e (X%A=0) entao
  C:= C+1
 fimse
 A:=A+1
fimpara
se (X<0) e (X>1000) entao
 escreva("....Você inseriu um valor fora dos permitidos!....")
senao
 se (C=2) ou (D=2) entao
  escreval("O número ",X," é primo!")
 senao
  se (X>1) e (X%A3=0) entao
   escreval("O número ",X," possui ",D," divisores!")
   senao
   se (X=1) entao
    escreval("O número 1 não é primo, pois ele divide somente por ele mesmo!")
   senao
    se (X=0) entao
     escreval("Zero não é primo, pois não tem divisores!")
    senao
     escreval("O número ",X," não é primo!")
    fimse
   fimse
  fimse
 fimse
fimse
C:= 0
D:= 0
A2:= A2+1
escreval("   ")
escreval("...Tecle Enter para continuar...")
leia(Enter)
limpatela
fimpara
limpatela

fimalgoritmo
