package CollectionsPractice;

public class Employee implements Comparable<Employee>{
	String name;
	int salary;
	String department;
	
	public Employee(String name, int salary, String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	// reverse the operator it will reverse the sorting order
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.salary > o.salary) {
			return +1;
		}else if(this.salary < o.salary) {
			return -1;
		}else {
			return 0;
		}
		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	
	
	

}
