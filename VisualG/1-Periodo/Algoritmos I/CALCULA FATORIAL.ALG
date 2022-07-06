algoritmo "Calcula fatorial"

var
X,A,C,C2,soma,aux: inteiro

inicio
A:=1
aux:=1
C:=1
escreva("Insira um valor para ser calculado o fatorial: ")
enquanto (C<>0) faca
leia(X)
C:=X-1
escreval("  ")
se (X=1) entao
 escreval("1! = 1")
 escreval(" ")
senao
 se (X<0) entao
  escreval("Insira somente números positivos!")
  escreval(" ")
 senao
  se (X>0) entao
   soma:= X*C
  para C2 de 1 até (X-2) faca
   aux:= soma
   soma:= aux*C2
   C2:= C2+1
  fimpara
  escreval(X,"! = ",soma)
  escreval(" ")
  fimse
 fimse
fimse
se (X=0) entao
 C:= 0
senao
 escreva("Insira novamente um valor para ser calculado o fatorial, coloque 0 se quiser cancelar: ")
fimse
fimenquanto
fimalgoritmo