algoritmo "Prova_1_2_Rhogger"

var

   //Vetor da idade
   vetorI: vetor[1..50] de inteiro

   //Vetor do sexo
   vetorS: vetor[1..50] de caractere

   //Variáveis
   idade,sexo,contador,mulheres35,maior,menor,m,f,auxMA,auxME,idade_total: inteiro
   auxM,auxF: caractere
   media,porcentagem: real
inicio

   auxMA:= -1
   auxME:= 120


   para contador de 1 ate 50 faca

      escreval("----  Listagem das pessoas do grupo  ----")
      escreval(contador,"° Cadastro:")
      escreval(" ")

      idade:= idade+1
      escreva("Idade: ")
      leia(vetorI[idade])
      escreval(" ")

      enquanto (vetorI[idade]<0) ou (vetorI[idade]>120) faca
         escreva("Idade inválida. Insira novamente: ")
         leia(vetorI[idade])
         escreval(" ")
      fimenquanto

      sexo:= sexo+1
      escreva("Gênero (M para Masculino e F para Feminino): ")
      leia(vetorS[sexo])

      enquanto (vetorS[sexo]<>"F") e (vetorS[sexo]<>"f") e (vetorS[sexo]<>"M") e (vetorS[sexo]<>"m") faca
         escreva("Valor inserido é inválido. Digite novamente: ")
         leia(vetorS[sexo])
      fimenquanto

      se (vetorI[idade]>40) e (vetorS[sexo]="M") ou (vetorS[sexo]="m") entao
         m:= m+1
      senao
         se (vetorI[idade]<35) e (vetorS[sexo]="F") ou (vetorS[sexo]="f") entao
            f:= f+1
         fimse
      fimse

      maior:= vetorI[idade]
      se (maior>auxMA) entao
         auxMA:= maior
         auxM:= vetorS[sexo]
      fimse

      menor:= vetorI[idade]
      se (menor<auxME) entao
         auxME:= menor
         auxF:= vetorS[sexo]
      fimse

      idade_total:= vetorI[idade]+idade_total
      limpatela

   fimpara

   media:= idade_total/50
   porcentagem:= (m/50)*100
   idade:= 0
   sexo:= 0

   escreval(".----  Lista de Pessoas  ----.")
   para contador de 1 ate 50 faca
      idade:= idade+1
      sexo:= sexo+1
      escreval("|  Idade: ",vetorI[idade])
      escreval("  ")
      escreval("|  Gênero: ",vetorS[sexo])
      escreval(" ")
      escreval(" ")
   fimpara

   escreval("A média de idade do grupo é de ",media," anos.")
   escreval(" ")
   escreval("Porcentagem de homens com mais de 40 anos: ",porcentagem,"%")
   escreval(" ")
   escreval("Mulheres com menos de 35 anos: ",f," mulheres.")
   escreval(" ")
   escreval("Pessoa mais velha do grupo tem ",auxMA," e é ",auxM)
   escreval(" ")
   escreval("Pessoa mais nova do grupo tem ",auxME," e é ",auxF)
   escreval(" ")
   escreval(" ")

fimalgoritmo