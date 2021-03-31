package br.univali.paralelismo;

import java.util.ArrayList;

public class Paralelismo extends Thread {

    public static int transacoes = 0;
    public static int saldo = 0;
    public static final int TOTAL = 5000;

    /**
     * Função que inicia a Thread
     */
    @Override
    public void run() {
        depositar();
    }

    /**
     * Função que calcula o saldo para o deposito
     */
    public synchronized static void depositar() {
        while (transacoes < Paralelismo.TOTAL) {
            saldo += 10;
            transacoes++;
        }

    }
}
