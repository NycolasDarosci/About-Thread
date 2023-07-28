package threads3;

public class GuestOne implements Runnable {

    private final Bathroom bathroom;

    public GuestOne(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        bathroom.makeNumberOne();
    }
}
