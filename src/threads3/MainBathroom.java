package threads3;

public class MainBathroom {

    public static void main(String[] args) {
        Bathroom bath = new Bathroom();

        /*
            the problem here is that when guest one enter the bathroom
            guest two also enter the bathroom
            this is wrong
            just ONE guest must enter the bathroom

            just ONE thread must run,
            so it need to synchronize the bathroom access
            when you need enter the bathroom, you lock the door

            synchronized lock the bathroom
        */
        Thread guestOne = new Thread(new GuestOne(bath), "guestOne");
        Thread guestTwo = new Thread(new GuestTwo(bath), "guestTwo");

        guestOne.start();
        guestTwo.start();
    }

}
