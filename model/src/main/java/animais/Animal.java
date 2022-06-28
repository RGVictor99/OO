package animais;

public abstract class Animal {
	protected String nome;
	protected int numeroDePernas;
	
	protected Animal(String nome, int numeroDePernas) {
		this.nome = nome;
		this.numeroDePernas = numeroDePernas;
	}
	
	public abstract void comer();
	
	public void caminhar () {
		System.out.println(this.nome + " anda com " + this.numeroDePernas + " pernas.");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroDePernas() {
		return numeroDePernas;
	}

	public void setNumeroDePernas(int numeroDePernas) {
		this.numeroDePernas = numeroDePernas;
	}
	
	
}
