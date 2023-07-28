package threads2;

import java.util.concurrent.FutureTask;

public class BuscaNomes {

    public static void main(String[] args) {

        String name = "Da";

        Thread thread1 = new Thread(new SearchNameTask("assinaturas1.txt", name), "Thread 1");
        Thread thread2 = new Thread(new SearchNameTaskTwo("assinaturas2.txt", name), "Thread 2");
        Thread thread3 = new Thread(new SearchNameTaskThree("autores.txt", name), "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();

        // operação atômica (Acid)
        // synchronized (this)
        // o bloco synchronized será executado de uma vez só, de maneira atômica
    }

}
