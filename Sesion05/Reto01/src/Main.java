import UnidadEmergencia.Ambulancia;
import UnidadEmergencia.Patrulla;
import UnidadEmergencia.UnidadBomberos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Ambulancia 1");
        Patrulla patrulla = new Patrulla("Patrulla 1");
        UnidadBomberos unidadBomberos = new UnidadBomberos("Unidad Bomberos");

        ambulancia.iniciarOperacion();
        patrulla.iniciarOperacion();
        unidadBomberos.iniciarOperacion();
    }

}
