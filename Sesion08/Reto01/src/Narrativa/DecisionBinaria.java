package Narrativa;

import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision{

    public String tomarDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola, por favor, ingresa la decision");
        System.out.println("A: Quedarse esperando");
        System.out.println("B: Llorar");
        String decisionIngresada = scanner.nextLine();
        return decisionIngresada.toUpperCase();
    }
}
