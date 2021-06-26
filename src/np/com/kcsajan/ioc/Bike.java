package np.com.kcsajan.ioc;

public class Bike {

	Engine engine;

	public Bike(Engine engine) {
		this.engine = engine;
		System.out.println("I'm Bike Engine Constructor.");
	}

	public void startEngine() {
		System.out.println("Bike Engine Started...");
	}
}
