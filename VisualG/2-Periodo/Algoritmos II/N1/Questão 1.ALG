algoritmo "Lista com porcentagem e quantidade"

var
canal1,canal2,canal3,canal4,canal5,canal6,canal7,canal8,cod_canal,pessoas,cod: inteiro
//canal1 = Cultura//          //canal2 = SBT//       //canal3 = Globo//
//canal4 = Record//           //canal5 = MTV//       //canal6 = TVA//
//canal7 = Manchete//         //canal8 = Bandeirantes//
p1,p2,p3,p4,p5,p6,p7,p8,ptotal: real
pma1,pma2,pma3,pma4,pma5,pma6,pma7,pma8,pme1,pme2,pme3,pme4,pme5,pme6,pme7,pme8,char: caractere
inicio
cod:= 0
enquanto (cod<>2) faca
escreval("Na casa que foi entrevistada, estavam assistindo a qual canal? ")
escreval("    ")
escreval("    ")
escreval(".-------------------------------.")
escrevaL("|        Canais de TV           |")
escreval("|-------------------------------|")
escreval("|  Código  |  Nome do Canal     |")
escreval("|-------------------------------|")
escreval("|    1     |  Cultura           |")
escreval("|    2     |  SBT               |")
escreval("|    3     |  Globo             |")
escreval("|    4     |  Record            |")
escreval("|    5     |  MTV               |")
escreval("|    6     |  TVA               |")
escreval("|    7     |  Manchete          |")
escreval("|    8     |  Bandeirantes      |")
escreval(".-------------------------------.")
escreval("    ")
escreval("    ")
escreva("Insira o código do canal: ")
leia (cod_canal)
escreval("    ")
repita
 se (cod_canal<1) ou (cod_canal>8) entao
  escreval("!!! Código Inválido !!!")
  escreval("    ")
  escreva("Insira o código do canal novamente: ")
  leia(cod_canal)
  escreval("    ")
 senao
  se (cod_canal=0) entao
   escreval("Fora da pesquisa...")
  fimse
 fimse
ate (cod_canal>0) e (cod_canal<=8)
escreva("Quantas pessoas estavam assistindo TV?")
leia (pessoas)
escreval("    ")
repita
 se (pessoas<0) entao
  escreva("Valor inválido, insira um valor maior ou igual a 0! Insira novamente: ")
  leia (pessoas)
 fimse
 escreval("    ")
ate (pessoas>=0)
se (cod_canal=1) entao
 canal1:= canal1+pessoas
senao
 se (cod_canal=2) entao
  canal2:= canal2+pessoas
 senao
  se (cod_canal=3) entao
   canal3:= canal3+pessoas
  senao
   se (cod_canal=4) entao
    canal4:= canal4+pessoas
   senao
    se (cod_canal=5) entao
     canal5:= canal5+pessoas
    senao
     se (cod_canal=6) entao
      canal6:= canal6+pessoas
     senao
      se (cod_canal=7) entao
       canal7:= canal7+pessoas
      senao
       se (cod_canal=8) entao
        canal8:= canal8+pessoas
       fimse
      fimse
     fimse
    fimse
   fimse
  fimse
 fimse
fimse
escreval("    ")
escreval("Deseja continuar?  ")
escreval("    ")
escreval("    ")
escreval(".---------------------------------------.")
escrevaL("|      Opção       |       Função       |")
escreval("|---------------------------------------|")
escreval("|       Enter      | Continua a pesquisa|")
escreval("|        Fim       | Termina a pesquisa |")
escreval("|---------------------------------------|")
escreval("    ")
escreval("    ")
escreva("Insira 'Fim' para finalizar ou tecle Enter para continuar: ")
leia (char)
se (char="fim") ou (char="Fim") entao
 cod:=2
fimse
limpatela
fimenquanto
ptotal:= canal1+canal2+canal3+canal4+canal5+canal6+canal7+canal8
p1:= (canal1*100)/ptotal
p2:= (canal2*100)/ptotal
p3:= (canal3*100)/ptotal
p4:= (canal4*100)/ptotal
p5:= (canal5*100)/ptotal
p6:= (canal6*100)/ptotal
p7:= (canal7*100)/ptotal
p8:= (canal8*100)/ptotal
se (p1>=p2) e (p1>=p3) e (p1>=p4) e (p1>=p5) e (p1>=p6) e (p1>=p7) e (p1>=p8) entao
 pma1:= "Cultura"
