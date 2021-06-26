package np.com.kcsajan.ioc;

public class Car {
	Engine engine;

	public Car(Engine engine) {
		System.out.println("I'm Car Engine Constructor.");
		this.engine = engine;
	}

	public void startEngine() {
		System.out.println("Car Engine Started...");
	}

}
