package Pagos;

public class PagoTransferencia extends MetodoPago {

    public PagoTransferencia(double monto){
        super(monto);
    }

    @Override
    public boolean autenticar(){
        return true;
    }

    @Override
    public void procesarPago(){
        System.out.println("Procesando pago de transferencia por: $"+ monto);
    }
}
