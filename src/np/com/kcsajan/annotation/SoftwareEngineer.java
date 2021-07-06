package np.com.kcsajan.annotation;

import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer implements ComputerEngineer{

	public void development() {
		System.out.println("Developing Software...");
	}
}
