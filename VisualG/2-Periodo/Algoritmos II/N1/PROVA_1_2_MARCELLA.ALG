Algoritmo "Prova_1_2_Marcella"

Var
  // Seção de Declarações das variáveis
  idade: vetor [1..50] de inteiro
  sexo: vetor [1..50] de caracter
  i,mulhermeia,maior,menor: inteiro
  midade,homemvelho : real
  sexomaior,sexomenor: caracter

Inicio
  // Seção de Comandos, procedimento, funções, operadores, etc...
  Escreval ("--- PESQUISA ---")
  para i de 1 ate 50 faça
     Escreval ("Qual a idade da pessoa,",i," ?")
     leia(idade[i])
     Escreval ("Sexo da pessoa,",i," (Digite 'M' p/ Masc. e 'F' p/ Femin.) ?")
     leia(sexo[i])
     Escreval ("_________")

     midade:= midade+idade[i]

  fimpara

  para i de 1 ate 50 faça

     se i = 1 entao
        menor := idade[i]
        maior := idade[i]
     fimse

     se (idade[i] > 40) e (sexo[i] = "m") entao
        homemvelho := homemvelho +1
     fimse
     se (idade[i] < 35) e (sexo[i] = "f") entao
        mulhermeia := mulhermeia +1
     fimse

     se  idade[i] > maior entao
        maior:= idade[i]
        sexomaior:= sexo[i]
     fimse
     se  idade[i] < menor entao
        menor:= idade[i]
        sexomenor:= sexo[i]
     fimse

  fimpara

  homemvelho := (homemvelho / i)*100
  midade:= midade / i

  Escreval ("A media de idade do grupo foi de:",midade," anos de idade!")
  Escreval ("Porcentagem de homens com idade superior a 40 anos:",homemvelho,"%")
  Escreval ("Quantidade de mulheres com idade inferior a 35 anos: ",mulhermeia)
  Escreval ("Maior idade:",maior," e do sexo:",sexomaior)
  Escreval ("Menor idade:",menor," e do sexo:",sexomenor)

Fimalgoritmo