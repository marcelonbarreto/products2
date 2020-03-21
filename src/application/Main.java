package application;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		//Variables
		String product1 = "MacBook Pro";
		String product2 = "Acer Notebook";
		String product3 = "Samsung Galaxy S10";
		String product4 = "iPhone 11";
		
		int qty1 = 200;
		int qty2 = 120;
		int qty3 = 74;
		int qty4 = 86;
		int totalQty = (qty1 + qty2 + qty3 + qty4);
		
		double price1 = 7500.00;
		double price2 = 2569.99;
		double price3 = 6350.40;
		double price4 = 10000.00;
		double totalOfValues = (price1 + price2 + price3 + price4);
		
		System.out.println("Products in the store stock");
		System.out.println();
		System.out.println("COMPUTERS: ");
		Locale.setDefault(Locale.US); //Defining local set default as US
		System.out.printf("%s Apple with %d units, each: R$ %.2f%n", product1, qty1, price1);
		System.out.printf("%s Notebook with %d units, each: R$ %.2f%n", product2, qty2, price2);
		System.out.println();
		System.out.println("SMARTPHONES: ");
		System.out.printf("%s with %d units, each: R$ %.2f%n", product3, qty3, price3);
		System.out.printf("Apple %sPro, with %d units in stock, each: R$ %.2f%n", product4, qty4, price4);
		System.out.println();
		System.out.printf("NAME OF BRANDS IN STORE: %s, %s, %s, %s.", product1, product2, product3, product4);
		System.out.println();
		System.out.println();
		System.out.println("TOTAL OF QTY: ");
		System.out.printf("%d of units", totalQty);
		System.out.println();
		System.out.println();
		System.out.println("TOTAL OF VALUES: ");
		System.out.printf("R$ %.2f%n", totalOfValues);
		
	}

}
