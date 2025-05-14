import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Intanciar objeto Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el precio del cafe: ");
        double precioCafe = sc.nextDouble();
        sc.nextLine();

        System.out.println("Ingresa el precio del pastel: ");
        double precioPastel = sc.nextDouble();
        sc.nextLine();

        System.out.println("Ingresa el precio del agua: ");
        double precioAgua = sc.nextDouble();
        sc.nextLine();

        System.out.println("Ingresa la cantidad de cafe: ");
        int cantidadCafe = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingresa la cantidad de pastel: ");
        int cantidadPastel = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingresa la cantidad de agua: ");
        int cantidadAgua = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingresa el porcentaje de descuento: ");
        double porcentajeDesc = sc.nextDouble();
        sc.nextLine();

        sc.close();

        double totalSinDesc = ((precioCafe*cantidadCafe)+(precioAgua*cantidadAgua)+(precioPastel*cantidadPastel));

        boolean aplicaDesc = totalSinDesc > 150;

        double descuento = (totalSinDesc/100)*porcentajeDesc;

        double totalFinal = aplicaDesc ? (totalSinDesc - descuento) : totalSinDesc;




        System.out.println("Total de la compra: "+totalSinDesc);
        System.out.println("¿Aplica descuento?: "+(aplicaDesc ? "Si" : "No"));
        System.out.println("Descuento: "+descuento );
        System.out.println("Total: "+totalFinal);
    }
}