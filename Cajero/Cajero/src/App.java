import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner lectura = new Scanner(System.in);

        System.out.println("CREAR CUENTA");

        System.out.println("Ingrese su nombre");
        String nombre = lectura.nextLine();

        System.out.println("Ingrese la clave");
        String clave = lectura.nextLine();

        System.out.println("Ingrese el monto inicial");
        String dineroentrante = lectura.nextLine();
       
        
        System.out.println("BIENVENIDO " +nombre+  " DIGITA LA ACCION QUE DESEAS REALIZAR");
        System.out.println(" 1 para consignar");
        System.out.println(" 2 para retiros");
        System.out.println(" 3 para consulta de saldo");
        System.out.println(" 4 para cambio de clave");

        String acciones = lectura.nextLine();

        Integer numero = Integer.valueOf(acciones);

        Integer dineroTotal = Integer.valueOf(dineroentrante);

        if (numero == 1) {

            System.out.println(" Digite dinero a consignar: ");
            int dineroConsigna = lectura.nextInt();

            int total = dineroTotal + dineroConsigna;

            System.out.println("Dinero consignado a su cuenta :" + total);
   
        }

        if (numero == 2) {

            System.out.println("Digite dinero a retirar:");
            int dineroRetiro = lectura.nextInt();
            System.out.println("El monto a retirar fue de: " + dineroRetiro);


            if (dineroRetiro > dineroTotal  || dineroRetiro <= 0 )   {
                System.out.println("el monto esta por debajo de 0  o  es mayor al monto actual");
            }

        }

        if (numero == 3) {

            System.out.println("escogio consulta de saldo");
            System.out.println("su saldo actual es: " + dineroTotal);

        }

        if (numero == 4) {
            System.out.println("clave antigua  " + clave);
            System.out.println("ingrese la nueva clave");
            String cambioClave = lectura.nextLine();
            clave = cambioClave;
            System.out.println("su nueva clave es: " + clave);

        }

        lectura.close();
    }

}
