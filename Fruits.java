import java.util.Scanner;

public class Fruits {
	Scanner scan = new Scanner(System.in);
	protected String name;
	protected double price, discountprice;
	public Fruits() {
			System.out.println("Fruits constructor is invoked");
		
	}
	
	public String CreateFruits() {
		System.out.print("Please choose the fruits you want (Mango/Durian): ");
		this.name = scan.nextLine();
		while (this.name.equalsIgnoreCase("Mango")== false && this.name.equalsIgnoreCase("Durian")==false) {
			System.out.println("Wrong Input! Please choose Mango or Durian only!");
			System.out.print("Please choose the fruits you want (Mango/Durian): ");
			this.name = scan.nextLine();
		}
		return this.name;
	}
	
	public double CalculatePrice() {
		if (this.name.equalsIgnoreCase("Mango")) {
			this.price = 0.35;
		}
		else if (this.name.equalsIgnoreCase("Durian")) {
			this.price = 1.5;
		}
		return this.price;
	}

	public String toString() {
		return (CreateFruits() + " is constructed \n" + "Price of " + this.name + " = RM" + CalculatePrice());
	}
}