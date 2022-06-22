package banco.v5;

public class TesteBanco {

	public static void main(String[] args) {
		TesteBanco testeBanco = new TesteBanco();
		Banco banco = new Banco();
		
		System.out.println("\n------------------ CRIAÇÃO DE CONTAS BANCÁRIAS ------------------\n");
		
		System.out.println("Criando uma conta poupança para o cliente Bruno Henrique com saldo de R$ 50.000,00 a taxa de rendimento de 3%.");
		Cliente brunoHenrique = new Cliente("Bruno", "Henrique");
		Conta contaBH = new ContaPoupanca(50000, 0.03);
		brunoHenrique.setConta(contaBH);
		banco.adicionarCliente(brunoHenrique);
		
		System.out.println("Criando uma conta corrente para o cliente Everton Ribeiro com saldo de R$ 45.000,00 e cheque especial de R$ 30.000,00.");
        Cliente evertonRibeiro = new Cliente("Everton", "Ribeiro");
        Conta contaER = new ContaCorrente(45000, 30000.00);
        evertonRibeiro.setConta(contaER);
        banco.adicionarCliente(evertonRibeiro);
		
		System.out.println("Criando uma conta corrente para o cliente Filipe Luis com saldo de R$ 70.000,00 e sem cheque especial.");
		Cliente filipeLuis = new Cliente("Filipe", "Luis");
		Conta contaFL = new ContaCorrente(70000);
		filipeLuis.setConta(contaFL);
		banco.adicionarCliente(filipeLuis);
		
		System.out.println("Criando uma conta poupança para o cliente Bruno Henrique com saldo de R$ 220.000,00 a taxa de rendimento de 3%.");
		Cliente gabrielBarbosa = new Cliente("Gabriel", "Barbosa");
		Conta contaGB = new ContaPoupanca(220000,0.03);
		gabrielBarbosa.setConta(contaGB);
		banco.adicionarCliente(gabrielBarbosa);
		
		System.out.println("Criando uma conta corrente para o cliente Diego Alves com saldo de R$ 50.000,00 e sem cheque especial.");
		Cliente diegoAlves = new Cliente("Diego", "Alves");
		Conta contaDA = new ContaCorrente(50000);
		diegoAlves.setConta(contaDA);
		banco.adicionarCliente(diegoAlves);
		
		System.out.println("Diego Alves autorizou o cadastro de sua conta conrrente como sendo conjunto com a cliente Lorena Lara");
		Cliente lorenaLara = new Cliente("Lorena", "Lara");
		lorenaLara.setConta(contaDA);
		banco.adicionarCliente(lorenaLara);
		
		System.out.println();
		System.out.println("\n------------------ RELATÒRIO DE TRANSAÇÕES ------------------\n");
		
		System.out.println("Recuperando o cliente Bruno Henrrique");
		Cliente cliente = banco.getCliente(0);
		Conta conta = cliente.getConta();
		System.out.println("Saque R$ 1.200,00: " + conta.sacar(1200));
		System.out.println("Deposito R$ 8.525,00: " + conta.depositar(8525));
		System.out.println("Saque R$ 12.800,00: " + conta.sacar(12800));
		System.out.println("Saque R$ 50.000,00: " + conta.sacar(50000));
		testeBanco.exibirSaldo(cliente);
		
		System.out.println("Recuperando o cliente Everton Ribeiro");
		cliente = banco.getCliente(1);
		conta = cliente.getConta();
		System.out.println("Saque de R$ 12.500,00: " + conta.sacar(12500.00));
        System.out.println("Saque de R$ 18.500,00: " + conta.sacar(18500.00));
        System.out.println("Deposito de R$ 3.500,00: " + conta.depositar(3500.00));
        System.out.println("Saque de R$ 17.000,00: " + conta.sacar(17000.00));
        System.out.println("Saque de R$ 25.000,00: " + conta.sacar(25000.00));
        testeBanco.exibirSaldo(cliente);
        
        
        System.out.println("Recuperando o cliente Filipe Luis");
		cliente = banco.getCliente(2);
		conta = cliente.getConta();
		System.out.println("Saque de R$ 25.500,00: " + conta.sacar(25500.00));
        System.out.println("Deposito de R$ 2.000,00: " + conta.depositar(2000.00));
        System.out.println("Saque de R$ 37.200,00: " + conta.sacar(37200.00));
        System.out.println("Saque de R$ 17.000,00: " + conta.sacar(17000.00));
        System.out.println("Saque de R$ 15.000,00: " + conta.sacar(15000.00));
        testeBanco.exibirSaldo(cliente);
        
        System.out.println("Recuperando o cliente Gabriel Barbosa");
		cliente = banco.getCliente(3);
		conta = cliente.getConta();
		System.out.println("Saque de R$ 15.500,00: " + conta.sacar(15500.00));
        System.out.println("Deposito de R$ 3.000,00: " + conta.depositar(3000.00));
        System.out.println("Saque de R$ 23.400,00: " + conta.sacar(23400.00));
        System.out.println("Saque de R$ 17.000,00: " + conta.sacar(17000.00));
        testeBanco.exibirSaldo(cliente);
        
        System.out.println("Recuperando o cliente Diego Alves");
		cliente = banco.getCliente(4);
		conta = cliente.getConta();
		System.out.println("Saque de R$ 28.000,00: " + conta.sacar(28000.00));
        System.out.println("Deposito de R$ 3.000,00: " + conta.depositar(3000.00));
        System.out.println("Saque de R$ 17.000,00: " + conta.sacar(17000.00));
        testeBanco.exibirSaldo(cliente);
        
        System.out.println("Recuperando a cliente Lorena Lara");
		cliente = banco.getCliente(5);
		conta = cliente.getConta();
		System.out.println("Saque de R$ 32.000,00: " + conta.sacar(32000.00));
        System.out.println("Deposito de R$ 13.000,00: " + conta.depositar(13000.00));
        System.out.println("Saque de R$ 16.600,00: " + conta.sacar(16600.00));
        testeBanco.exibirSaldo(cliente);
			
	}
	
	public void exibirSaldo(Cliente cliente) {
        System.out.println("Cliente [" + cliente.getNome()
                + ", " + cliente.getSobrenome()
                + "] tem o saldo de R$ " + cliente.getConta().getSaldo());
        System.out.println();
	}
}