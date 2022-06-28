
import banco.v7.*;
import relatorios.RelatoriosClientes;


public class TesteBancoExercicioFinal {

  public static void main(String[] args) {
	
    Banco banco = Banco.getBanco();
    Cliente cliente;
    RelatoriosClientes relatorios = new RelatoriosClientes();

    // Cria vários clientes e suas respectivas contas
    System.out.println("Criando uma conta corrente para o cliente Bruno Henrique.");
    Cliente brunoHenrique = new Cliente("Bruno", "Henrique");
    banco.adicionarCliente(brunoHenrique);
    cliente = banco.getCliente(0);
    cliente.adicionarConta(new ContaPoupanca(50000.00, 0.03));
    cliente.adicionarConta(new ContaCorrente(220000.00, 40000.00));
    
    System.out.println("Criando uma conta corrente para o cliente Everton Ribeiro");
    Cliente evertonRibeiro = new Cliente ("Everton", "Ribeiro");
    Conta contaER = new ContaCorrente(45000, 30000.00);
    evertonRibeiro.adicionarConta(contaER);
    banco.adicionarCliente(evertonRibeiro);
    
    System.out.println("Criando uma conta corrente para o cliente Filipe Luis.");
    Cliente filipeLuis = new Cliente ("Filipe", "Luis");
    Conta contaFL = new ContaCorrente(70000);
    filipeLuis.adicionarConta(contaFL);
    banco.adicionarCliente(filipeLuis);
    
    System.out.println("Criando uma conta corrente para o cliente Gabriel Barbosa.");
    Cliente gabrielBarbosa = new Cliente("Gabriel", "Barbosa");
    banco.adicionarCliente(gabrielBarbosa);
    cliente = banco.getCliente(2);
    cliente.adicionarConta(new ContaPoupanca(220000.00, 0.03));
    
    relatorios.geraRelatorio();
  }
}