fimse
 se (p2>=p1) e (p2>=p3) e (p2>=p4) e (p2>=p5) e (p2>=p6) e (p2>=p7) e (p2>=p8) entao
  pma2:= "SBT"
 fimse
  se (p3>=p1) e (p3>=p2) e (p3>=p4) e (p3>=p5) e (p3>=p6) e (p3>=p7) e (p3>=p8) entao
   pma3:= "Globo"
  fimse
   se (p4>=p1) e (p4>=p2) e (p4>=p3) e (p4>=p5) e (p4>=p6) e (p4>=p7) e (p4>=p8) entao
    pma4:= "Record"
   fimse
    se (p5>=p1) e (p5>=p2) e (p5>=p3) e (p5>=p4) e (p5>=p6) e (p5>=p7) e (p5>=p8) entao
     pma5:= "MTV"
    fimse
     se (p6>=p1) e (p6>=p2) e (p6>=p3) e (p6>=p4) e (p6>=p5) e (p6>=p7) e (p6>=p8) entao
      pma6:= "TVA"
     fimse
      se (p7>=p1) e (p7>=p2) e (p7>=p3) e (p7>=p4) e (p7>=p5) e (p7>=p6) e (p7>=p8) entao
       pma7:= "Manchete"
      fimse
       se (p8>=p1) e (p8>=p2) e (p8>=p3) e (p8>=p4) e (p8>=p5) e (p8>=p6) e (p8>=p7) entao
        pma8:= "Bandeirantes"
       fimse
       
se (p1<=p2) e (p1<=p3) e (p1<=p4) e (p1<=p5) e (p1<=p6) e (p1<=p7) e (p1<=p8) ou (p1=0) entao
 pme1:= "Cultura"
fimse
 se (p2<=p1) e (p2<=p3) e (p2<=p4) e (p2<=p5) e (p2<=p6) e (p2<=p7) e (p2<=p8) ou (p2=0) entao
  pme2:= "SBT"
 fimse
  se (p3<=p1) e (p3<=p2) e (p3<=p4) e (p3<=p5) e (p3<=p6) e (p3<=p7) e (p3<=p8) ou (p3=0) entao
   pme3:= "Globo"
  fimse
   se (p4<=p1) e (p4<=p2) e (p4<=p3) e (p4<=p5) e (p4<=p6) e (p4<=p7) e (p4<=p8) ou (p4=0) entao
    pme4:= "Record"
   fimse
    se (p5<=p1) e (p5<=p2) e (p5<=p3) e (p5<=p4) e (p5<=p6) e (p5<=p7) e (p5<=p8) ou (p5=0) entao
     pme5:= "MTV"
    fimse
     se (p6<=p1) e (p6<=p2) e (p6<=p3) e (p6<=p4) e (p6<=p5) e (p6<=p7) e (p6<=p8) ou (p6=0) entao
      pme6:= "TVA"
     fimse
      se (p7<=p1) e (p7<=p2) e (p7<=p3) e (p7<=p4) e (p7<=p5) e (p7<=p6) e (p7<=p8) ou (p7=0) entao
       pme7:= "Manchete"
      fimse
       se (p8<=p1) e (p8<=p2) e (p8<=p3) e (p8<=p4) e (p8<=p5) e (p8<=p6) e (p8<=p7) ou (p8=0) entao
        pme8:= "Bandeirantes"
       fimse
escreval("    ")
escreval("    ")
escreval(".-----------------------------------------------------------.")
escrevaL("|                 Audiência das emissoras                   |")
escreval("|-----------------------------------------------------------|")
escrevaL("|      Canal     |   Quantidade    |       Porcentagem      |")
escreval("|-----------------------------------------------------------|")
escreval("     Cultura            ",canal1,"              ",p1,"%   ")
escreval("       SBT              ",canal2,"              ",p2,"%   ")
escreval("      Globo             ",canal3,"              ",p3,"%   ")
escreval("     Record             ",canal4,"              ",p4,"%   ")
escreval("       MTV              ",canal5,"              ",p5,"%   ")
escreval("       TVA              ",canal6,"              ",p6,"%   ")
escreval("    Manchetes           ",canal7,"              ",p7,"%   ")
escreval("  Bandeirantes          ",canal8,"              ",p8,"%   ")
escreval(".-----------------------------------------------------------.")
escreval("    ")
escreval("    ")
escreval("A(s) Emissora(s) que mais teve/tiveram audiência foi/foram: ")
escreval("|-",pma1,"  ",pma2,"  ",pma3,"  ",pma4,"  ",pma5,"  ",pma6,"  ",pma7,"  ",pma8,"  ")
escreval("    ")
escreval("-------------------------------------------------------------")
escreval("    ")
escreval("A(s) Emissora(s) que menos teve/tiveram audiência foi/foram: ")
escreval("|-",pme1,"  ",pme2,"  ",pme3,"  ",pme4,"  ",pme5,"  ",pme6,"  ",pme7,"  ",pme8,"  ")
escreval("    ")
escreval("-------------------------------------------------------------")
escreval("    ")
fimalgoritmo