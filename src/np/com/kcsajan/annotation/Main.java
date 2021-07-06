package np.com.kcsajan.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(ConfigClass.class);
		Company company = (Company) context.getBean("company");
		company.showInfo();

		company.computerEngineer.development();
	}

}
