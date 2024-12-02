package pdf.emp;

public abstract class Employee {
	abstract void setSalary(int salary);
	abstract int getSalary();
	abstract void setGrades(String grade);//grade of the employee in the organization
	abstract String getGrade();
	void label() {
		System.out.println("Employee's data:\n");
	}//prints employee data:\n

}
class Engineer extends Employee{
	private int salary;
	private String grade;
	@Override
	void setSalary(int salary) {
		// TODO Auto-generated method stub
		this.salary=salary;
	}
	@Override
	int getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}
	@Override
	void setGrades(String grade) {
		// TODO Auto-generated method stub
		this.grade=grade;
	}
	@Override
	String getGrade() {
		// TODO Auto-generated method stub
		return grade;
	}
	
	
}
class Manager extends Employee{
	private int salary;
	private String grade;
	@Override
	void setSalary(int salary) {
		// TODO Auto-generated method stub
		this.salary=salary;
	}
	@Override
	int getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}
	@Override
	void setGrades(String grade) {
		// TODO Auto-generated method stub
		this.grade=grade;
	}
	@Override
	String getGrade() {
		// TODO Auto-generated method stub
		return grade;
	}
	
}

