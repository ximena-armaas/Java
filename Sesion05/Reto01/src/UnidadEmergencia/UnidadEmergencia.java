
package UnidadEmergencia;

public abstract class UnidadEmergencia {
    public String nombre;
    public UnidadEmergencia(String nombre){this.nombre=nombre;
    }
    public abstract void responder();

    public void activarUnidad(){
        System.out.println("Activando unidad: "+nombre);}
}