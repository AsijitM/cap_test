package pdf;

public class HondaCity extends Car {
	private int mileage;
	
	public HondaCity(int mileage) {
		super(true,"4");
		this.mileage=mileage;
	}

	@Override
	public String getMileage() {
		// TODO Auto-generated method stub
		return this.mileage+ "kmpl";
	}
	

}
