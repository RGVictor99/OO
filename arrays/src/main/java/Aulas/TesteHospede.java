package Aulas;


public class TesteHospede {
	public static void main(String[] args) {
		Hospede victor = new Hospede();
		victor.setNome("Victor");
		victor.setSobrenome("Ribeiro Gonçalez");
		
		System.out.println("Nome... " + victor.getNome());
		System.out.println("Sobrenome... " + victor.getSobrenome());
		
		Hospede samara = new Hospede();
		samara.setNome("Samara");
		samara.setSobrenome("Ribeiro Gonçalez");
		
		System.out.println("Nome... " + samara.getNome());
		System.out.println("Sobrenome... " + samara.getSobrenome());
		
		//Sobrecarga de construrores
		
		Hospede thiago = new Hospede("Thiago");
		thiago.setSobrenome("Resende");
		
		System.out.println("Nome... " + thiago.getNome());
		System.out.println("Sobrenome... " + thiago.getSobrenome());
		
		Hospede julia = new Hospede("Julia", "Silveira");
		System.out.println("Nome... " + julia.getNome());
		System.out.println("Sobrenome... " + julia.getSobrenome());
		
    }
}
