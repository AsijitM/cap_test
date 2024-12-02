package pdf.car;

class Car {
      public int no_of_tires=4;
      public String bodyType="Plastic";
      
      public void reverseGear() {
    	  System.out.println("Reverse Gear is Applied...");
      }
      public void switchOnHeadlights() {
    	  System.out.println("Headlights turned on...");
      }
      
}
class BMW extends Car{
	public String modelName = "X3";
	public void topSpeed() {
		System.out.println("TopSpeed of BMW is 200 kmph");
	}
}
