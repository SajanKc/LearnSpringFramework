package np.com.kcsajan.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {

	@Autowired
	@Qualifier("itDept")
	Department dept;

	public void companyWork() {
		if (dept == null) {
			System.err.println("No Client No Work!!!");
		} else {
			dept.work();
		}
	}
}
