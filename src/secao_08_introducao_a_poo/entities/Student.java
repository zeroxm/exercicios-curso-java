package secao_08_introducao_a_poo.entities;

public class Student {
	
	final float PASSING_GRADE = 60;
	
	private String nome;
	private float primeiraNota;
	private float segundaNota;
	private float terceiraNota;
	
	public float getNotaFinal() {
		return primeiraNota + segundaNota + terceiraNota;
	}
	
	public boolean isAprovado() {
		return getNotaFinal() >= this.PASSING_GRADE;
	}
	
	public float getPontosFaltantes() {
		return this.PASSING_GRADE - getNotaFinal();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPrimeiraNota() {
		return primeiraNota;
	}
	public float getSegundaNota() {
		return segundaNota;
	}
	public float getTerceiraNota() {
		return terceiraNota;
	}

	public void setPrimeiraNota(float primeiraNota) {
		if(primeiraNota > 30) {
			primeiraNota = 30;
		}
		this.primeiraNota = primeiraNota;
	}
	public void setSegundaNota(float segundaNota) {
		if(segundaNota > 35) {
			segundaNota = 35;
		}
		this.segundaNota = segundaNota;
	}
	public void setTerceiraNota(float terceiraNota) {
		if(terceiraNota > 35) {
			terceiraNota = 35;
		}
		this.terceiraNota = terceiraNota;
	}
}
