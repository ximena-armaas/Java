import Pagos.MetodoPago;
import Pagos.PagoEfectivo;
import Pagos.PagoTarjeta;
import Pagos.PagoTransferencia;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MetodoPago[] pagos = new MetodoPago[]{
             new PagoTarjeta(320.5,153),
             new PagoEfectivo(56.8),
             new PagoTransferencia(896.3),
             new PagoTarjeta(300.0,350.3)
        };

        for (MetodoPago pago : pagos) {
            if(pago.autenticar()){
                pago.procesarPago();
                pago.mostrarResumen();
            }else {
                System.out.println("Autenticación fallida en el pago tipo: "+pago.getClass().getSimpleName());
            }
        }
    }
}