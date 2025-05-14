package UnidadEmergencia;

public class Operador {
    public String nombre;

    public Operador(String nombre){
        this.nombre = nombre;
    }


    public void reportarse(){
        System.out.println("Operador: "+nombre+" reportandose");
    }
}
