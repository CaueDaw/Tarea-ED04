package cuentas;

/**
 * 
 * @author Caue Fiorini Venancio
 */
public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        float cantidad;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        cantidad = 2300f;  // puedes cambiar el valor para probar

        operativa_cuenta(cuenta1, cantidad);
    }

    /**
     * Realiza la operativa principal con la cuenta:
     * muestra saldo, retira e ingresa la cantidad indicada.
     *
     * @param cuenta1  objeto cuenta sobre el que operar
     * @param cantidad cantidad a retirar e ingresar
     */
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        double saldoActual;

        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta1.retirar(cantidad);
            System.out.println("Retirada de " + cantidad + " realizada correctamente");
        } catch (Exception e) {
            System.out.println("Fallo al retirar: " + e.getMessage());
        }

        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
            System.out.println("Ingreso de " + cantidad + " realizado correctamente");
        } catch (Exception e) {
            System.out.println("Fallo al ingresar: " + e.getMessage());
        }

        saldoActual = cuenta1.estado();
        System.out.println("El saldo final es " + saldoActual);
    }
}