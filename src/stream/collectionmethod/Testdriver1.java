package stream.collectionmethod;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Testdriver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Employee1> emps = new ArrayList<Employee1>();
		emps.add(new Employee1("emp1","CS",10000));
		emps.add(new Employee1("emp2","IT",15000));
		emps.add(new Employee1("emp3","CS",20000));
		emps.add(new Employee1("emp4","IT",25000));
		
		emps.stream().map(Employee1::getDept).distinct().forEach(System.out::println);
		Map<String, List<Employee1>> empdes = emps.stream().collect(Collectors.groupingBy(e->e.getDept()));
		System.out.println(empdes);
		
		Map<String, Employee1> empes1 = emps.stream().collect(Collectors.groupingBy(e->e.getDept(),
				Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(e->e.getSal())),Optional::get)));
			System.out.println(empes1);
	}
	

}
