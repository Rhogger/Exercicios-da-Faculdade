Algoritmo "Duas datas"

Var
dia1, mes1, ano1, dia2, mes2, ano2, diastotalA, diastotalM, dia, c, j, data1 : inteiro

Inicio
dia1:=1

enquanto dia1 > 0 faca
 diastotalM:=0
 escreval("Insira a 1° data (dia/mês/ano): ")
 escreval("  ")
 escreval("(Para encerrar o código, insira um número negativo)")
 escreva("Dia: ")
 leia(dia1)
se(dia1>0) e (dia1<31) entao
 escreva("Mês: ")
 leia(mes1)
 escreva("Ano: ")
 leia(ano1)
 escreval("Agora, insira a 2° data: ")
 escreva("Dia: ")
 leia(dia2)
 escreva("Mês: ")
 leia(mes2)
 escreva("Ano: ")
 leia(ano2)
fimse

diastotalA:= ano2-ano1
diastotalM:=diastotalA*365

para c de ano1 ate ano2 faca
se(c%4 = 0)e(c%100 <> 0)entao
diastotalA:=diastotalA+1
fimse
fimpara

se(mes1>mes2)entao
j:=mes2

enquanto (j <> mes1) faca
se (j=1) ou (j=3) ou (j=5) ou (j=7) ou (j=8) ou (j=10) ou (j=12) entao
diastotalM:=diastotalM-31
senao
fimse
se(j=2)entao
diastotalM:=diastotalM-28
senao
fimse
se (j=4)ou(j=6)ou(j=9)ou(j=11)entao
diastotalM:=diastotalM-30
fimse
j:= j+1
fimenquanto
fimse

se(mes2>mes1)entao
j:=mes1
enquanto (j <> mes2) faca
se (j=1) ou (j=3) ou (j=5) ou (j=7) ou (j=8) ou (j=10) ou (j=12) entao
diastotalM:=diastotalM+31
fimse
se(j=2)entao
diastotalM:=diastotalM+28
fimse
se (j=4)ou(j=6)ou(j=9)ou(j=11)entao
diastotalM:=diastotalM+30
fimse
j:=j+1
fimenquanto

fimse


//dia
dia:=dia2-dia1

dia:=dia+diastotalM+diastotalA

escreval("Total de dias: ",dia)

timer (1500)
limpatela
timer (0)
fimenquanto

Fimalgoritmo