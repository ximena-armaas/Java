package Producto;

public class Producto {
    //Atributos del objeto
    String nombre;
    double precio;

    //Constructos del objeto
    public Producto(String nombre, double precio){
        this.nombre=nombre;
        this.precio=precio;
    }

    //Metodo del objeto
    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre+" - Precio: $"+precio);
    }
}
