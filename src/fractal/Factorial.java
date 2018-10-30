package fractal;

import java.math.BigInteger;

public class Factorial {
	int number;

	public Factorial() {
	}

	public Factorial(int number) {
		this.number = number;
	}
	
	BigInteger calculate(int number){
		System.out.println(number);
		if (number==0) return BigInteger.ONE;
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  calculate(number-1).multiply(BigInteger.valueOf(number));	
	}
	
	BigInteger calculate(BigInteger first, BigInteger second){
		
		if (second.equals(first.subtract(BigInteger.ONE))) return BigInteger.ONE;
		System.out.println(first+"-->"+second);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  calculate(first, (second.subtract(BigInteger.ONE))).multiply(second);	
	}
}
