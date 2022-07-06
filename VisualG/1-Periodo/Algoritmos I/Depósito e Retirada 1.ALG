Algoritmo "Deposito e Retirada 1"
//Escreva um algoritmo que, para uma conta bancária, leia o seu número, o saldo, o tipo de
//operação a ser realizada (depósito ou retirada) e o valor da operação.
//Após, determine e mostre  o novo saldo.
//Se o novo saldo ficar negativo, deve ser mostrada, também, a mensagem “conta  estourada”.

Var
Num,choice,choice2: caractere
saldo,dep,ret,newS:real

Inicio
escreval("Bem vindo ao banco do Brasol! A descrição da sua conta bancária está abaixo: ")
escreva("Número da conta: ")
leia (Num)
escreva("Saldo de: ")
leia (Saldo)
escreva("Deseja realizar uma operação?: ")
leia (choice)
se (choice= "sim") ou (choice= "Sim") entao
escreva("Qual operação deseja realizar? Deposito ou Retirada?: ")
leia (choice2)
senao
escreva("Obrigado por utilizar nosso app! :D")
fimse
se (choice2= "Deposito") ou (choice2= "deposito") ou (choice2= "depósito") ou (choice2= "Depósito") entao
escreva("Qual o valor deseja depositar?: ")
leia (dep)
newS:= saldo + dep
escreva("O novo saldo agora é: ", NewS, " reais.")
senao
 se (choice2= "Retirada") ou (choice2= "retirada") entao
 escreva("Qual o valor deseja retirar?: ")
 leia (ret)
 newS:= saldo - ret
 escreva("O novo saldo agora é: ", NewS, " reais.")
 fimse
fimse
Se (NewS<0) entao
escreval("Sua conta está estourada!")
fimse

Fimalgoritmo