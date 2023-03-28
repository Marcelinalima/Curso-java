package o_o_exer_1_3;

public class Empregado {
	
	private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Empregado(String nome, String sobrenome, double salarioMensal) {
    	  this.nome = nome;
          this.sobrenome = sobrenome;    
        if (salarioMensal < 0)
            salarioMensal = 0.0;
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public double getSalarioMensal() {
        return salarioMensal;
    }
    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    public double getSalarioAnual(){
        return getSalarioMensal() * 12;
    }

    public void setAumento() {
        double novoSalario = getSalarioMensal() + getSalarioMensal() * 0.10;
        this.setSalarioMensal(novoSalario);
    }
}


