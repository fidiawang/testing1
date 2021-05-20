//Program to display menu and ask for input

import javax.swing.JOptionPane;

public class learn1 {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Name gapo demo?");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "You are "+age+" years old");
		
		double height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");
	}

}
