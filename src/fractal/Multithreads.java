package fractal;

import java.math.BigInteger;
import java.util.Scanner;

/*Дописать возможность рассчитывать факториал в произвольном количестве потоков
Исходный код взять в slack*/
public class Multithreads  {
	static int numberOfThreads,number;
	BigInteger factorThreadAmount=BigInteger.ONE;
	BigInteger[] factorial=new BigInteger[numberOfThreads];
	
	public  class MyThread extends Thread {
		int numberOfThreads;
		 BigInteger fromNumber, toNumber;	//
		 BigInteger factorThread, factorThreadAmount  ;
		 
		public MyThread(BigInteger fromNumber, BigInteger toNumber, int numberOfThreads) {
			this.fromNumber = fromNumber;
			this.toNumber = toNumber;
			this.numberOfThreads = numberOfThreads;
		}

		public void run() {
			Factorial factorial = new Factorial();
			factorThread= factorial.calculate(fromNumber, toNumber) ;
			Result.setFactorial(factorThread); 
		}
	}
	
	public static void main(String[] args) {
		
		int fromNumber, toNumber;	//BigInteger
		
		System.out.println("Enter number of the factor you want to calculate: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println("Enter the number of threads that will calculate the factorial : ");
		numberOfThreads = sc.nextInt();
		Result.numberOfThreadsStart=numberOfThreads;
		
		MyThread [] threads = new MyThread[numberOfThreads] ;
		int delta = number/ numberOfThreads; //16 number / 3 threads = 5 numbers multiplies
		
		for (int n=0;n<numberOfThreads ; n++) {
			fromNumber = number - (n+1)*delta ;
			toNumber = number - n*delta ;
			if (n>0) toNumber--;
			if (n == numberOfThreads-1 && fromNumber !=1 ) {
				fromNumber=1;
			}
			threads[n] = new Multithreads().new MyThread(BigInteger.valueOf(fromNumber), BigInteger.valueOf(toNumber), n);		//numberOfThreads
			threads[n].start();
		}
	
		while(Result.numberOfThreads != numberOfThreads) {
		}
		System.out.println("Value factorial equals "+ Result.getFactorial());
	}
}