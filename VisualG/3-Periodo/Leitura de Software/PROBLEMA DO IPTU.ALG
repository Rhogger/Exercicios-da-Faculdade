algoritmo "Problema do IPTU"

var
   id_imovel, qtd_imovel, qtd_meses: inteiro
   juro_atraso, calc_iptu, val_iptu, calc_multa, calc_juros, soma_total: real

inicio
   escreval("Calculador da Multa de IPTU")
   escreval("")

   repita
      escreva("Insira o valor do IPTU: ")
      leia(val_iptu)
      escreval("")

      escreva("Insira a quantidade de meses em atraso do im�vel:")
      leia(qtd_meses)
      escreval("")

      se (qtd_meses > 0) entao
         juro_atraso := qtd_meses * val_iptu * 0.015
         qtd_imovel := qtd_imovel+1
         soma_iptu := soma_iptu + val_iptu
         soma_juros := soma_juros + juro_atraso
      senao
         soma_iptu := soma_iptu + val_iptu
      fimse

      escreval("Deseja continuar o c�lculo?")
      escreval("[1] SIM")
      escreval("[ENTER] N�O")
      leia(id_imovel)
      limpatela

   ate (id_imovel=0)

   soma_multa := soma_multa + (soma_iptu * 0.02)
   soma_total := soma_multa+soma_juros+soma_iptu

   escreval("")
   escreval("A quantidade de im�veis que foram calculados �: ",qtd_imovel)
   escreval("O valor total pago em IPTu �: ",soma_iptu)
   escreval("O valor total em multa por atraso �: ",soma_multa)
   escreval("O valor total em juros de atrasos por m�s �: ", soma_juros)
   escreval("Somando isso tudo, dever� pagar: R$",soma_total)

fimalgoritmo