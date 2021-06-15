package main;


import java.util.Scanner;

public class Converter {
	
	public static void main(String[] args){
		
		int menuSelection = 0;
		int menuSelection2 = 0;
		double con = 0;
		double qty = 0;
		
		Scanner userInputScanner = new Scanner(System.in);
		
		/*
		 * First Attempt it works BTW
		 * while(menuSelection != 4) {
			System.out.print(
					"Please select an option:\n"
					+ "1. Cups to Teaspoons\n"
					+ "2. Celsisus to Farenheit\n"
					+ "3. US Gallons to Imperical Gallons\n"
					+ "4. Quit");
			menuSelection = userInputScanner.nextInt();
			
			
			if (menuSelection == 1 ) {
				System.out.println("You have selected Cups to Teaspoons Conversion\n "
						+ "Please enter value in Cups:");
				 qty = userInputScanner.nextDouble();
				
		
			}else if (menuSelection == 2) {
				System.out.println("You have selected Celsisus to Farenheit Conversion\n "
						+ "Please enter value in Degrees Celcsius:");
				//double qty = userInputScanner.nextDouble();
				qty = userInputScanner.nextDouble() ; ; 
				//qty = 0; 
				 con = convertCelsiusToFarenheit(qty);
				System.out.println(qty + " Degrees Celsius is equla to "+ con +
				 " Degrees Frenheit" );	
		
				
			}else if (menuSelection == 3){
				System.out.println("You have selected US Gallons to Imperical Gallons\n "
						+ "Please enter value in US Gallons:");
				 qty = userInputScanner.nextDouble();
				//convertUSGallonsToImericalGallons(qty);
				//userInputScanner.close();
			}else {
				System.out.println("Program over.");
			
			}
		}
		*/
		
		// While loop with the condition menuSelcetion != last menu option 
		while(menuSelection != 3) {
			System.out.println(" Please select a number option:\n"
					+ "1. Temp convertion\n"
					+ "2. Volume convertion\n"
					+ "3. Quit");
			menuSelection = userInputScanner.nextInt();
			
			// nested whille loop and swith statement 
			
			
			
			if(menuSelection == 1) {
				while(menuSelection2 != 3) {
				switch (menuSelection2) {
				default:
					System.out.println(
							"You have selected Volume Conversion choose a number option\n"
							+ "1. Cups to Teaspoons\n"
							+ "2. US Gallons to Imperical Gallons\n"
							+ "3. Quit");
					menuSelection2 = userInputScanner.nextInt();
					break;
				case 1:
					System.out.println("You have selected Cups to Teaspoons Conversion\n "
							+ "Please enter value in Cups:");
					 qty = userInputScanner.nextDouble();
					 con = convertCupsToTeaspoons(qty);
					 System.out.println(qty + " ups is equla to "+ con +
							 " teaspoons" );
					
					menuSelection2 = 0;
					break;
				case 2:
					System.out.println("You have selected US Gallons to Imperical Gallons Conversion\n "
							+ "Please enter value in US Gallons:");
					 qty = userInputScanner.nextDouble();
					 con = convertUSGallonsToImericalGallons(qty);
					 System.out.println(qty + " US Gallons is equla to "+ con +
							 " Imperical Gallons." );
						
					
					menuSelection2 = 0;
					break;
				case 3:
					System.out.println("You have choose to end the program");
					menuSelection = 0; 
					break;
				}
				}
				
			}else if (menuSelection == 2) {
				while(menuSelection2 != 2) {
				switch (menuSelection2) {
				default:
					System.out.println(
							"You have selected Volume Conversion choose a number option"
							+ "1. Celsius to Farenheit"
							+ "2. Quit");
					break;
				case 1:
					System.out.println("You have selected Celsisus to Farenheit Conversion\n "
							+ "Please enter value in Degrees Celcsius:");
					qty = userInputScanner.nextDouble() ; ;  
					 con = convertCelsiusToFarenheit(qty);
					System.out.println(qty + " Degrees Celsius is equla to "+ con +
					 " Degrees Frenheit" );	

					
					break;
				case 2:
					System.out.println("You have choose to end the program");
					menuSelection = 0; 
				}	
				
			}
			}else {
				System.out.println("Program over.");
			}
	
		}

		userInputScanner.close();
		
	}
	
		
		
		//Methods 
		
		//Input collection separate  
	private static double collectQuantity(String unit1, String unit2) {
		
		double qty = 0; 
		return qty;
	}
	
	public static double convertCelsiusToFarenheit(double qty) {
		double conversion = (qty * (9/5) + 32);
		return conversion;
	}
	
	public static double convertCupsToTeaspoons(double qty){
		double converstion = qty * 48;
		return converstion;
	}
	
	public static double convertUSGallonsToImericalGallons(double qty) {
		double converstion = qty/ 1.201;
		return converstion; 
	}
	
}
