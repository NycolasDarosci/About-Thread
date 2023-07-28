import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Thread thread = new Thread(new ThreadImprimir());
        thread.start();

    }


}
