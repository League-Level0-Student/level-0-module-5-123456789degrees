package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] Args) {
		String s = JOptionPane.showInputDialog("Enter a number: ");
		int num = Integer.parseInt(s);
		for (int i = 2; i <= num/2; i++) {
			if (num <= 1) {
				JOptionPane.showMessageDialog(null, num + " is not a prime number.");
				return;
			}
			else if (num % i == 0) {
				JOptionPane.showMessageDialog(null, num + " is not a prime number.");
				return;
			}
			JOptionPane.showMessageDialog(null, num + " is a prime number.");
		}
	}
}
