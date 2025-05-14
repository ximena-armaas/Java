import Paciente.Paciente;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Instanciar el objeto Scanner para leer los datos del usuario
        Scanner sc = new Scanner(System.in);

        //Instanciar el objeto Paciente
        Paciente paciente1 = new Paciente();

        //Leer y asignar valores del usuario

        System.out.println("Ingresa el nombre del paciente: ");
        paciente1.nombrePaciente=sc.nextLine();

        System.out.println("Ingresa la edad del paciente: ");
        paciente1.edadPaciente=sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresa el número de expediente del paciente: ");
        paciente1.numExpediente=sc.nextLine();

        sc.close();

        //Lamar al metodo del objeto paciente
        paciente1.mostrarInformacion();


    }
}