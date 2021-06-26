package np.com.kcsajan.ioc;

public class Bike implements Engine {

	String model;

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}
	
	public Bike() {
		System.out.println("Bike constructor called.");
	}

	@Override
	public void start() {
		System.out.println("Bike started");
	}
}
