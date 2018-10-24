package car;
//Добавить doudle поле "бензобак" в класс Car
//Добавить добавить возможность заправки бензобака в класс Car
//Добавить добавить возможность проверки бензина в бензобаке в класс Car
//Добавить рассчет потраченного топлива в зависимости от объема двигателя и вычитание его из бензобака в класс Car

public class Car {
	private String name;
	private Engine engine;
	private Climate climate = new Climate();     

	double gasTank;


	public Car(String name, double engineVolume) {
		this.name = name;
		engine = new Engine(0,engineVolume);
	}

	public Car(String name, double mileage, double engineVolume) {
		this.name = name;
		engine = new Engine(mileage,engineVolume);
	}

	public String getName() {
		return name;
	}

	public double getMileage() {
		return engine.getMileage();
	}

	//завести мотор
	public void turnOn() {
		engine.turnOn();
		climate.turnOn();
		climate.setTemperature(21);
	}

	//заглушити мотор
	public void turnOff() {
		climate.turnOff();
		engine.turnOff();
	}

	//встановити швидкість
	public void start(int speed, double hours) {
		if (engine.isStarted()) { //ще не заведений мотор
			//пройдена дистанція
			double distance=hours*speed;
			engine.addMileage(distance);

		}
	}
	public void setName(String name) {
		this.name = name;
	}

	void refuelingGasTank(double amount) {
		gasTank += amount;
	}

	public double getGasTank() {
		calculationOfSpellFuel();
		return gasTank;
	}

	private void calculationOfSpellFuel() {
		double spellFuel = (engine.getEngineVolume()*6/100) * engine.distance;
		gasTank -= spellFuel ;
		//return gasTank;
	}
}
