package animais;

public class Gato extends Animal implements AnimalDeEstimacao{
	
	public Gato() {
		this("");
	}
	
	public Gato(String nome) {
		super(nome, 4);
	}
	
	@Override
	public void comer() {
		System.out.println(this.nome + " come raçao.");
	}
	
	@Override
	public void brincar() {
		System.out.println(this.nome + " brinca com a bola de meia.");
	}
	
}
