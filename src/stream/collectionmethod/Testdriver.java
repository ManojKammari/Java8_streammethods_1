package stream.collectionmethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Testdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("ABC",30,"Female","HR"));
		employees.add(new Employee("PQR",25,"Male","IT"));
		employees.add(new Employee("LMN",30,"Male","HR"));
		employees.add(new Employee("XYZ",28,"Female","IT"));
		
		//employees.stream().filter(n->n.getDepartment()).distinct().forEach(System.out::println);
		employees.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		//Map<String,Long> empcount = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		//System.out.println(empcount);
		
		Map<String, Double> avgage = employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
				System.out.println(avgage);
				
				Map<Integer, List<Employee>> avgages =  employees.stream().collect(Collectors.groupingBy(Employee::getAge));
				System.out.println(avgages);
	
	
	
	
	}
		
}
