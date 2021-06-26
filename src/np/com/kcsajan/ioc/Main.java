package np.com.kcsajan.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		Bike bike = (Bike) applicationContext.getBean("bike");
		bike.startEngine();

		Car car = (Car) applicationContext.getBean("car");
		car.startEngine();
	}

}
