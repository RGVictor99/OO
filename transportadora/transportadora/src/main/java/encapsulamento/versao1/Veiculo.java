package encapsulamento.versao1;

public class Veiculo {
	
	public double carga;
	public double cargaMaxima;
	
	public Veiculo (double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	
	public double getCarga() {
		return carga;
	}
	
	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	public double getCargaMaxima() {
		return cargaMaxima;
	}
	
	public void setCargaMaxia(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	
}
