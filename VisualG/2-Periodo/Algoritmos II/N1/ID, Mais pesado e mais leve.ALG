algoritmo "Atividade 1, Questão 2"

var
leve,pesado,peso,c,aux,id_pesado,id_leve,id,enter: inteiro

inicio

escreval("O algoritmo irá fazer o cadastro do peso de 90 bois e ao fim mostrará o mais pesado e o mais leve.")
c:= 1
pesado:= 0
leve:= 0
escreval(" ")
para c de 1 ate 90 faca
escreva("Boi N° ",c,", insira o peso do boi, em kilos: ")
leia(peso)
escreva("Insira a ID informada no boi: ")
leia (id)
se (peso<=0) entao
escreva("Não é possível informar peso igual a 0 ou menor!")
c:= c-1
senão
 se (c=1) entao
  pesado:= peso
  aux:= peso
  leve:= aux
  id_leve:= id
 senao
  se (peso>=pesado) entao
   pesado:= peso
   id_pesado:= id
  senao
   se (peso<pesado) e (peso<=aux) entao
    aux:= peso
    leve:= aux
    id_leve:= id
   fimse
  fimse
 fimse
fimse
escreva("Tecle enter para continuar: ")
leia (enter)
limpatela
fimpara
escreval("O boi mais pesado é o ",id_pesado,"°, pesando: ",pesado," Kilos!")
escreval(" ")
escreval("O boi mais leve é o ",id_leve,"°, pesando: ",leve," Kilos!")

fimalgoritmo