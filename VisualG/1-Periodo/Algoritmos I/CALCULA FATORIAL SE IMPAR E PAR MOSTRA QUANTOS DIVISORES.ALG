algoritmo "Calcula fatorial se impar e par mostra quantos divisores"

var
X,A,C,C2,C3,D,soma,aux: inteiro

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
 C:= 10
 escreval("1! = 1")
 escreval(" ")
senao
 se (X<0) entao
  escreval("Insira somente n�meros positivos!")
  escreval(" ")
 senao
  se (X>0) entao
   soma:= X*C
  para C2 de 1 at� X faca
   se (X%2=0) e (X%C2=0) entao
    D:=D+1
    C2:= (C2)+1
   fimse
  fimpara
  se (X%2=1) entao
   para C3 de 1 ate (X-2) faca
     aux:= soma
     soma:= aux*C3
     C3:= (C3)+1
   fimpara
   escreval(X,"! = ",soma)
   escreval(" ")
  fimse
  fimse
 fimse
fimse
se (D>0) e (X%2=0) entao
 escreval(X," tem ",D," divisores!")
 escreval(" ")
fimse
se (X=0) entao
 C:= 0
senao
 escreva("Insira novamente um valor para ser calculado o fatorial, coloque 0 se quiser cancelar: ")
fimse
fimenquanto
fimalgoritmo
