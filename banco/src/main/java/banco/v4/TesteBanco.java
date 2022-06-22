package banco.v4;

public class TesteBanco {

	public static void main(String[] args) {
		Banco banco = new Banco();
		
		Cliente brunoHenrique = new Cliente("Bruno", "Henrique");
		Conta contaBH = new Conta(50000);
		brunoHenrique.setConta(contaBH);
		
		Cliente evertonRibeiro = new Cliente("Everton", "Ribeiro");
		Conta contaER = new Conta(45000);
		evertonRibeiro.setConta(contaER);
		
		Cliente filipeLuis = new Cliente("Filipe", "Luis");
		Conta contaFL = new Conta(70000);
		filipeLuis.setConta(contaFL);
		
		Cliente gabrielBarbosa = new Cliente("Gabriel", "Barbosa");
		Conta contaGB = new Conta(220000);
		gabrielBarbosa.setConta(contaGB);
		
		Cliente diegoAlves = new Cliente("Diego", "Alves");
		Conta contaDA = new Conta(50000);
		diegoAlves.setConta(contaDA);
		
		banco.adicionarCliente(brunoHenrique);
		banco.adicionarCliente(evertonRibeiro);
		banco.adicionarCliente(filipeLuis);
		banco.adicionarCliente(gabrielBarbosa);
		banco.adicionarCliente(diegoAlves);
		
		for (int i = 0; i <banco.getNumeroDeClientes(); i++) {
			Cliente cliente = banco.getCliente(i);
			Conta conta = cliente.getConta();
			
			System.out.println("Cliente [" + (i + 1) + "] : " + cliente.getNome() + " " + cliente.getSobrenome() + "." + "Saldo R$: " + conta.getSaldo());
			
		}
	}
}