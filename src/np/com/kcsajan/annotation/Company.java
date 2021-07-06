package np.com.kcsajan.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {

	@Value("XYZ Company")
	String companyName;

	@Autowired
	@Qualifier("softwareEngineer")
	ComputerEngineer computerEngineer;

//	Using Constructor Injection
//	@Autowired
//	public Company(SoftwareEngineer softwareEngineer) {
//		this.softwareEngineer = softwareEngineer;
//		System.out.println("I'm constructor...");
//	}

//	Using Setter Injection
//	@Autowired
//	public void setSoftwareEngineer(SoftwareEngineer softwareEngineer) {
//		this.softwareEngineer = softwareEngineer;
//		System.out.println("I'm setter.");
//	}

	public void showInfo() {
		System.out.println("Hello From Company : " + companyName);
	}
}
