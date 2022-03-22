package maven.demo.cmpr;
import java.util.*;

class EmpEidComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEid() - o2.getEid();
	}

}

class EmpSalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return Double.compare(o1.getSalary(), o2.getSalary());
	}

}

class EmpFirstNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getFirstName().compareTo(o2.getFirstName());
	}

}
