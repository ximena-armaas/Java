import Vuelo.Pasajero;
import Vuelo.Vuelo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pasajero pasajero1 = new Pasajero("Ximena","1234560");
        Vuelo vuelo1 = new Vuelo("UX123","París","13:30");

        vuelo1.reservarAsiento(pasajero1);
        System.out.println(vuelo1.obtenerItinerario());
        vuelo1.cancelarReserva();
        System.out.println(vuelo1.obtenerItinerario());
        vuelo1.reservarAsiento("Ximena Armas","12345");
        System.out.println(vuelo1.obtenerItinerario());
    }
}