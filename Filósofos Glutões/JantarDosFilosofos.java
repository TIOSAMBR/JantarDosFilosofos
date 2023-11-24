import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class JantarDosFilosofos {
    public static void main(String[] args) {
        int numFilosofos = 5;
        Lock[] garfos = new ReentrantLock[numFilosofos];
        Thread[] filosofos = new Thread[numFilosofos];

        // Inicializar os garfos
        for (int i = 0; i < numFilosofos; i++) {
            garfos[i] = new ReentrantLock();
        }

        // Inicializar e iniciar as threads dos filósofos
        for (int i = 0; i < numFilosofos; i++) {
            filosofos[i] = new Thread(new Filosofo(i, garfos[i], garfos[(i + 1) % numFilosofos]));
            filosofos[i].start();
        }
    }
}