package animais;

import java.sql.SQLOutput;

public class TesteAnimais {
	public static void main(String args[]) {
		Peixe p = new Peixe ("Nemo");
		Gato g = new Gato ("Tom");
		Animal a = new Peixe ("Peixoto");
		Animal ab = new Aranha ("Aracnilda");
		AnimalDeEstimacao ae = new Gato ("Pudim");
		
		System.out.println("O peixe" + p.getNome() + " possui " + p.getNumeroDePernas() + " pernas.");
		p.caminhar();
		p.brincar();
		p.comer();
		
		System.out.println();
		
		System.out.println("O gato " + g.getNome() + " possui " + g.getNumeroDePernas() + " pernas");
        g.caminhar();
        g.brincar();
        g.comer();

        System.out.println();
        System.out.println("O animal " + a.getNome() + " possui " + a.getNumeroDePernas() + " pernas");
        a.caminhar();
        if(a instanceof Peixe) {
            Peixe peixe = (Peixe) a;
            peixe.brincar();
        }
        a.comer();


        System.out.println();
        System.out.println("O animal " + ab.getNome() + " possui " + ab.getNumeroDePernas() + " pernas");
        ab.caminhar();
        ab.comer();

        System.out.println();
        ae.brincar();
        if(ae instanceof Gato) {
            Gato gato = (Gato) ae;
            System.out.println("O animal de estimação " + g.getNome() + " possui " + g.getNumeroDePernas() + " pernas");
            gato.caminhar();
            gato.comer();
        }


    }		
}
