typedef struct estoque
{
  char nomePeca[30];
  int numPeca, qtd, pedido;
  float preco;
} estoque;

typedef struct endereco
{
  char rua[25], cidade[20], estado[2], cep[8];
} endereco;

typedef struct aluno
{
  char nome[15], sobrenome[15];
  struct endereco endResid;
} aluno;