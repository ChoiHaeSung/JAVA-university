import java.nio.file.*;

public class PathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path = Paths.get("src/input.txt");
		System.out.println("전체 경로: " + path);
		System.out.println("파일 이름: " + path.getFileName());
		System.out.println("부모 이름: " + path.getParent().getFileName());
	}

}
