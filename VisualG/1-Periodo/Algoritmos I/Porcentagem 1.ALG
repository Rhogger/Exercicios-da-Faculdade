Algoritmo "Porcentagem 1"
//Crie o algoritmo Funcion�rio para calcular o aumento salarial de um empregado.
//Por padr�o, o  aumento ser� de 15%.
//Entretanto, deve ser aplicada uma regra diferente para cada faixa salarial.  Regras:
//a) se 1.500,00 <= salarioAtual < 1.750,00: aumento igual a 12%
//b) se 1.750,00 <= salarioAtual < 2.000,00: aumento igual a 10%
//c) se 2.000,00 <= salarioAtual < 3.000,00: aumento igual a 7%
//d) se salarioAtual acima de 3.000,00: aumento igual a 5%.

Var
   SalarioAtual,NovoSalario,SalarioAtualAumentado,Aumento: real

Inicio
   escreva("O sal�rio atual do funcion�rio � de R$: ")
   leia (SalarioAtual)
   escreval("--------------------------------------------------------------------------------")
   escreval("O novo sal�rio vai ser aumentado de acordo com o sal�rio atual do funcion�rio")
   Se (SalarioAtual< 1500)  entao
      NovoSalario:= ((SalarioAtual* 0.15) + SalarioAtual)
      escreva("O novo sal�rio � de R$: ", NovoSalario)
   senao
      Se (SalarioAtual>= 1500) e (SalarioAtual<1750) entao
         NovoSalario:= ((SalarioAtual* 0.12) + SalarioAtual)
         escreva("O novo sal�rio � de R$: ", NovoSalario)
      senao
         Se (SalarioAtual>= 1750) e (SalarioAtual<2000) entao
            NovoSalario:= ((SalarioAtual* 0.1) + SalarioAtual)
            escreva("O novo sal�rio � de R$: ", NovoSalario)
         senao
            Se (SalarioAtual>= 2000) e (SalarioAtual<3000) entao
               NovoSalario:= ((SalarioAtual* 0.07) + SalarioAtual)
               escreva("O novo sal�rio � de R$: ", NovoSalario)
            senao
               Se (SalarioAtual> 3000) entao
                  NovoSalario:= ((SalarioAtual* 0.05) + SalarioAtual)
                  escreva("O novo sal�rio � de R$: ", NovoSalario)
               fimse
            fimse
         fimse
      fimse
   fimse

Fimalgoritmo