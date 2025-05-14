package DeclaracionImpuestos;

public class CuentaFiscal {
    private final String rfc;
    private double saldoDisponible;

    public CuentaFiscal(String rfc, double saldoDisponible){
        if(saldoDisponible < 0.0){
            System.out.println("El saldo no puede ser negativo");
        }
        this.saldoDisponible = saldoDisponible;
        this.rfc=rfc;
    }

    public String getRfc(){
        return this.rfc;
    }

    public double getSaldoDisponible(){
        return this.saldoDisponible;
    }

    public boolean validarRFC(DeclaracionImpuestos d){
        return this.rfc.equals(d.rfcContribuyente());

    }
}
