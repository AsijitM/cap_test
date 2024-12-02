package pdf;

public class InnovaCrysta extends Car{
    private int mileage;
	
	public InnovaCrysta(int mileage) {
		super(false,"6");
		this.mileage=mileage;
	}

	@Override
	public String getMileage() {
		// TODO Auto-generated method stub
		return this.mileage+ "kmpl";
	}

}
