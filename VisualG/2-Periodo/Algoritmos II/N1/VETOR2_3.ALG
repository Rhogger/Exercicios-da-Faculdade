algoritmo "Vetor2_3"

var
   vetorA: vetor[0..19] de inteiro
   vetorB: vetor[0..19] de inteiro
   vetorC: vetor[0..3] de caractere
   vetorD: vetor[0..19] de real
   contador,char: inteiro
   operacao: real

inicio
   escreval("Insira os valores para os Vetor A[] e B[] : ")
   para contador de 0 ate 19 faca
      escreval(" ")
      se (char<4) entao
         char:= 0
      fimse
      escreva("A[",contador," ] = ")
      leia(vetorA[contador])
      escreval(" ")
      escreva("B[",contador," ] = ")
      leia(vetorB[contador])
      escreval(" ")
      escreva("Insira a operação que deseja realizar: ")
      leia(vetorC[char])
      se (vetorC[char]="+") entao
         operacao:= vetorA[contador]+vetorB[contador]
      senao
         se (vetorC[char]="-") entao
            operacao:= vetorA[contador]-vetorB[contador]
         senao
            se (vetorC[char]="*") entao
               operacao:= vetorA[contador]*vetorB[contador]
            senao

               se (vetorC[char]="/") e (vetorB[contador]<>0) entao
                  operacao:= vetorA[contador]/vetorB[contador]
               senao
                  se (vetorC[char]="/") e (vetorB[contador]=0) entao
                     escreva(" ")
                  senao
                     escreval("Operação inválida!")
                  fimse
               fimse
            fimse
         fimse
      fimse

   escreval(" ")
   vetorD[contador]:= operacao
   se (vetorC[char]="/") e (vetorB[contador]=0) entao
      escreval("Impossível dividir por zero!")
   senao
      escreval("RESULTADO:")
      escreva(vetorA[contador]," ",vetorC[char]," ",vetorB[contador]," = ",(vetorD[contador]:2)
   fimse
   escreval(" ")
   escreval(" ")
   escreval(" ")
   char:= char+1
fimpara
fimalgoritmo
