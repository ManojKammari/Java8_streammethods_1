package stream.methods.javafreqaskedQA;


// Mega Concept using Java Streams
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import java.util.stream.Collectors;

public class Empdriverclass {

	public static void main(String[] args) {
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(1, "Ramesh", 22, "TechnicalDept", 55000.00, "active"));
		emplist.add(new Employee(2, "Rajashri", 24, "ManagerialDept", 45000.00, "in-active"));
		emplist.add(new Employee(3, "Sanjana", 60, "TechnicalDept", 155000.00, "active"));
		emplist.add(new Employee(4, "Archana", 23, "TechnicalDept", 38000.00, "active"));
		emplist.add(new Employee(5, "Balakrishna", 22, "ManagerialDept", 77000.00, "in-active"));
		emplist.add(new Employee(6, "Chandramukhi", 24, "HumanResourceDept", 55000.00, "active"));
		emplist.add(new Employee(7, "Rajkiran", 24, "TechnicalDept", 94000.00, "active"));
		emplist.add(new Employee(8, "Jaanu", 19, "ManagerialDept", 68000.00, "in-active"));
		emplist.add(new Employee(9, "Surkatti", 22, "HumanResourceDept", 85000.00, "in-active"));
		emplist.add(new Employee(10, "Reemasen", 18, "ManagerialDept", 67000.00, "active"));
		emplist.add(new Employee(11, "Sushnmitasen", 23, "HumanResourceDept", 33000.00, "in-active"));

		// System.out.println(emplist);

		// to print emplist based on edept
		Map<String, List<Employee>> empdeptlist = emplist.stream()
				.collect(Collectors.groupingBy(Employee::getEdept, Collectors.toList()));
		empdeptlist.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " ---> " + entry.getValue());
		});

		// to print emplist based on age
		Map<Integer, List<Employee>> empagelist = emplist.stream()
				.collect(Collectors.groupingBy(Employee::getEage, Collectors.toList()));
		empagelist.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " ---> " + entry.getValue());
		});

		// counting emp based on dept
		Map<String, Long> empcount = emplist.stream()
				.collect(Collectors.groupingBy(Employee::getEdept, Collectors.counting()));
		empcount.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " ---> " + entry.getValue());
		});

		// Active and inactive status of employees
		List<Employee> empactive = emplist.stream().filter(e -> e.getStatus() == "active").collect(Collectors.toList());
		System.out.println(empactive);
		List<Employee> empinactive = emplist.stream().filter(e -> e.getStatus() == "in-active")
				.collect(Collectors.toList());
		System.out.println(empinactive);

		// Activeemp count
		Long eactivecount = emplist.stream().filter(e -> "active".equals(e.getStatus())).count();
		System.out.println(eactivecount);

		// Max and Min sal from each dept
		Optional<Employee> empmaxsal = emplist.stream().max(Comparator.comparing(Employee::getEsal));
		System.out.println(empmaxsal);
		Optional<Employee> empminsal = emplist.stream().min(Comparator.comparing(Employee::getEsal));
		System.out.println(empminsal);

		// Max and Min sal from each department

		// Map<String, Employee1> empes1 =
		// emps.stream().collect(Collectors.groupingBy(e->e.getDept(),
		// Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(e->e.getSal())),Optional::get)));
		Map<String, Employee> byDepartment = emplist.stream()
				.collect(Collectors.groupingBy(e -> e.getEdept(), Collectors.collectingAndThen(
						Collectors.maxBy(Comparator.comparingDouble(e -> e.getEsal())), Optional::get)));
		byDepartment.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " ---> " + entry.getValue());
		});
		// to print nth highest sal
		Optional<Double> nsal = emplist.stream().map(e -> e.getEsal()).sorted(Comparator.reverseOrder()).skip(1)
				.distinct().findFirst();
		System.out.println(nsal.get());
		//to average age
		Map<String, Double>ageavg = emplist.stream().collect(Collectors.groupingBy(Employee::getEdept,Collectors.averagingInt(Employee::getEage)));
		ageavg.entrySet().forEach(entry->{
			System.out.println(entry.getKey()+" --> "+entry.getValue());
	});
		
	}
}
