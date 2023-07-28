package threads3;

public class GuestTwo implements Runnable {

    private final Bathroom bathroom;

    public GuestTwo(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        bathroom.makeNumberTwo();
    }
}
