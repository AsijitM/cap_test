package pdf.nutri;

abstract class Food {
	double protiens;
	double fats;
	double carbs;
	double tastyScore;
	public abstract void getMacroNutrients();
	
}
class Egg extends Food{
	
	public Egg(double protiens,double fats,double carbs) {
		this.protiens=protiens;
		this.fats=fats;
		this.carbs=carbs;
	}
    int tastyScore=7;
    String type="non-vegetarian";
	@Override
	
	public void getMacroNutrients() {
		// TODO Auto-generated method stub
		System.out.println("An egg has "+this.protiens+" gms of protiens, "+this.fats+" gms of fats and "+this.carbs+" gms of carbohydrates." );
	}
	
}
class Bread extends Food{
	public Bread(double protiens,double fats,double carbs) {
		this.protiens=protiens;
		this.fats=fats;
		this.carbs=carbs;
	}
    int tastyScore=8;
    String type="vegetarian";
	@Override
	
	public void getMacroNutrients() {
		// TODO Auto-generated method stub
		System.out.println("A slice of bread has "+this.protiens+" gms of protiens, "+this.fats+" gms of fats and "+this.carbs+" gms of carbohydrates." );
	}
}