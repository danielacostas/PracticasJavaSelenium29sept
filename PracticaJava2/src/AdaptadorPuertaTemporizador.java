public class AdaptadorPuertaTemporizador implements ClienteTemporizador{
    @Override
    public void timeout() throws InterruptedException {
        PuertaTemporizada p = new PuertaTemporizada();
        p.timeout();
    }
}
