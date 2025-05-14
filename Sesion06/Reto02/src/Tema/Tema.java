package Tema;
import java.util.*;
public class Tema implements Comparable<Tema> {

    //Declaración de atributos
    public String titulo;
    public int prioridad;


    //Constructor
    public Tema(String titulo, int prioridad){
        this.titulo=titulo;
        this.prioridad=prioridad;
    }

    @Override
    public int compareTo(Tema otro) {
        return this.titulo.compareTo(otro.titulo);
    }

    @Override
    public String toString() {
        return "Tema: " + titulo + " | Prioridad: " + prioridad;
    }
}
