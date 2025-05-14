package UnidadEmergencia;

public class Ambulancia extends UnidadEmergencia {

    SistemaGPS sistemaGPS;
    Sirena sirena;
    Operador operador;

    public Ambulancia(String nombre){
        super(nombre);
        this.sistemaGPS=new SistemaGPS();
        this.sirena=new Sirena();
        this.operador= new Operador("Juan");
    }

    @Override
    public void responder(){
        System.out.println("Ambulancia en camino al hospital más cercano");
    }

    public void iniciarOperacion(){
        activarUnidad();
        sistemaGPS.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }
}
