package Narrativa;

public class TransicionSimple implements TransicionHistoria {

    @Override
    public void realizarTrancision(String accion) {
        if (accion.equalsIgnoreCase("A")){
            System.out.println("El jugador se quedará esperando");
        }else{
            System.out.println("El jugador llorará :(");
        }
    }
}
