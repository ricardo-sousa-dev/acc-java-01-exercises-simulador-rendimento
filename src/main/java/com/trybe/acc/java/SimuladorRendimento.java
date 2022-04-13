package com.trybe.acc.java;

import java.time.LocalDateTime;

// Agora é a hora de você colocar em prática o que aprendeu sobre a classe LocalDateTime! Aqui nesse
// desafio você deverá montar um simulador de rendimentos. A pessoa usuária deve entrar com um
// montante de dinheiro inicial e com o valor que objetiva ter no futuro, e, por fim, seu simulador
// deve dizer em que ano o objetivo terá sido atingido ou ultrapassado.

// Você terá que escrever uma classe nomeada SimuladorRendimento, e nela deve haver um método
// chamado simularRendimentoAnos. Esse método simularRendimentoAnos deve receber dois argumentos
// double: um representando o valor do montante inicial, outro representando o valor do objetivo. O
// retorno deve ser um número inteiro que representa o ano futuro em que o objetivo será alcançado
// ou ultrapassado. Os passos desse método são:

// 1- o método simularRendimentoAnos recebe dois argumentos double, que representam o valor inicial
// e o valor do objetivo, respectivamente; 2- considerando que o rendimento anual é de 10%, o método
// deve calcular quantos anos serão necessários para o valor inicial alcançar o valor do objetivo;
// 3- o método deve usar a classe LocalDateTime para pegar o ano atual (ex: 2022), somar a
// quantidade de anos que foram calculados no passo anterior e retornar em que ano do nosso
// calendário o valor do objetivo será alcançado. (Dicas: utilize os métodos .plusYears() e
// .getYear() para fazer essa manipulação.) 4- retornar um inteiro que representa o ano em que o
// objetivo será alcançado ou ultrapassado (ex: 2047).

public class SimuladorRendimento {

  public static void main(String[] args) {
    SimuladorRendimento obj = new SimuladorRendimento();
    double inicial = 500;
    double objetivo = 5000;
    System.out.println(
        "Com "
            + inicial
            + " seu rendimento será "
            + objetivo
            + " no ano "
            + obj.simularRendimentoAnos(inicial, objetivo));
  }

  public int simularRendimentoAnos(double valorInicial, double valorObjetivo) {
    int anoAtual = LocalDateTime.now().getYear();
    double saldo = valorInicial;
    int tempo_investimento = 0;

    while (saldo < valorObjetivo) {
      saldo += saldo * 0.1;
      tempo_investimento++;
    }

    // return anoAtual + tempo_investimento;
    return anoAtual + tempo_investimento;
  }
}
