package pdf;

public class WagonR extends Car{
	private int mileage;
	
	public WagonR(int mileage) {
		super(false,"4");
		this.mileage=mileage;
	}

	@Override
	public String getMileage() {
		// TODO Auto-generated method stub
		return mileage+ "kmpl";
	}
	
	

}
