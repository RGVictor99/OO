package arrays;

import Aulas.Hospede;

public class Aula10 {
	
	public static void main(String[] args) {
		
		int [] numbers = new int [5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println(numbers[i]);
		}
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		
		System.out.println();
		
		//for (int i = 0; i < numbers.length; i++) {
			//System.out.println(numbers[i]);
		//}
		
		//Outra meneira de declaração
		
		for(int x: numbers) {
			System.out.println(x);
		}
		
		System.out.println();
		
		String [] names = new String[3];
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		names[0] = "Victor";
		names[1] = "Ribeiro";
		names[2] = "Gonçalez";
		
		System.out.println();
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		// Outra maneira de declaração
		
		String [] weekend = {"Saturday", "Sunday"};
		System.out.println();
		
		for(int i = 0; i < weekend.length; i++) {
			System.out.println(weekend[i]);
		}
		
		Hospede[] hospedes = new Hospede[2];
		
		Hospede victor = new Hospede();
		victor.setNome("Victor");
		victor.setSobrenome("Ribeiro");
		hospedes[0] = victor;
		
		Hospede samara = new Hospede();
		samara.setNome("Samra");
		samara.setSobrenome("Ribeiro");
		hospedes[1] = samara;
		
		
		System.out.println();
		for(int i = 0; i < hospedes.length; i++) {	
			System.out.println(hospedes[i].getNome());
			System.out.println(hospedes[i].getSobrenome());
		}
		
		
		// MATRIZES
		
		//int [] [] twoDimensions = new int [2] [2];
		
		int [] [] twoDimensions = new int [2][];
		twoDimensions[0] = new int[2];
		twoDimensions[1] = new int [5];
		
		for(int i = 0; i < twoDimensions.length; i++) {
			for(int j = 0; j < twoDimensions[i].length; j++) {
				twoDimensions[i][j] = (int)(Math.random() * 10);
				System.out.println(twoDimensions[i][j]);
			}
		}
		
	}
}
