Algoritmo "M�dia Aritm�tica 1"
//Considere que o �ltimo vestibular apresentou quatro provas:
//Portugu�s, Matem�tica, Inform�tica e Conhecimentos Gerais.
//Considerando que para cada candidato tem-se um registro contendo
//o  seu nome e as notas obtidas em cada uma das provas, construa um algoritmo que forne�a:
//a) O nome e as notas em cada prova do candidato;
//b) A m�dia do candidato;
//c) Uma informa��o dizendo se o candidato foi aprovado ou n�o. Considere que um  candidato �
//aprovado se sua m�dia nas tr�s provas for maior que 6.0
//e se n�o  apresentou nenhuma nota abaixo de 5.0.
//d) O vestibular foi feito por 27 alunos.

Var
   Portugues,Matematica,Informatica,CGeral,Media: real
   Nome: caractere

Inicio
   escreva("Nome do vestibulando: ")
   leia (Nome)
   escreva("Sua nota na prova de portugu�s foi: ")
   leia (Portugues)
   escreva("Sua nota na prova de matem�tica foi: ")
   leia (Matematica)
   escreva("Sua nota na prova de inform�tica foi: ")
   leia (Informatica)
   escreva("Sua nota na prova de conhecimentos gerais foi: ")
   leia (CGeral)
   Media:= (Portugues+Matematica+Informatica+CGeral)/4
   Se (Portugues>10) entao
      escreval("A nota de portugues ultrapassa o limite!")
   fimse
   Se (Matematica>10) entao
      escreval("A nota de Matematica ultrapassa o limite!")
   fimse
   Se (Informatica>10) entao
      escreval("A nota de Informatica ultrapassa o limite!")
   fimse
   Se (CGeral>10) entao
      escreval("A nota de Conhecimentos Gerais ultrapassa o limite!")
   fimse
   Se (Media>=6) e (Media<=10) e (Portugues>=5) e (Matematica>=5) e (Informatica>=5) e (CGeral>=5) entao
      escreva("O aluno foi aprovado com a m�dia de: ", Media)
   senao
      Se (Media>10) entao
         escreva("***ERRO*** Impossivel calcular a m�dia! ***ERRO***")
      senao
         se (Media<6) entao
            escreva("O aluno foi reprovado com m�dia de: ", Media)
         fimse
      fimse
   fimse
Fimalgoritmo
