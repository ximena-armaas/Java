package UnidadEmergencia;

public class Patrulla extends UnidadEmergencia {
    SistemaGPS sistemaGPS;
    Sirena sirena;
    Operador operador;

    public Patrulla(String nombre){
        super(nombre);
        this.sistemaGPS = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador("Belem");

    }

    @Override
    public void responder(){
        System.out.println("Patrulla atendiendo situación de seguridad ciudadana");
    }

    public void iniciarOperacion(){
        activarUnidad();
        sistemaGPS.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }
}
