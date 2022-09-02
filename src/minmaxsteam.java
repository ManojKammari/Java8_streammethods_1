import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class minmaxsteam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		long count = nums.stream().filter(n->n%2==0).count();
		System.out.println(count);
		Optional <Integer> min = nums.stream().min((val1,val2)->{
			return val1.compareTo(val2);
		});
		System.out.println(min.get());
		Optional <Integer> max = nums.stream().max((val1,val2)->{
			return val1.compareTo(val2);
		});
		System.out.println(max.get());
		
		List <String> stlist = Arrays.asList("A","B","C","1","2","6");
		Optional <String>reduced = stlist.stream().reduce((value,combinedvalue)->{
			return value+combinedvalue;
		});
		System.out.println(reduced.get());
		
		Object arr[] = stlist.stream().toArray();
		System.out.println(arr.length);
		for(Object v:arr) {
			System.out.println(v);
		}
	}

}
