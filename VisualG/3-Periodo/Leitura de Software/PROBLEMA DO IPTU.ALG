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

      escreva("Insira a quantidade de meses em atraso do imóvel:")
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

      escreval("Deseja continuar o cálculo?")
      escreval("[1] SIM")
      escreval("[ENTER] NÃO")
      leia(id_imovel)
      limpatela

   ate (id_imovel=0)

   soma_multa := soma_multa + (soma_iptu * 0.02)
   soma_total := soma_multa+soma_juros+soma_iptu

   escreval("")
   escreval("A quantidade de imóveis que foram calculados é: ",qtd_imovel)
   escreval("O valor total pago em IPTu é: ",soma_iptu)
   escreval("O valor total em multa por atraso é: ",soma_multa)
   escreval("O valor total em juros de atrasos por mês é: ", soma_juros)
   escreval("Somando isso tudo, deverá pagar: R$",soma_total)

fimalgoritmo