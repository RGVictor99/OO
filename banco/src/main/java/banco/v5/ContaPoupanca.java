package banco.v5;

public class ContaPoupanca extends Conta {
	
	private double taxaRendimento;
	
	public ContaPoupanca(double saldoInicial, double rendimento) {
		super(saldoInicial);
		this.taxaRendimento = taxaRendimento;
	}

}
