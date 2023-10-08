package secao_08_introducao_a_poo.entities;

public class Employee {
	public String nome;
	public float salarioBruto;
	public float imposto;
	
	public String toString() {
		return nome+", $ "+String.format("%.2f", salarioLiquido());
	}

	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumentarSalario(double percentual) {
		salarioBruto += salarioBruto * (percentual>1?percentual/100:percentual); 
	}
}
