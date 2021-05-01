public class Mango extends Fruits {
	private int number;
	private double weight = 0.5, price;
	Mango(){
		super();
		this.name = "mango";
		System.out.println("Mango is constructed");
		System.out.println("Price per kg of mango = " + CalculatePrice());
		System.out.println("Weight per mango = " + weight + "kg");
		System.out.print("Please enter the amount of mango you want: ");
		number = scan.nextInt();
	}
	
	public double CalculatePrice(int number, double weight) {
		return price = number * weight * CalculatePrice();
	}

	
	public String toString() {
		return ("Total Price of Mango = RM" + CalculatePrice(number,weight) );
	}
}