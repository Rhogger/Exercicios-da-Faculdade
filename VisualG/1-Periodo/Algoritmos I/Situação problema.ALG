algoritmo "Situação Problema"

var
A,B,anos: inteiro
X1,Y1,X2,Y2: real

inicio
A:= 90000000
B:=140000000
escreval("A cidade A possui ",A," de habitantes com taxa anual de crescimento de 3.5%.")
escreval("  ")
escreval("  ")
escreval("A cidade B possui ",B," de habitantes com taxa anual de crescimento de 1%.")
escreval("  ")
escreval("  ")
X1:= A*0.035
Y1:= B*0.01
anos:= 0
enquanto (Y2>=X2) faca
anos:=anos+1
X2:= A+(X1*anos)
Y2:= B+(Y1*anos)
fimenquanto
escreval("A cidade A levará ",anos," anos para ultrapassar o N° de habitantes da cidade B.")

fimalgoritmo