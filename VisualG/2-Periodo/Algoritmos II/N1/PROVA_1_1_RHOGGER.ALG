algoritmo "Prova_1_1_Rhogger"

var
   //vetor dos nomes do grupo
   vetorN: vetor[1..50] de caractere

   //vetor das di?rias por pessoa
   vetorD: vetor[1..50] de inteiro

   //vetor do total a pagar por pessoa
   vetorT: vetor[1..50] de inteiro

   diarias,diarias_total,taxa,taxa_total,total_a_pagar,pessoas,nome,contador,perc: inteiro
   media,porcentagem: real

inicio

   //Define o limite do vetor
   escreva("Informe o n?mero de pessoas no grupo: ")
   leia(pessoas)
   escreval(" ")

   //N?o deixa digitar valores fora do conjunto (0-50)
   enquanto (pessoas < 0) ou (pessoas>50) faca

      se (pessoas<0) entao
         escreval("N?mero inserido ? inv?lido, digite um n?mero positivo e inteiro!")
      senao
         se (pessoas>50) entao
            escreval("O limite por grupo ? de 50 pessoas!")
         fimse
      fimse

      escreval(" ")
      escreva("Insira novamente: ")
      leia (pessoas)

   fimenquanto

   //Define se ter? pessoas suficientes para fazer o or?amento da viagem
   se (pessoas=0) entao
      escreval("Nenhuma pessoa frequentar? a pousada!")
   senao
      se (pessoas>0) e (pessoas<=50) entao

         //Define quantos dias, o c?lculo das taxas e  uma pessoa ficar? na ilha
         para contador de 1 ate pessoas faca

            escreval(" ")
            escreval("------  Cadastro das pessoas  ------")
            escreval("Pessoas cadastradas: ",contador)
            escreval(" ")

            //Nome da pessoa
            nome:= nome+1
            escreva("Nome: ")
            leia(vetorN[nome])
            escreval(" ")

            //Quantos dias a pessoa vai ficar na pousada
            diarias:= diarias+1
            escreva("Quantos dias vai ficar: ")
            leia(vetorD[diarias])
            escreval(" ")

            enquanto (vetorD[diarias]<1) faca
               escreval("N?o ? poss?vel inserir essa quantidade de dias!")
               escreva("Insira novamente: ")
               leia(vetorD[diarias])
            fimenquanto


            //Calculo da taxa
            se (vetorD[diarias] <=10) entao
               taxa:= 50
            senao
               se (vetorD[diarias] >10) e (vetorD[diarias] <=15) entao
                  taxa:= 60
               senao
                  se (vetorD[diarias] > 15) entao
                     taxa:= 70
                     perc:= perc+1
                  fimse
               fimse
            fimse

            //Calculos finais
            taxa_total:= (taxa*vetorD[diarias])+taxa_total
            diarias_total:= (vetorD[diarias]*300)+diarias_total
            total_a_pagar:= total_a_pagar+1
            vetorT[total_a_pagar]:= (taxa+300)*vetorD[diarias]
            limpatela

         fimpara

         media:= (diarias_total/300)/pessoas
         porcentagem:= (perc/pessoas)*100


         //Lista final
         escreval(" ")
         escreval("------  Lista das pessoas do grupo  ------")
         escreval(".--------------------------.")

         nome:= 0
         diarias:= 0
         total_a_pagar:= 0

         para contador de 1 ate pessoas faca

            nome:= nome+1
            diarias:= diarias+1
            total_a_pagar:= total_a_pagar+1
            escreval("|")
            escreval("|  Nome: ",vetorN[nome])
            escreval("|  Di?rias: ",vetorD[diarias])
            escreval("|  Total a pagar: ",vetorT[total_a_pagar])
            escreval("|")

         fimpara

         escreval(".--------------------------.")

         //Dados da Pousada
         escreval("Dados calculados da Pousada: ")
         escreval(" ")
         escreval("O ganho total das di?rias foram R$",diarias_total,",00")
         escreval(" ")
         escreval("O ganho total das taxas foram R$",taxa_total,",00")
         escreval(" ")
         escreval("M?dia de di?rias/pessoas: ",media)
         escreval(" ")
         escreval("Porcentagem de pessoas que ficaram mais que 15 dias: ",porcentagem)
         escreval(" ")
         escreval(" ")

      fimse
   fimse

fimalgoritmo