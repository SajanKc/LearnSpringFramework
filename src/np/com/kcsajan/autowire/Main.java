package np.com.kcsajan.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {

		applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		Company company = (Company) applicationContext.getBean("company");
		company.companyWork();

	}

}
