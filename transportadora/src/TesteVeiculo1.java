import encapsulamento.versao1.Veiculo;

public class TesteVeiculo1 {
	public static void main(String[] args) {
		
		Veiculo cargam = new Veiculo();
		cargam.cargaMaxima = 10.000;
		
		Veiculo caixa1 = new Veiculo();
		caixa1.carga = (500);
		
		Veiculo caixa2 = new Veiculo();
		caixa2.carga = 250;
		
		Veiculo caixa3 = new Veiculo();
		caixa3.carga = 5000;
		
		Veiculo caixa4 = new Veiculo();
		caixa4.carga = 4000;
		
		Veiculo caixa5 = new Veiculo();
		caixa5.carga = 300;
		
		System.out.println("Criando um veículo com carga máxima de 10.000kg" + cargam.cargaMaxima );
		System.out.println("Adicionando caixa número 1 ("+ caixa1.carga );
		System.out.println("Adicionando caixa número 2 (250kg)" + caixa2.carga );
		System.out.println("Adicionando caixa número 3 (5000kg)" + caixa3.carga );
		System.out.println("Adicionando caixa número 4 (4000kg)" + caixa4.carga );
		System.out.println("Adicionando caixa número 5 (300kg)" + caixa5.carga );
	}
}
