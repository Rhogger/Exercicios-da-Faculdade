Algoritmo "Repeti��es"

Var

   matrix, matrixRep: vetor[1..15,1..5] de inteiro
   L1, C1, L2, C2: inteiro


inicio

   //Entrada de Dados

   //1� FOR para LiNHAS
   para L1 de 1 ate 15 faca

      //2� FOR para COLUNAS
      para C1 de 1 ate 5 faca

         escreva ("Insira um N� para a matriz[",L1,",",C1,"]: ")
         leia(matrix[L1, C1])

      fimpara

   fimpara





   //Limpa a Tela para n�o ficar cheio de dados
   limpatela






   //Sa�da de Dados
   //1� FOR para LiNHAS
   para L1 de 1 ate 15 faca

      //2� FOR para COLUNAS
      para C1 de 1 ate 5 faca

       escreva(matrix[L1, C1]:4)

      fimpara

      escreval ("")

   fimpara


   escreval ("")
   escreval ("")
   escreval ("")



   para L1 de 1 ate 15 faca
      para C1 de 1 ate 5 faca
         para L2 de 1 ate 15 faca
            para C2 de 1 ate 5 faca
               se (matrix[L1, C1] = matrix[L2, C2])entao
                  matrixRep[L1, C1]:= matrixRep[L1, C1]+1
               fimse
            fimpara
         fimpara
      fimpara
   fimpara

   para L1 de 1 ate 15 faca
      para C1 de 1 ate 5 faca
         se (matrixRep[L1, C1] > 1) entao
            escreval("O N�mero",matrix[L1, C1]," se repetiu",matrixRep[L1, C1]," vezes!")
            para L2 de 1 ate 15 faca
               para C2 de 1 ate 5 faca
                  se (matrix[L1, C1] = matrix[L2, C2]) entao
                     matrixRep[L2, C2]:= 0
                  fimse
               fimpara
            fimpara
         fimse
      fimpara
   fimpara


Fimalgoritmo