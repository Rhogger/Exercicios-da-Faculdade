algoritmo "Cinema-2"
var
   B      :vetor [1..10] de inteiro
   resp   :caractere
   i      :inteiro
   reserva:inteiro

inicio

procedimento Nome()
inicio
   escreval ("---------------------------------------------------")
   escreval ("                   Cinema Nort                     ")
   escreval ("---------------------------------------------------")
fimProcedimento

repita
   nome()
   para i <- 1 ate 10 faca
      se (B[i] = 1) entao
         escreva (" [--]")
      senao
         escreva (" [B",I,"]")
      fimse
   fimpara
   escreval()
   Escreva ("Reserva a cadeira: B")
   leia(reserva)
   se (B[reserva] = 1) ENTÃO
      escreval ("ERRO: LUGAR OCUPADO")
   seNao
      B[reserva] <- 1
      escreval ("Cadeira ",reserva," reservada.")
   fimSe

   escreva ("Quer reserva outro? [S/N] ")
   leia (Resp)
   limpaTela

ate (resp = "N")
fimAlgoritmo