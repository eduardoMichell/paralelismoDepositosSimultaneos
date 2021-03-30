package br.univali.paralelismo;

import java.util.ArrayList;

public class Paralelismo extends Thread {

    public int transacoes = 0;
    public int saldo = 0;
    private final int TOTAL = 5000;

    public Paralelismo(int transacoes, int saldo) {
       this.transacoes = transacoes;
       this.saldo = saldo;
    }

    private void calculo(){
       new Thread() {
            @Override
            public void run() {
                while (transacoes < TOTAL) {
                    saldo += 10;
                    transacoes++;
                }
            }
        }.start();
    }

    private void print() {
        try {
            Thread.sleep(500);
            System.out.println("Transacoes: " + transacoes + ", Saldo: " + saldo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void depositar(int qtdDepositos){
        for(int i = 0 ; i < qtdDepositos; i++){
            calculo();
        }
        print();
    }
}
