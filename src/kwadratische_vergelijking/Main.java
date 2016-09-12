package kwadratische_vergelijking;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner user_input = new Scanner( System.in );
		
		double a,b,c;
		
		System.out.print("Variable a: ");
		a = user_input.nextDouble();
		
		System.out.print("Variable b: ");
		b = user_input.nextDouble();
		
		System.out.print("Variable c: ");
		c = user_input.nextDouble();
		
		double D = (b * b) - (4 * a * c);
		
		if(D < 0){
			System.out.println("Geen mogelijkheid");
		}else if (D == 0){
			double x = (-b + Math.sqrt(D))/(2 * a);
			System.out.println("Er is een oplossing, namelijk : x = " + x);
		}else{
			double x1 = (-b + Math.sqrt(D))/(2 * a);
			double x2 = (-b - Math.sqrt(D))/(2 * a);
			System.out.println("Er zijn twee oplossingen, namelijk: x1 = " + x1 + " en x2 = " + x2);
		}

	}

}
