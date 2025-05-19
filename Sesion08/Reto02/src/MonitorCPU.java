import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonitorCPU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> registrosCPU = new HashSet<>();

        try {
            System.out.println("Ingresa los consumos del CPU en enteros. Si deseas salir ingresa -1");

            while (true) {
                System.out.print("CPU (%): ");
                int valor = scanner.nextInt();

                if (valor == -1) {
                    break;
                }

                if (valor < 0 || valor > 100) {
                    System.out.println("El valor ingresado no es correcto. El valor debe de estar dentro del rango de 1 y 100");
                    continue;
                }

                if (!registrosCPU.add(valor)) {
                    System.out.println("Valor duplicado: " + valor + "%");
                    continue;
                }

                if (valor > 95) {
                    throw new ConsumoCritico("Cuidado! el valor esta fuera de un rango normal (" + valor + "%)");
                }

                System.out.println("Registro guardado: " + valor + "%");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error, el número debe de ser un entero");
        } catch (ConsumoCritico e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Proceso finalizado.");
        }
    }
}