package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	private String dept;
	private int salary;

	private List<Employee> subOrdinateList;

	public Employee(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subOrdinateList = new ArrayList<Employee>();
	}

	public void add(Employee e) {
		subOrdinateList.add(e);
	}

	public void remove(Employee e) {
		subOrdinateList.remove(e);
	}

	public List<Employee> getSubOrdinateList() {
		return subOrdinateList;
	}

	@Override
	public String toString() {
		String show = "Employee : Name : " + name + " Dept : " + dept + " Salary : " + salary;
		return show;
	}

}
