package UnidadEmergencia;

public class UnidadBomberos extends UnidadEmergencia {
    SistemaGPS sistemaGPS;
    Sirena sirena;
    Operador operador;
    public UnidadBomberos(String nombre){
        super(nombre);
        this.sistemaGPS=new SistemaGPS();
        this.sirena=new Sirena();
        this.operador=new Operador("Ulises");
    }

    @Override
    public void responder(){
        System.out.println("Unidad de bomberos respondiendo a incendio");
    }

    public void iniciarOperacion(){
        activarUnidad();
        sistemaGPS.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }

}
