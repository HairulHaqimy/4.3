public class Durian extends Fruits {
	private int number;
	private double weight = 1.5, price;
		Durian(){
		super();
		this.name = "durian";
		System.out.println("Durian is constructed");
		System.out.println("Price per kg of durian = " + CalculatePrice());
		System.out.println("Weight per durian = " + weight + "kg");
		System.out.print("Please enter the amount of durian you want: ");
		number = scan.nextInt();
	}
	
	public double CalculatePrice(int number, double weight) {
		return price = number * weight * CalculatePrice();
	}

	
	public String toString() {
		return ("Total Price of Durian = RM" + CalculatePrice(number,weight) );
	}
}