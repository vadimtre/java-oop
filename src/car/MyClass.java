package car;
//Добавить заправку и вывод остатка бензина в пример программы
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car bmv= new Car("BMV", 1.8);
		Car ferrari = new Car("Ferrari", 20000,2.4);

		Car [] car= {bmv,ferrari};

		bmv.refuelingGasTank(40);
		ferrari.refuelingGasTank(60);
		System.out.println("The car "+ bmv.getName() + " was filled with "+ bmv.getGasTank()+ " liters of gasoline .");
		System.out.println("The car "+ ferrari.getName() + " was filled with "+ ferrari.getGasTank()+ " liters of gasoline .");

		bmv.turnOn();
		ferrari.turnOn();

		final int[] speeds= new int[] {20,60,100};

		for (int s : speeds) 
			bmv.start(s, 0.5);
		for(int s:speeds)
			ferrari.start(s, 1);

		bmv.turnOff();
		ferrari.turnOff();

		for (Car c : car) {
			System.out.printf(c.getName()+":"+c.getMileage()+"\n");
		}

		for (Car c : car) {
			System.out.println( c.getName() + " has "+ c.getGasTank()+" liters of gas left in the car .");
		}
	}




}
