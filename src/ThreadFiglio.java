import java.util.Random;

public class ThreadFiglio extends Thread{

    private int punteggio;

    public ThreadFiglio() {
        punteggio = 0;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            Random random = new Random();
            int lancio1 = random.nextInt(6)+1;
            int lancio2 = random.nextInt(6)+1;

            punteggio += (lancio1 + lancio2);
        }
    }

    public int getPunteggio() {
        return punteggio;
    }
}
