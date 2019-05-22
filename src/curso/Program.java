package curso;

import java.util.Scanner;

import entities.Itens;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int  n;
		double soma=0;
		Itens[] vect = new Itens[3];
		
		n = sc.nextInt();
		
		for(int i = 0; i < 3; i++) {
			sc.nextLine();
		   String name = sc.nextLine();
		   double price = sc.nextDouble();
		  
		   
		   vect[i] = new Itens(name, price);
		   
		   soma += vect[i].getPrice();
		   
		}
		
		System.out.printf("AVERAGE PRICE = %.2f",soma/n);
	}

}
