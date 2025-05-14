import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Definimos el arraylist
        ArrayList<String> muestras = new ArrayList<>();
        muestras.add("Homo sapiens");
        muestras.add("Mus musculus");
        muestras.add("Arabidopsis thaliana");
        muestras.add("Homo sapiens");

        HashSet<String> especiesUnicas = new HashSet<>(muestras);

        HashMap<String, String> muestraInvestigador = new HashMap<>();

        muestraInvestigador.put("M-001","Dra.Lopéz");
        muestraInvestigador.put("M-002", "Dr.Hernández");

        System.out.println("Lista de muestras: ");
        for (int i = 0; i < muestras.size(); i++) {
            System.out.println(i + 1 + ". " + muestras.get(i));
        }
        System.out.println("Especies únicas procesadas: ");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        System.out.println("Id de la especie y dr asociado");
        for (Map.Entry<String, String> entry : muestraInvestigador.entrySet()){
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
        System.out.println("Busqueda con el id 'M-001' resultado: "+muestraInvestigador.get("M-001"));
    }
}