algoritmo "Índice de mortalidade"

var
num_criancas,idade,mortes,M,crianca_2y: inteiro
perc_criancas_mortas,perc_masc_mortas,perc_idade: real
sexo: caractere

inicio

escreval("Preencha os dados do algoritmo para fazer um índice de mortalidade infantil.")
escreval("  ")
escreval("Lembre-se: Quando cadastrar a última criança morta, digite: 'VAZIO'")
escreval("  ")
escreval("  ")
escreva("Quantas crianças nasceu neste período de X anos:   ")
leia (num_criancas)
escreval("  ")
escreva("Iniciando o cadastro de cada criança")
 timer (700)
  escreva(".")
  escreva(".")
  escreva(".")
  limpatela
 timer (0)
repita
 escreval("  ")
 escreval("Digite o sexo da criança(M) ou (F): ")
 escreval("Para finalizar, digite VAZIO.")
 leia(sexo)
 escreval("  ")
 se (sexo="M") ou (sexo="m") ou (sexo="F") ou (sexo="f") entao
  mortes:=mortes+1
   escreval("  ")
  escreval("Insira a idade da criança, em meses, antes de falecer: ")
  leia(idade)
 senao
  escreval("  ")
  escreval("Código inválido!")
 fimse
  se (idade>0) e (idade<=24) entao
   crianca_2y:=crianca_2y+1
  fimse
   se (idade<0) entao
    escreval("Cadastro anulado!")
   senao
    se(sexo="m") ou (sexo="M")entao
     M:=M+1
    fimse
   fimse
    se (mortes=num_criancas) entao
     sexo:="VAZIO"
    fimse
timer (1000)
limpatela
timer (0)
ate (sexo="VAZIO") ou (sexo="vazio") ou (sexo="Vazio")
timer (500)
 escreval("  ")
 escreva("Incluindo a tabela")
 escreva(".")
 escreva(".")
 escreva(".")
 limpatela
 escreva("")
 escreva("")
 escreva("")
 escreva("")
 escreva("")
 escreva("")
 escreva("")
 escreva("")
 limpatela
timer (0)
perc_criancas_mortas:= (mortes*100)/num_criancas
perc_masc_mortas:= (M*100)/num_criancas
perc_idade:= (crianca_2y*100)/num_criancas

escreval(".-------------------------------------------------------------------------------.")
escreval("|                       Indice de mortalidade infantil                          |")
escreval("|-------------------------------------------------------------------------------|")
escreval("|  % de mortes   |   % de crianças masculina   | % de crianças com ate 24 meses |")
escreval("    ",perc_criancas_mortas,"      ",perc_masc_mortas,"      ",perc_idade,"    ")
escreval(".-------------------------------------------------------------------------------.")
escreval("   ")
escreval("   ")
fimalgoritmo

