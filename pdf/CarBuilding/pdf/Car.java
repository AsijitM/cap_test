package pdf;

public abstract class Car {
	protected boolean isSedan;
	protected String seats;
	public Car(boolean isSedan, String seats) {
		super();
		this.isSedan = isSedan;
		this.seats = seats;
	}
	public boolean getisSedan() {
		return isSedan;
	}
	public void setSedan(boolean isSedan) {
		this.isSedan = isSedan;
	}
	public String getSeats() {
		return seats;
	}
	public void setSeats(String seats) {
		this.seats = seats;
	}
	
	abstract public String getMileage();
	
	public void printCar(String name) {
	    System.out.println("A " + name + " is " + (this.getisSedan() ? "" : "not ") + "Sedan, is a " + this.getSeats() + "-seater, and has a mileage of around " + this.getMileage() + ".");
	}

}
