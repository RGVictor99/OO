package banco.v4;
import java.util.ArrayList;

import banco.v3.Cliente;


public class Banco {
	
	private ArrayList<Cliente> clientes;
	
	public Banco() {
		clientes = new Arraylist<>();
	}
	
	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public Cliente getCliente(int indice) {
		return clientes.get(indice);
	}
	
	public int getNumeroDeClientes() {
		return this.clientes.size();
	}
}
