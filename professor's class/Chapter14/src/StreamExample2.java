import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("Java", "Stream","Library");
		System.out.println("입력데이터 ="+words);
		List<Integer> result = words.stream()
		.map(String::length)
		.collect(Collectors.toList());
	System.out.println("실행결화 ="+result);
	}

}
