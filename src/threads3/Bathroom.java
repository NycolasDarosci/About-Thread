package threads3;

public class Bathroom {
    void makeNumberOne() {
        String name = Thread.currentThread().getName();

        // operação atômica (Acid)
        // synchronized (this)
        // o bloco synchronized será executado de uma vez só, de maneira atômica
        synchronized (this) {
            System.out.println(name + " entrando no banheiro");
            System.out.println(name + " fazendo coisa rapida");

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(name + " dando descarga");
            System.out.println(name + " lavando a mao");
            System.out.println(name + " saindo do banheiro");
        }

    }
    void makeNumberTwo() {
        String name = Thread.currentThread().getName();

        // operação atômica (Acid)
        // synchronized (this)
        // o bloco synchronized será executado de uma vez só, de maneira atômica
        synchronized (this) {
            System.out.println(name + " entrando no banheiro");
            System.out.println(name + " fazendo coisa rapida");

            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(name + " dando descarga");
            System.out.println(name + " lavando a mao");
            System.out.println(name + " saindo do banheiro");
        }

    }

}
