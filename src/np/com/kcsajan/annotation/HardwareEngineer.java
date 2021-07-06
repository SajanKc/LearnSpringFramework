package np.com.kcsajan.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HardwareEngineer implements ComputerEngineer {

	public void development() {
		System.out.println("Developing Hardware...");
	}
}
