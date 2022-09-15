       algoritmo "Atividade 1, Questão 1"

       var
       num1,num2,num3,maior: inteiro

       inicio
       
       escreval("Insira 3 valores para identificar o maior deles: ")
       leia(num1)
       leia(num2)
       leia(num3)
       escreval(" ")
       se (num1=num2) ou (num2=num3) ou (num1=num3) entao
       escreval("Não é possível inserir 2 ou mais números iguais!")
       senao
        se (num1>num2) e (num2>num3) entao
         escreval("O maior número é o ",num1," e a ordem crescente é: ")
         escreval(num3)
         escreval(num2)
         escreval(num1)
        senao
         se (num1>num3) e (num3>num2) entao
          escreval("O maior número é o ",num1," e a ordem crescente é: ")
          escreval(num2)
          escreval(num3)
          escreval(num1)
         senao
          se (num2>num1) e (num1>num3) entao
           escreval("O maior número é o ",num2," e a ordem crescente é: ")
           escreval(num3)
           escreval(num1)
           escreval(num2)
          senao
           se (num2>num3) e (num3>num1) entao
            escreval("O maior número é o ",num2," e a ordem crescente é: ")
            escreval(num1)
            escreval(num3)
            escreval(num2)
           senao
            se (num3>num1) e (num1>num2) entao
             escreval("O maior número é o ",num3," e a ordem crescente é: ")
             escreval(num2)
             escreval(num1)
             escreval(num3)
            senao
             se (num3>num2) e (num2>num1) entao
              escreval("O maior número é o ",num3," e a ordem crescente é: ")
              escreval(num1)
              escreval(num2)
              escreval(num3)
             fimse
            fimse
           fimse
          fimse
         fimse
        fimse
       fimse
       fimalgoritmo