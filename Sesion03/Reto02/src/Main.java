import Factura.Factura;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Factura factura1 = new Factura(2562.0,"Compra 1",null);
        Factura factura2 = new Factura(25.3,"Compra 2","12345678");

        System.out.println(factura1.getResumen());
        System.out.println(factura2.getResumen());

    }
}