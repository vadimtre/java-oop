package car;
//Добавить doudle поле "объем двигателя" в класс Engine

public class Engine {
	private double mileage;
	private boolean started;
	
	private double engineVolume;
	double  distance;
	

	public Engine(double mileage, double engineVolume) {
		this.mileage = mileage;
		this.engineVolume=engineVolume;
	}

	public double getMileage() {
		return mileage;
	}

	public double getEngineVolume() {
		return engineVolume;
	}
	
	public void addMileage(double mileage) {
		if (started) {
			this.mileage += mileage;
			this.distance+=mileage;
		}
	}

	public boolean isStarted() {
		return started;
	}

	public void turnOn() {
		started = true;
	}

	public void turnOff() {
		started = false;
	}

}
