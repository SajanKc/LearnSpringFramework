package np.com.kcsajan.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Keys {
	public void run(Engine key) {
		key.start();
	}
}

// Inversion of control
public class Main {

	public static void main(String[] args) {

//		Inversion of control
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		Engine key = (Engine) applicationContext.getBean("engine");
		new Keys().run(key);

//		Dependency Injection --> setter method
		Bike bike = (Bike) applicationContext.getBean("bike");
		System.out.println(bike.getModel());

//		Dependency Injection --> constructor method
		Car car = (Car) applicationContext.getBean("car");
		System.out.println(car.color);
	}

}
