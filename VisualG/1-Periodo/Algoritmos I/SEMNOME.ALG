algoritmo "semnome"

var
   Ti,Tf: inteiro
   hourI,minuteI,secI,SomaH,SomaM,SomaS,Duracao,hourF,minuteF,secF: real
   day: caractere
inicio
   escreva("Qual foi a exata hora em que o jogo começou?: ")
   leia (hourI)
   escreva("e o exato minuto?: ")
   leia (minuteI)
   escreva("e o exato segundo?: ")
   leia (secI)
   escreval("Então o jogo começou às: ",hourI ," horas," ,minuteI ," minutos e " ,secI ," segundos")
   escreva("Agora me diga, que horas acabou o jogo?: ")
   leia (hourF)
   escreval("e o minuto?: ")
   leia (minuteF)
   escreval("e o segundo?: ")
   leia (secF)
   SomaH:= (hourF - hourI)
   Se (SomaH<0) entao
      SomaH:= (SomaH * (-1)) - (24)
      SomaH:= (SomaH* (-1))
   senao
      SomaH:=SomaH
   fimse
   SomaM:= (minuteF - minuteI)/ 60
   Se (SomaM<0) entao
      SomaM:= (SomaM * (-1)) - (60)
      SomaM:= (SomaM* (-1))
   senao
      SomaM:=SomaM
   fimse
   SomaS:= (secF - secI)
   Se (SomaS<0) entao
      SomaS:= (SomaS * (-1)) - (60)
      SomaS:= (SomaS* (-1))
   senao
      SomaS:=SomaS
   fimse
   Duracao:= SomaH+SomaM+SomaS
   escreva("A duração do jogo foi: ",SomaH, " Horas", SomaM, " ,minutos)



fimalgoritmo

Se (A<0) entao
   A:= (A * (-1)) - (24)
   A:= (A* (-1))
senao

fimse