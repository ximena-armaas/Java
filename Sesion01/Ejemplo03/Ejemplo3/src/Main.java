import Producto.Producto;

public class Main {
    public static void main(String[] args) {

        //Instanciamos al objeto pero con constructor
        Producto producto1 = new Producto("Laptop",125.3);

        //Lamamos al metodo del objeto
        producto1.mostrarInformacion();
    }
}