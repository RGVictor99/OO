package atribRef;

public class TestePonto {
	
	public static void main(String [] args) {
		
		Ponto primeiroPonto, segundoPonto, outraRefSegundoPonto;
		
		primeiroPonto = new Ponto();
		segundoPonto = new Ponto (400,230);
		primeiroPonto.setX(200);
		primeiroPonto.setY(200);
		
		System.out.println("Coordenadas do primeiro ponto (x,y): " + "(" + primeiroPonto.getX() + "," + primeiroPonto.getY() + ")");
		System.out.println("Coordenadas do segundo ponto (x,y): " + "(" + segundoPonto.getX() + "," + segundoPonto.getY() + ")\n");
		
		
		System.out.println("Criação de uma segunda referência para o segundo ponto, chamada outraRefSegundoPonto\n");
		System.out.println("Exibindo o conteúdo de todas referências\n");
		
		outraRefSegundoPonto = segundoPonto;
		
		System.out.println("Coordenadas do primeiro ponto (x,y): " + "(" + primeiroPonto.getX() + "," + primeiroPonto.getY() + ")");
		System.out.println("Coordenadas do segundo ponto (x,y): " + "(" + segundoPonto.getX() + "," + segundoPonto.getY() + ")");
		System.out.println("Coordenadas do objeto apontado pela referência outraRefSegundoPonto (x,y): " + "(" + outraRefSegundoPonto.getX() + "," + outraRefSegundoPonto.getY() + ")\n");
		
		System.out.println("Alterando as coordenadas do segundo ponto para (840,230)\n");
		
		outraRefSegundoPonto = new Ponto (840,230);
		segundoPonto = outraRefSegundoPonto;
		
		System.out.println("Coordenadas do primeiro ponto (x,y): " + "(" + primeiroPonto.getX() + "," + primeiroPonto.getY() + ")");
		System.out.println("Coordenadas do segundo ponto (x,y): " + "(" + segundoPonto.getX() + "," + segundoPonto.getY() + ")");
		System.out.println("Coordenadas do objeto apontado pela referência outraRefSegundoPonto (x,y): " + "(" + outraRefSegundoPonto.getX() + "," + outraRefSegundoPonto.getY() + ")\n");
	}

}
