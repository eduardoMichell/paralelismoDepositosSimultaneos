package br.univali.paralelismo;

public class ParalelismoTestCase {
    public static void main(String[] args) {
        Paralelismo test1 =  new Paralelismo();
        Paralelismo test2 =  new Paralelismo();
        Paralelismo test3 =  new Paralelismo();
        Paralelismo test4 =  new Paralelismo();
        test1.start();
        test2.start();
        test3.start();
        test4.start();

        try {
            Thread.sleep(2000);
            System.out.println("Transacoes: " + Paralelismo.transacoes + ", Saldo: " + Paralelismo.saldo);
            System.out.println("O valor sempre vai estar correto, pois a função depositar esta com synchronized");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
