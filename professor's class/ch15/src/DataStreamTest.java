import java.io.*;

 

public class DataStreamTest {

 

 public static void main(String[] args) {

 // try-with-resources 사용으로 자동 자원 관리

 try (

 DataOutputStream out = new DataOutputStream(new FileOutputStream("data.bin"));

 DataInputStream in = new DataInputStream(new FileInputStream("data.bin"))

 ) {

 out.writeInt(123);

 out.writeFloat(123.456F);

 

 // 데이터 읽기

 int aint = in.readInt();

 float afloat = in.readFloat();

 

 System.out.println(aint);

 System.out.println(afloat);

 } catch (IOException e) {

 e.printStackTrace();

 }

 }

}