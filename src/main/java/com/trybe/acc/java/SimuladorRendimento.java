package com.trybe.acc.java;

import java.time.LocalDateTime;

public class SimuladorRendimento {

  /** Método que simula o rendimento anual */
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
