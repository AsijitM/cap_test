package pdf;

import java.io.BufferedReader;
import java.io.IOException;

public class Solution {
   public static void main(String[] args) throws IOException{
	   BufferedReader bufferedReader=new BufferedReader(new inputStreamReader(System.in));
	   int carType=Integer.parseInt(bufferedReader.readLine().trim());
	   int carMileage = Integer.parseInt(bufferedReader.readLine().trim());
	   
	   if(carType==0) {
		   Car wagonR=new WagonR(carMileage);
		   wagonR.printCar("WagonR");
	   }
	   else if(carType==1) {
		   Car hondaCity=new HondaCity(carMileage);
		   hondaCity.printCar("HondaCity");
	   }
	   else if(carType==2) {
		   Car innovaCrysta=new InnovaCrysta(carMileage);
		   innovaCrysta.printCar("InnovaCrysta");
	   }
	   
	   bufferedReader.close();
	   
	
}
}
