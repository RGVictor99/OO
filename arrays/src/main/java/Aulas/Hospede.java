package Aulas;

public class Hospede {
	String nome;
    String sobrenome;
    
	public Hospede() {
	}
	
	public Hospede(String nome) {
		this.nome = nome;
	}
	
	public Hospede(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    /**
     * Este metodo é crucial para a estabilidade da classe hospede
     * Caso queira entender com maiores detalhes sua logica de implementação
     * consulte o documento de especificações de requisitos do sistema 
     */
    public void metodoMuitoComplexo(double numeroGrande) {
    	
    	
    }
    
}
