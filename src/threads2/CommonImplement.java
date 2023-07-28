package threads2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CommonImplement implements Runnable {
    private final String file;
    private final String name;

    public CommonImplement(String file, String name) {
        this.file = file;
        this.name = name;
    }

    @Override
    public void run() {

        try {
            Thread thread = Thread.currentThread();
            Scanner sc = new Scanner(new FileReader("resources/texts/" + file));

            int numberLines = 1;

            while (sc.hasNext()) {
                String line = sc.nextLine();

                if (line.contains(name)) {
                    System.out.println("Thread: " + thread.getName() + " Line: " + numberLines + " - " + line);
                }
                numberLines++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
