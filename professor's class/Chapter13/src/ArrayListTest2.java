import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Baanana");
		list.add("Mango");
		list.add("Pear");
		list.add("Grape");
		
		int index = list.indexOf("Mango");
		
		System.out.println("Mango의 위치:"+index);
	}

}
