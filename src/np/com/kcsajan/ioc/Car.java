package np.com.kcsajan.ioc;

public class Car implements Engine {
	String color;

	public Car(String color) {
		System.out.println("Car constructor called.");
		this.color = color;
	}

	@Override
	public void start() {
		System.out.println("Car started");
	}
}
