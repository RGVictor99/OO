package banco.dominio.excecoes;

public class ContaCorrente extends Conta{
    
	private double chequeEspecial;

    public ContaCorrente(double saldoInicial, double chequeEspecial) {
        super(saldoInicial);
        this.chequeEspecial = chequeEspecial;
    }

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    public void sacar(double valor) throws ExcecaoChequeEspecial{
        if (this.saldo + this.chequeEspecial > valor) {
            this.saldo -= valor;
        } else {
        	double deficit = valor - this.saldo;
        	if( this.chequeEspecial == 0) {
        		throw new ExcecaoChequeEspecial("Não há cheque especial", deficit);        		
        	}else {
        		throw new ExcecaoChequeEspecial("Saldo insulficiente no cheque especial", deficit);
        	}	
        }
    }
     public double getChequeEspecial() {
    	 return chequeEspecial;
     }
     
     public void setChequeEspecial(double chequeEspecial) {
         this.chequeEspecial = chequeEspecial;
     }
}
