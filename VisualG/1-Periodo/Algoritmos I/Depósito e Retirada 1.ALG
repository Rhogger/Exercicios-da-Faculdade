Algoritmo "Deposito e Retirada 1"
//Escreva um algoritmo que, para uma conta banc?ria, leia o seu n?mero, o saldo, o tipo de
//opera??o a ser realizada (dep?sito ou retirada) e o valor da opera??o.
//Ap?s, determine e mostre  o novo saldo.
//Se o novo saldo ficar negativo, deve ser mostrada, tamb?m, a mensagem ?conta  estourada?.

Var
Num,choice,choice2: caractere
saldo,dep,ret,newS:real

Inicio
escreval("Bem vindo ao banco do Brasol! A descri??o da sua conta banc?ria est? abaixo: ")
escreva("N?mero da conta: ")
leia (Num)
escreva("Saldo de: ")
leia (Saldo)
escreva("Deseja realizar uma opera??o?: ")
leia (choice)
se (choice= "sim") ou (choice= "Sim") entao
escreva("Qual opera??o deseja realizar? Deposito ou Retirada?: ")
leia (choice2)
senao
escreva("Obrigado por utilizar nosso app! :D")
fimse
se (choice2= "Deposito") ou (choice2= "deposito") ou (choice2= "dep?sito") ou (choice2= "Dep?sito") entao
escreva("Qual o valor deseja depositar?: ")
leia (dep)
newS:= saldo + dep
escreva("O novo saldo agora ?: ", NewS, " reais.")
senao
 se (choice2= "Retirada") ou (choice2= "retirada") entao
 escreva("Qual o valor deseja retirar?: ")
 leia (ret)
 newS:= saldo - ret
 escreva("O novo saldo agora ?: ", NewS, " reais.")
 fimse
fimse
Se (NewS<0) entao
escreval("Sua conta est? estourada!")
fimse

Fimalgoritmo