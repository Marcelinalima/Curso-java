package ex6;

public class ContaCorrente extends Cliente {
	
	private double saldo;
	
	
	
	public ContaCorrente() {}

	public ContaCorrente(String nome, double saldo) {
		super(nome);
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

	

	
	

}
