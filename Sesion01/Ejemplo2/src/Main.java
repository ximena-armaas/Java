import Estudiante.Estudiante;

public class Main {
    public static void main(String[] args) {

        //Instanciar el objeto
        Estudiante estudiante1 = new Estudiante();

        //Asignar valores al objeto
        estudiante1.nombre = "Ximena";
        estudiante1.edad = 22;

        //Llamar al método del objeto
        estudiante1.saludar();
    }
}