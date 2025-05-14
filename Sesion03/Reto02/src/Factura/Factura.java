package Factura;

import java.util.Optional;

public class Factura {

    //Atributos de la clase
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    public Factura(double monto, String descripcion, String rfc){
        this.monto=monto;
        this.descripcion=descripcion;
        this.rfc=Optional.ofNullable(rfc);
    }


    public String getResumen(){
        String resumen = "\n📄 Factura generada:\n";
        resumen += "Descripción: " + descripcion + "\n";
        resumen += "Monto: $" + monto + "\n";
        resumen += "RFC: " + rfc.orElse("[No proporcionado]");
        return resumen;
    }
}
