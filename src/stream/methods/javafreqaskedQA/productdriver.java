package stream.methods.javafreqaskedQA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;



public class productdriver {

	public static void main(String[] args) {
	
		List<products> prodList = new ArrayList<products>();
		prodList.add(new products(1, "Iphone", "Mobile Phone", "Mumbai", 135000.0));
		prodList.add(new products(2, "Oneplus", "Mobile Phone", "Ahmedabad", 85000.0));
		prodList.add(new products(3, "Sony", "DVD player", "Gurgaoen", 8000.0));
		prodList.add(new products(4, "Samsung", "TV", "Mumbai", 235000.0));
		prodList.add(new products(5, "Sony", "TV", "Mumbai", 185000.0));
		prodList.add(new products(6, "Oneplus", "Mobile Phone", "Delhi", 79000.0));
		prodList.add(new products(7, "Lenovo", "Laptop", "Banglore", 99000.0));
		prodList.add(new products(8, "Apple Mac Spro", "Laptop", "Ahmedabad", 299000.0));
		prodList.add(new products(9, "LG", "Refrigerators", "Kolkatta", 35000.0));
		prodList.add(new products(10, "Harrier", "Air Conditioners", "Mumbai", 55000.0));
		prodList.add(new products(11, "Sony", "Refrigerators", "Banglore", 89000.0));
		prodList.add(new products(13, "Samsung", "DVD player", "Kochi", 62000.0));
		prodList.add(new products(14, "LG", "Air Conditioners", "Gurgaoen", 75000.0));
		prodList.add(new products(15, "Oneplus", "TV", "Ahmedabad", 58000.0));
		prodList.add(new products(16, "Sony", "Mobile Phone", "Banglore", 62000.0));
		prodList.add(new products(17, "BlackBerry", "DVD player", "Delhi", 49900.0));
		prodList.add(new products(18, "Apple", "Laptop", "Gujarat", 120000.0));
		prodList.add(new products(19, "Samsung", "Air Conditioners", "Nijamabad", 53000.0));
		prodList.add(new products(20, "LG", "Laptop", "Alahabad", 80000.0));
		prodList.add(new products(21, "Oneplus", "Refrigerators", "Kochi", 82000.0));

		System.out.println(prodList);
		
		// to print data based on pdesc
		System.out.println("**Printing Data based on Product Description**");
		Map<String, List<products>> pdescList = prodList.stream().collect(Collectors.groupingBy(products::getPdesc, Collectors.toList()));
		pdescList.entrySet().forEach(entry ->{
			System.out.println(entry.getKey()+ " ----> "+entry.getValue());
		});
		
		//counting products based on pdesc
		System.out.println("**Printing product count based on Product Description**");
		Map<String, Long> pcount = prodList.stream().collect(Collectors.groupingBy(products::getPdesc, Collectors.counting()));
		pcount.entrySet().forEach(entry->{
			System.out.println(entry.getKey()+ " -----> "+entry.getValue());
		});
		
		//counting products based on ploc
		System.out.println("**Printing product count based on Product Location**");
		Map<String, Long> plloc = prodList.stream().collect(Collectors.groupingBy(products::getPloc, Collectors.counting()));
		plloc.entrySet().forEach(entry->{
			System.out.println(entry.getKey()+ " -----> "+entry.getValue());
		});
		
		// Max and Min salary from each Pdesc
		System.out.println("**Printing Max productCost from each Product Description**");
		Map<String, products> prodMaxList = prodList.stream().collect(Collectors.groupingBy(products::getPdesc, 
				Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(products::getPcost)), Optional::get)));
		prodMaxList.entrySet().forEach(entry->{
			System.out.println(entry.getKey()+ " -----> "+entry.getValue());
		});
		
		System.out.println("**Printing Min productCost from each Product Description**");
		Map<String, products> prodMinList = prodList.stream().collect(Collectors.groupingBy(products::getPdesc, 
				Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(products::getPcost)), Optional::get)));
		prodMinList.entrySet().forEach(entry->{
			System.out.println(entry.getKey()+ " -----> "+entry.getValue());
		});
		//max  sal from list
		Optional<products> p = prodList.stream().max(Comparator.comparingDouble(products::getPcost));
		System.out.println(p);
		
		//nth high salary from list
		Optional<Double> N3rdsal = prodList.stream().map(products::getPcost).sorted(Comparator.reverseOrder()).skip(2).distinct().findFirst();
		System.out.println("3rd Highest cost = "+N3rdsal.get());
		
		
		Optional<Double> N3rdlsal = prodList.stream().map(products::getPcost).sorted().skip(2).distinct().findFirst();
		System.out.println("3rd Lowest cost = "+N3rdlsal.get());
		
		
		// to print data sorted based on cost
		
		prodList.stream().map(products::getPcost).sorted().forEach(n->{
			System.out.println(n);
		});
		
		System.out.println("Sorted product List based on Cost");
		List<products> ps = prodList.stream().sorted(Comparator.comparing(products::getPcost)).collect(Collectors.toList());
		//System.out.println(ps);
		Iterator<products> it = ps.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
