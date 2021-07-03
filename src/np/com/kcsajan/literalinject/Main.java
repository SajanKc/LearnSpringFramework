package np.com.kcsajan.literalinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("Beans.xml");
		Employee emp = (Employee) context.getBean("employee");
		emp.showDetails();
	}

}
