package Paciente;

public class Paciente {

    //Atributos del objeto
    public String nombrePaciente ;
    public int edadPaciente;
    public String numExpediente;

    //Métodos del objeto

    public void mostrarInformacion(){
        System.out.println("Paciente: "+nombrePaciente);
        System.out.println("Edad: "+edadPaciente);
        System.out.println("Número de expediente: "+numExpediente);
    }
}
