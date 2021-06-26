package np.com.kcsajan.ioc;

public class Airplane implements Engine {
	public Airplane() {
		System.out.println("Airplane constructor called.");
	}

	@Override
	public void start() {
		System.out.println("Airplane started...");
	}
}
