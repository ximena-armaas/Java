import Tema.Tema;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Tema> temasActivos = new CopyOnWriteArrayList<>();
        temasActivos.add(new Tema("Biologia", 3));
        temasActivos.add(new Tema("Matemáticas", 2));
        temasActivos.add(new Tema("Ciencias", 1));

        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura compresiva", "Sitio web");
        recursos.put("Matemáticas básicas", "Libro");

        Collections.sort(temasActivos);
        System.out.println("Temas ordenados por orden natural");
        for (Tema ta : temasActivos){
            System.out.println(ta);
        }

        //Orden por prioridad con comparator
        temasActivos.sort(new Comparator<Tema>(){
            @Override
            public int compare(Tema a, Tema b){
                return Integer.compare(a.prioridad, b.prioridad);
            }
        });

        System.out.println("Temas ordenados por prioridad (1 = alta)");
        for (Tema ta : temasActivos){
            System.out.println(ta);
        }

        System.out.println("Recursos registrados:");
        for (String recurso : recursos.keySet()){
            System.out.println(recurso + ", "+recursos.get(recurso));
        }
    }

}