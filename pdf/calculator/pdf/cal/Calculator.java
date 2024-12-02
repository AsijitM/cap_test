package pdf.cal;

public abstract class Calculator {
   abstract int add(int a, int b);
}
class Adder extends Calculator{

	@Override
	int add(int a, int b) {
		
		return a+b;
	}
	
}
class Multiplier extends Calculator{
	int multiply(int a,int b,Calculator calculator) {
		int result=a;
		for(int i=0;i<b;i++) {
			result=calculator.add(result, b);
		}
		return result;
	}

	@Override
	int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
}
