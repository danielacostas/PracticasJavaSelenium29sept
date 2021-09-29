public class PuertaTemporizada extends Puerta {

    //Method to open and close after 3 seconds

    public void timeout() throws InterruptedException {
        desbloquear();
        Thread.sleep(3000);
        bloquear();
    }

}
