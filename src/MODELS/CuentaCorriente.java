package MODELS;

public class CuentaCorriente {

	// Propiedades
	private String NumeroCuenta;
	private double saldo;
	private Persona titular;

	
	// Constructor
	public CuentaCorriente(String numeroCuenta, double saldo, Persona titular) {
		super();
		NumeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.titular = titular;
	}

	
	// Getter y setter
	public String getNumeroCuenta() {
		return NumeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public Persona getTitular() {
		return titular;

	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	// Metodos

	public void sumarCantidad(double cantidad) {
		
		this.saldo = this.saldo += cantidad;
		
	}

	public void restarCantidad(double cantidad) {

		this.saldo = this.saldo -= cantidad;
	}

	// ToString

	@Override
	public String toString() {
		return String.format("CuentaCorriente [NumeroCuenta=%s, saldo=%s, persona=%s]", NumeroCuenta, saldo, titular);
	}

}
