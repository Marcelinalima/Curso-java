package ex6;

public class ContaEspecial  extends ContaCorrente{
	
	private double limite;
	
	public ContaEspecial() {}

	public ContaEspecial(String nome, double saldo, double limite) {
		super(nome, saldo);
		this.limite =limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + "]";
	}

	

}
