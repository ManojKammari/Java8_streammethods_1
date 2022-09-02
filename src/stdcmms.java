import java.util.Arrays;
import java.util.List;

public class stdcmms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> vehicles1 = Arrays.asList("bus","car","bike","car","flight","bus","train");
		/*vehicles1.stream().distinct().forEach(System.out::println);
		Long Count = vehicles1.stream().distinct().count();
		System.out.println(Count);
		vehicles1.stream().distinct().skip(2).forEach(System.out::println);*/
		vehicles1.stream().distinct().limit(4).forEach(System.out::println);
	}

}
