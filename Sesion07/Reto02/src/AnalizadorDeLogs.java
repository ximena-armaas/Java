import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AnalizadorDeLogs {
    public static void main(String[] args) {
        //Ruta del archivo de logs
        Path rutaLogArchivo = Paths.get("src/errores.log");

        //Ruta del archivo donde se registrarán los fallos
        Path rutaErrorArchivo = Paths.get("src/registro_fallos.txt");


        //Contadores de lineas
        int totalLineas = 0;
        int totalErrores = 0;
        int totalWarning = 0;

        //Bloque try-with-resources
        try (BufferedReader lector = Files.newBufferedReader(rutaLogArchivo)) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                //Contador de lineas
                totalLineas++;
                //si la linea contiene la palabra "ERROR"
                if (linea.contains("ERROR")) {
                    totalErrores++;
                }
                //Si la linea contiene la palabra WARNING
                if (linea.contains("WARNING")) {
                    totalWarning++;
                }
            }

            // Imprimir la información
            System.out.println("Análisis completado:");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Total de errores (ERROR): " + totalErrores);
            System.out.println("Total de advertencias (WARNING): " + totalWarning);

            //Sacar promedio
            //Si las lineas leidas es mayor a 0 entonces se divide los errores entre el numero de lineas y se multiplica por 100
            //de lo contrario solo se pone 0
            double porcentajeErrores = (totalLineas > 0) ? ((double) totalErrores / totalLineas) * 100 : 0;
            double porcentajeWarnings = (totalLineas > 0) ? ((double) totalWarning / totalLineas) * 100 : 0;

            //Mostrar promedios
            System.out.printf("Porcentaje de líneas con errores: %.2f%%\n", porcentajeErrores);
            System.out.printf("Porcentaje de líneas con advertencias: %.2f%%\n", porcentajeWarnings);

        } catch (IOException e) {
            System.out.println("Error al procesar el archivo de logs: " + e.getMessage());

            // Se registra el fallo en el archivo de registros de fallos con un bloque try-catch
            try (BufferedWriter escritor = Files.newBufferedWriter(rutaErrorArchivo)) {
                escritor.write("Se produjo un error al leer el archivo 'errores.log': " + e.getMessage());
            } catch (IOException ex) {
                System.out.println("No se pudo escribir el archivo de fallos :(");
            }
        }

    }
}