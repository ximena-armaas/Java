package Proyecto;

public class Proyecto {
    //Definir atributos

    private String nombre;
    private String cliente;
    private int duracionSemanas;
    private boolean estActivo;

    //Atributo estatico

    public static int totalProyectos = 0;

    public static final String NOMBRE_SISTEMA = "Gestor de Proyectos v1.0";

    //Constructor

    public Proyecto(String nombre, String cliente, int duracionSemanas, boolean estActivo) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.duracionSemanas = duracionSemanas;
        this.estActivo = estActivo;
        totalProyectos++;  // Se incrementa cada vez que se crea un nuevo proyecto
    }

    // Metodo para mostrar información del proyecto
    public void mostrarInformacion() {
        System.out.println("📁 Proyecto: " + nombre);
        System.out.println("👨‍💼 Cliente: " + cliente);
        System.out.println("⏳ Duración: " + duracionSemanas + " semanas");
        System.out.println("✅ ¿Activo?: " + (estActivo ? "Sí" : "No"));
    }

    // Metodo para marcar el proyecto como inactivo
    public void cerrarProyecto() {
        estActivo = false;
        System.out.println("🚫 El proyecto '" + nombre + "' ha sido cerrado.");
    }
}
