import Narrativa.*;

import java.io.InputStream;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainNarrativa {
    public static void main(String[] args) {
        System.out.println("Inicio del juego");
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();
        dialogo.imprimirDialogo("Hola");
        String accion = decision.tomarDecision();
        transicion.realizarTrancision(accion);
    }
}