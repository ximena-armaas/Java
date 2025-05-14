import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        var saldoInicial = 1000;
        int seleccionUsuario = 0;

        System.out.println("Bienvenido al cajero automático :)");

        do {
            System.out.println("1. Consultar saldo\n2. Depositar dinero\n3. Retirar dinero\n4. Salir");
            seleccionUsuario = sc.nextInt();
            sc.nextLine();

            switch (seleccionUsuario){
                case 1 ->System.out.println("Tu saldo total es: $"+saldoInicial);


                case 2 -> {
                    System.out.println("Ingresa el valor a depositar: $");
                    double deposito = sc.nextDouble();
                    sc.nextLine();
                    saldoInicial += deposito;

                }
                case 3 ->{
                    System.out.println("Ingresa la cantidad a retirar: $");
                    double retiro = sc.nextDouble();
                    sc.nextLine();
                    if(retiro<saldoInicial){
                        saldoInicial -= retiro;
                    }else{
                        System.out.println("Saldo insuficiente :(");
                    }


                }
                default -> {
                    System.out.println("Opción invalida");
                    continue;
                }


            }
        }while (seleccionUsuario != 4);
        sc.close();
        System.out.println("Adios :)");
    }
}