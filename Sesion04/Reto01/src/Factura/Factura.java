package Factura;

import java.util.Objects;

public class Factura {
    //Atributos
    private String folio;
    private String cliente;
    private double total;

    public Factura (String folio, String cliente, double total){
        this.folio=folio;
        this.cliente=cliente;
        this.total=total;
    }

    @Override
    public String toString(){
        return "Factura [folio = " + folio + ", cliente = "+cliente +", total = $"+total+"]";
    }

    @Override
    public boolean equals(Object obj){
        //Si ambos objetos apuntan al mismo lugar en memoria, entonces son iguales
        if(this == obj) return true;
        //Si el objeto comparado es null o no es de la misma clase, entonces no son iguales
        if(obj == null || getClass() != obj.getClass()) return false;

        //Si se pasan las validaciones anteriores entonces el objeto se convierte en un objeto de tipo factura y se compara con equals
        Factura factura = (Factura) obj;

        //Se compara si son iguales con el atributo folio
        return this.folio.equals(factura.folio);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(folio);
    }
}
