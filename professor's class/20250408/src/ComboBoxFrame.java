import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxFrame extends JFrame implements ActionListener {
	JLabel label;
	
	public ComboBoxFrame() {
		setTitle("콤보 박스");
		setSize(400,200);
		
		String[] animals = { "dog", "cat", "bird"};
		JComboBox animalList = new JComboBox(animals);
		animalList.setSelectedIndex(0);
		animalList.addActionListener(this);
		
		label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		changePicture(animals[animalList.getSelectedIndex()]);
		add(animalList, BorderLayout.NORTH);
		add(label, BorderLayout.CENTER);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		JComboBox cb =(JComboBox) e.getSource();
		String name = (String) cb.getSelectedItem();
		changePicture(name);
	}
	protected void changePicture(String name) {
		
		ImageIcon icon = new ImageIcon(name + ".png");
		label.setIcon(icon);
		if (icon != null) {
		} else {
		label.setText("이미지가 발견되지 않았습니다.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComboBoxFrame frame=new ComboBoxFrame();
	}
}
