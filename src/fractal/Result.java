package fractal;

import java.math.BigInteger;

public class Result {
	
	static int numberOfThreads=0,  numberOfThreadsStart=100;
	static BigInteger[] factorialArray=new BigInteger[numberOfThreadsStart];

	public static void setFactorial(BigInteger factorial) {
	
		factorialArray[numberOfThreads] = factorial;
		System.out.println("set value of factorial " + numberOfThreads + " in " + factorialArray[numberOfThreads]);
		numberOfThreads++;
	}

	public static BigInteger getFactorial() {
		BigInteger factorial = BigInteger.ONE;
		for (int i = 0; i <= numberOfThreads-1; ++i) factorial = factorial.multiply(factorialArray[i]);
		return factorial;
	}

}
