package cuentas;

/**
 * La clase CCuenta representa una cuenta bancaria sencilla
 * sobre la que se pueden realizar operaciones de ingreso
 * y retirada de dinero.
 * 
 * @author Caue Fiorini Venancio
 */
public class CCuenta {

    /** Nombre del titular de la cuenta. */
    private String nombre;

    /** Número identificador de la cuenta. */
    private String cuenta;

    /** Saldo actual de la cuenta. */
    private double saldo;

    /** Tipo de interés aplicado a la cuenta. */
    private double tipoInterés;

    /**
     * Constructor por defecto.
     */
    public CCuenta() {
    }

    /**
     * Crea una nueva cuenta bancaria con los datos indicados.
     *
     * @param nom   nombre del titular
     * @param cue   número de cuenta
     * @param sal   saldo inicial
     * @param tipo  tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     *
     * @return saldo actual
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa una cantidad en la cuenta, siempre que sea positiva.
     *
     * @param cantidad cantidad a ingresar
     * @throws Exception si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de la cuenta si hay saldo suficiente.
     *
     * @param cantidad cantidad a retirar
     * @throws Exception si la cantidad es menor o igual que cero,
     *                   o si no hay saldo suficiente
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    /**
     * Devuelve el nombre del titular de la cuenta.
     *
     * @return nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     *
     * @param nombre nuevo nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el número de cuenta.
     *
     * @return número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     *
     * @param cuenta nuevo número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo actual.
     *
     * @return saldo actual
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     *
     * @param saldo nuevo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipo de interés.
     *
     * @return tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés.
     *
     * @param tipoInterés nuevo tipo de interés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}