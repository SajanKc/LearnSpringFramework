package np.com.kcsajan.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "np.com.kcsajan" })
public class ConfigClass {

//	@Bean
//	public SoftwareEngineer softwareEngineer() {
//		return new SoftwareEngineer();
//	}

//	@Bean
//	public Company company() {
//		Company company = new Company();
//		company.setSoftwareEngineer(softwareEngineer());
//		return company;
//	}

//	@Bean
//	public Company company() {
//		return new Company(softwareEngineer());
//	}
}
