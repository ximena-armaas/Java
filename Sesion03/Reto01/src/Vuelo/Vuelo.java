package Vuelo;

public class Vuelo {

    //Definir atributos

    private final String codigoVuelo;
    public String destino;
    public String horaSalida;
    public Pasajero asientoReservado;

    //Constructrores
    public Vuelo (String codigoVuelo, String destino, String horaSalida){
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.codigoVuelo=codigoVuelo;
        this.asientoReservado=null;
    };


    //Métodos de la clase
    public boolean reservarAsiento(Pasajero p){
        if(asientoReservado == null){
            asientoReservado=p;
            System.out.println("Reserva realizada con éxtio");
            return true;
        }else{
            System.out.println("El asiento ya está reservado");
        return false;}
    }

    public boolean reservarAsiento(String nombre, String pasaporte){
        return reservarAsiento(new Pasajero(nombre, pasaporte));
    }

    public void cancelarReserva(){
        if (asientoReservado != null){
            System.out.println("Reserva cancelada");
            asientoReservado=null;
        }else {
            System.out.println("No hay una reserva para el asiento");
        }
    }

    public String obtenerItinerario() {
        String pasajeroInfo = (asientoReservado != null) ? asientoReservado.getNombre() : "[Sin reserva]";
        return "\n✈️ Itinerario del vuelo:\n"
                + "Código: " + codigoVuelo + "\n"
                + "Destino: " + destino + "\n"
                + "Salida: " + horaSalida + "\n"
                + "Pasajero: " + pasajeroInfo + "\n";
    }

}
