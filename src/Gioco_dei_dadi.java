import java.util.Random;

public class Gioco_dei_dadi implements Runnable{
    public int punteggio1;
    public int punteggio2;

    public Gioco_dei_dadi () {
        Thread ct = Thread.currentThread();
        ct.setName("Thread Principale (padre)");

        Thread t1 = new Thread(this, "Thread Figlio 1");
        Thread t2 = new Thread(this, "Thread Figlio 2");

        t1.start();
        t2.start();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            System.out.println("Errore.");
        }

        if (punteggio1 == punteggio2) {
            System.out.println("PAREGGIO!");
        } else if (punteggio1 > punteggio2) {
            System.out.println("THREAD 1 VINCE!");
        } else {
            System.out.println("THREAD 2 VINCE!");
        }
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            Random random = new Random();
            int lancio1 = random.nextInt(7);
            int lancio2 = random.nextInt(7);

            int totale = lancio1 + lancio2;
        }
    }

    public static void main(String[] args) {
        Gioco_dei_dadi gioco = new Gioco_dei_dadi();
    }
}