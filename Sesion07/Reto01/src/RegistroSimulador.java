import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RegistroSimulador {
    public static void main(String[] args) {

        //Ruta de la carpeta en donde se encontrará el archivo
        Path rutaCarpeta = Paths.get("src/config");

        //Ruta del archivo y el nombre
        Path rutaArchivo = rutaCarpeta.resolve("parametros.txt");

        // Información que irá dentro del archivo
        String parametros = "Tiempo de ciclo: 55.8 segundos\n"
                + "Velocidad de línea: 1.2 m/s\n"
                + "Número de estaciones: 8\n";

        //Bloque try-catch para manejar los errores
        try {
            //Se comprueba si existe la carpeta
            if (!Files.exists(rutaCarpeta)) {
                //Si no existe la carpeta entonces la crea
                Files.createDirectory(rutaCarpeta);
                System.out.println("La carpeta no existía y se ha creado");
            }

            //Se escribe el contenido dentro del archivo
            Files.write(rutaArchivo, parametros.getBytes());
            System.out.println("Se ha creado y escrito el archivo correctamente");

            //Se valida si existe el archivo
            if (Files.exists(rutaArchivo)) {
                //Se lee el archivo y se muestra en consola
                String contenidoLeido = Files.readString(rutaArchivo);
                System.out.println("Contenido del archivo: ");
                System.out.println(contenidoLeido);
            } else {
                System.out.println("No se creo el archivo");
            }

        } catch (IOException e) {
            //Manda el mensaje si ocurrió algun error
            System.out.println("Error");
        }

    }
}