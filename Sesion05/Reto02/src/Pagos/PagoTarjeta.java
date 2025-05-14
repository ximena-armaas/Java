package Pagos;

public class PagoTarjeta extends MetodoPago{
    public double saldoDisponible;

    public PagoTarjeta(double saldoDisponible, double monto){
        super(monto);
        this.saldoDisponible = saldoDisponible;
    }
    @Override
    public boolean autenticar(){
        if(saldoDisponible<monto)return false;
        return true;
    }

    @Override
    public void procesarPago(){
        if (autenticar()){
            System.out.println("Pago con tarjeta procesado por: $"+monto);
        }else {
            System.out.println("Los fondo son insuficientes");
        }
    }
}
