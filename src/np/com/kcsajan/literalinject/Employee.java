package np.com.kcsajan.literalinject;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	@Value("${employee.id}")
	private int empId;

	@Value("${employee.name}")
	private String empName;

	@Value("${employee.skills}")
	private String empOtherSkills;

	/*
	 * @Value("${employee.id}") public void setEmpId(int empId) { this.empId =
	 * empId; }
	 * 
	 * @Value("${employee.name}") public void setEmpName(String empName) {
	 * this.empName = empName; }
	 * 
	 * @Value("${employee.skills}") public void setEmpOtherSkills(String
	 * empOtherSkills) { this.empOtherSkills = empOtherSkills; }
	 */

	public void showDetails() {
		System.out.println("Employee Id is : " + empId);
		System.out.println("Employee Name is : " + empName);
		System.out.println("Employee other skills are : " + empOtherSkills);
	}
}
