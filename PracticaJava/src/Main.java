public class Main {

    public static void main (String[] args) throws InterruptedException {
        //Create temporizador
        Temporizador temporizador = new Temporizador();

        PuertaTemporizada sistemaRiego = temporizador.registrar();
        PuertaTemporizada persianas = temporizador.registrar();

        //Start and stop irrigation system
        sistemaRiego.timeout();
        //Close the shutters
        persianas.bloquear();
    }
}
