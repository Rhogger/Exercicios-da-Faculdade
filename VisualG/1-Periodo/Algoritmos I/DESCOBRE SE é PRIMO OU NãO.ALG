algoritmo "Descobre se ? primo ou n?o"

var
X,A,C,Enter: inteiro

inicio
X:= 1
C:= 0
enquanto (X<>0) faca
limpatela
escreva("Insira o valor para descobrir se ? primo ou n?o: ")
leia(X)
escreval("  ")
se (X<0) entao
 escreval("N?meros negativos n?o s?o primos.")
senao
 se (X=1) entao
  escreval("O n?mero 1 n?o ? primo, pois divide apenas por ele mesmo.")
 senao
  se (X>0) entao
  enquanto A<=X faca
   se (X%A=0) entao
    C:= C+1
   fimse
  A:=A+1
  fimenquanto
  fimse
 fimse
fimse
se (C=2) e (X>1) entao
 escreval("O n?mero ",X," ? primo.")
senao
 se (C>2) entao
  escreval("O n?mero ",X," ? composto.")
 fimse
fimse
escreval(" ")
escreva("....Tecle Enter para continuar....")
leia(Enter)
fimenquanto

fimalgoritmo