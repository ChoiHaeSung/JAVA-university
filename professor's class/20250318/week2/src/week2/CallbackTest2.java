package week2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
public class CallbackTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("beep");
			}
		};
		Timer t = new Timer(1000, listener);
		t.start();
		for(int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {	}
		}
	}
}
