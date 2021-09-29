public class Main {

    public static void main (String[] args) throws InterruptedException {
        //Create temporizador
        Temporizador temporizador = new Temporizador();

        AdaptadorPuertaTemporizador sistemaRiego = temporizador.registrar();
        AdaptadorPuertaTemporizador persianas = temporizador.registrar();

        //Start and stop irrigation system
        sistemaRiego.timeout();
        //Close the shutters
        persianas.timeout();

    }
}
