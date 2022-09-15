#include <stdio.h>

int main()
{

  int raio, volume;

  printf("Digite o raio de uma esfera para obter o seu volume: ");
  scanf("%d", &raio);

  raio = Potenciacao(raio);

  volume = CalculaVolume(raio);

  printf("Resultado: %d", volume);
}

int Potenciacao(int raio)
{
  int CuboRaio;

  CuboRaio = raio * raio * raio;

  return (CuboRaio);
}

int CalculaVolume(int raio)
{
  int volume;

  volume = (raio * 4 * 3.14) / 3;

  return (volume);
}
