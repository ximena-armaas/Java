import Entrada.Entrada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Instancia Scanner
        Scanner sc = new Scanner(System.in);

        //Se piden los datos del evento 1
        System.out.println("Ingresa el nombre del evento 1: ");
        String nombreEvento1=sc.nextLine();
        System.out.println("Ingresa el precio del evento 1: ");
        double precioEntrada1=sc.nextDouble();
        sc.nextLine();

        //Se piden los datos del evento 2
        System.out.println("Ingresa el nombre del evento 2: ");
        String nombreEvento2=sc.nextLine();
        System.out.println("Ingresa el precio del evento 2: ");
        double precioEntrada2=sc.nextDouble();
        sc.nextLine();

        //Se cierra el scanner
        sc.close();
        //Instanciar el objeto
        Entrada entrada1 = new Entrada(nombreEvento1,precioEntrada1);
        Entrada entrada2 = new Entrada(nombreEvento2, precioEntrada2);

        //Lamar al metodo de los objetos
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

    }
}