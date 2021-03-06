package maven.demo.strm;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Sonu", 50000));
		empList.add(new Employee(102, "Monu", 60000));
		empList.add(new Employee(103, "Ponu", 45000));
		empList.add(new Employee(104, "Tonu", 55000));
		empList.add(new Employee(105, "Gonu", 65000));

		System.out.println("Iterate and print elements with forEach and lambda: ");
		empList.forEach(e -> System.out.println(e.toString()));

		System.out.println("Employees list with higher salary:");
		List<Employee> empWithHigherSal = empList.stream().filter(e -> e.getSalary() >= 60000)
				.collect(Collectors.toList());

		empWithHigherSal.forEach(e -> System.out.println(e.toString()));

		System.out.println("Employees list with higher salary:");
//		List<Employee> empWithHigherSal = empList.stream().filter(e -> e.getSalary() >= 60000)
//				.collect(Collectors.toList());
//		empWithHigherSal.forEach(e -> System.out.println(e.toString()));

		empList.stream().filter(e -> e.getSalary() >= 60000).collect(Collectors.toList())
				.forEach(e -> System.out.println(e.toString()));

		System.out.println("Employees list of first 3 employees: ");
		empList.stream().limit(3).collect(Collectors.toList()).forEach(e -> System.out.println(e.toString()));

		System.out.println("Employees list of last 3 employees: ");
		empList.stream().skip(2).collect(Collectors.toList()).forEach(e -> System.out.println(e.toString()));

		System.out.println("Employees list of 2nd, 3 rd employees: ");
		empList.stream().skip(1).limit(2).collect(Collectors.toList()).forEach(e -> System.out.println(e.toString()));
//		List<String> empUpper = empList.stream().map(e -> e.getFirstName().toUpperCase()));
		System.out.println("\nUsing map() to change case");
		List<Employee> nameInUpperCase = empList.stream().map(emp2 -> emp2 = null).collect((Collectors.toList()));

		System.out.println(nameInUpperCase);

		System.out.println("\nUsing map() to change case");
//		List<String> nameInUpperCase2 = empList.stream().map(emp -> emp.getFirstName().toUpperCase())
//				.collect((Collectors.toList()));

		List<String> nameInUpperCase2 = empList.stream().map(emp -> {
			return emp.getFirstName().toUpperCase();
		}).collect((Collectors.toList()));

		nameInUpperCase2.forEach(emp -> System.out.println(emp.toString()));

		System.out.println("\nUsing map() to change emp data");
		List<Employee> updatedEmps = empList.stream().map((e) -> {
			e.setFirstName(e.getFirstName().toUpperCase());
			e.setSalary(e.getSalary() * 2);
			return e;
		}).collect((Collectors.toList()));

		updatedEmps.forEach(e -> System.out.println(e.toString()));

//		List<Employee> updatedEmps = empList.stream().map((e) -> {
//			e.setFirstName(e.getFirstName().toUpperCase());
//			e.setSalary(e.getSalary() * 2);
//		}).collect((Collectors.toList()));

	}
}
