import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestFieldFrame extends JFrame{
	private JButton button;
	private JTextField text, result;
	
	public TestFieldFrame() {
		setSize(300, 150);
		setTitle("제곱 계산하기");
		ButtonListener listener = new ButtonListener();
		
		JPanel panel = new JPanel();
		panel.add(new JLabel("숫자 입력: "));
		text = new JTextField(15);
		text.addActionListener(listener);
		panel.add(text);

		panel.add(new JLabel("제곱한 값: "));
		result= new JTextField(15);
		result.setEditable(false);
		panel.add(result);
		
		button = new JButton("OK");
		button.addActionListener(listener);
		panel.add(button);
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button || e.getSource() == text) {
			String name = text.getText();
				int value = Integer.parseInt(name);
				result.setText(" " + value * value);
				text.requestFocus();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestFieldFrame();
	}
}
