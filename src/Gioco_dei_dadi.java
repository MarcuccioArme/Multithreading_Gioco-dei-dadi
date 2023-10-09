public class Gioco_dei_dadi {

    public Gioco_dei_dadi () {
        Thread ct = Thread.currentThread();
        ct.setName("Thread Principale (padre)");

        ThreadFiglio t1 = new ThreadFiglio();
        ThreadFiglio t2 = new ThreadFiglio();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Errore.");
        }

        if (t1.getPunteggio() == t2.getPunteggio()) {
            System.out.println("PAREGGIO!");
        } else if (t1.getPunteggio() > t2.getPunteggio()) {
            System.out.println("THREAD 1 VINCE!");
        } else if (t2.getPunteggio() > t1.getPunteggio()) {
            System.out.println("THREAD 2 VINCE!");
        }

        System.out.println("\nRisultati:");
        System.out.println("Thread 1: " + t1.getPunteggio());
        System.out.println("Thread 2: " + t2.getPunteggio());
    }

    public static void main(String[] args) {
        Gioco_dei_dadi gioco = new Gioco_dei_dadi();
    }
}