Algoritmo "Prova_1_1_Marcella"

Var
   totalgeral: vetor[1..50] de real
   nome: vetor[1..50] de caracter
   numerodiaria: vetor [1..50] de inteiro
   totaldiaria,porcent,taxa,diaria,mdiaria,ganhodiaria,ganhotaxa: real
   pessoas,n,i: inteiro

Inicio
   diaria:=300

   Escreval("Digite o numero de hospedes:")
   leia(n)

   para i de 1 ate n faca

      Escreval("Digite o nome do hospede: ")
      leia(nome[i])

      Escreval("Digite o numero de numero de diaria:")
      leia(numerodiaria[i])

      se(numerodiaria[i]<=10)entao
         taxa:=50
      senao
         se(numerodiaria[i]<=15) e(numerodiaria[i]>10) entao
            taxa:=60
         senao
            se(numerodiaria[i]>15)entao
               taxa:=70
               pessoas:=pessoas+1
            fimse
         fimse
      fimse

      totaldiaria:= totaldiaria+numerodiaria[i]
      totalgeral[i]:=(numerodiaria[i]*diaria)+ (taxa*numerodiaria[i])
      ganhodiaria:=ganhodiaria + (numerodiaria[i]*diaria)
      ganhotaxa:= ganhotaxa+ (taxa*numerodiaria[i])
      mdiaria:=(ganhodiaria/300)/pessoas

   fimpara

   porcent:= (pessoas*100)/n


   para i de 1 ate n faca
      Escreval("Pessoa: ",nome[i])
      Escreval("Total para pagar: ",totalgeral[i])
      Escreval("Numero de diarias: ",numerodiaria[i])

   fimpara
   Escreval("Total ganho diaria: ",ganhodiaria)
   Escreval("Total ganho de taxa: ",ganhotaxa)
   Escreval("Media de diarias: ",mdiaria)
   Escreval("% pessoas mais de 15 dias: ",porcent)

Fimalgoritmo