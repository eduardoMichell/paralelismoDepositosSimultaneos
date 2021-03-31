package br.univali.paralelismo;

public class ParalelismoTestCase {
    public static void main(String[] args) {
        Paralelismo test =  new Paralelismo();
        Paralelismo test2 =  new Paralelismo();
        test.start();
        test2.start();

        try {
            Thread.sleep(2000);
            System.out.println("Transacoes: " + Paralelismo.transacoes + ", Saldo: " + Paralelismo.saldo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
