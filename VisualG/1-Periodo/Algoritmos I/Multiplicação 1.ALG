Algoritmo "Multiplicação 1"
//Uma sorveteria vende três tipos de picolés. Sabendo-se que o picolé do tipo 1 é vendido por
//R$  0.50, o do tipo 2 por R$ 0.60 e o do tipo 3 por R$ 0.75, faça um algoritmo que,
//para cada tipo de  picolé, mostre a quantidade vendida e o total arrecadado.

var
p1,p2,p3,t1,t2,t3,total: real
q1,q2,q3: inteiro

inicio
p1:= 0.5
p2:= 0.6
p3:= 0.75
escreva("Quantos picolés tipo 1 foram vendidos?: ")
leia (q1)
t1:= p1*q1
escreval("Foi arrecadado: ", t1, " reais")
escreva("Quantos picolés tipo 2 foram vendidos?: ")
leia (q2)
t2:= p2*q2
escreval("Foi arrecadado: ", t2, " reais")
escreva("Quantos picolés tipo 3 foram vendidos?: ")
leia (q3)
t3:= p3*q3
escreval("Foi arrecadado: ", t3, " reais")
total:= (t1+t2+t3)
escreva("O total arrecadado foi: ", total, " reais")

fimalgoritmo