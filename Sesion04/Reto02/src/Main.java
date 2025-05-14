import DeclaracionImpuestos.DeclaracionImpuestos;
import DeclaracionImpuestos.CuentaFiscal;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DeclaracionImpuestos declaracion1 = new DeclaracionImpuestos("X1234",15.300);
        CuentaFiscal cuentaFiscal1 = new CuentaFiscal("X1234",12.30);
        System.out.println("Declaración enviada por RFC: " +declaracion1.rfcContribuyente() + " por $" +declaracion1.montoDeclarado());
        System.out.println("Cuenta fiscal registrada con RFC: "+cuentaFiscal1.getRfc()+", saldo disponible: $"+cuentaFiscal1.getSaldoDisponible());
        System.out.println("¿RFC válido para esta cuenta?: " + (cuentaFiscal1.validarRFC(declaracion1)?"Si":"No") );
    }
}