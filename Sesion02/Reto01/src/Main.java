import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Instanciar el objeto Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el nombre del medicamento: ");
        String nombreMedicamento = sc.nextLine();

        System.out.println("Ingresa el precio unitario: ");
        double precioUnitario = sc.nextDouble();
        sc.nextLine();

        System.out.println("Ingresa la cantidad de piezas: ");
        int cantidadPiezas = sc.nextInt();
        sc.nextLine();
        sc.close();
        var totalSinDesc = (precioUnitario*cantidadPiezas);

        boolean aplicaDescuento = totalSinDesc >= 500 ? true:false;
        double descuento = (totalSinDesc/100)*15;
        var totalFinal = aplicaDescuento ? (totalSinDesc-descuento) : totalSinDesc;

        System.out.println("Total sin descuento: "+totalSinDesc);
        System.out.println("Aplica descuento: "+ (aplicaDescuento ? "Si": "No"));
        System.out.println("Descuento: "+descuento);
        System.out.println("Total final: "+totalFinal);
    }
}