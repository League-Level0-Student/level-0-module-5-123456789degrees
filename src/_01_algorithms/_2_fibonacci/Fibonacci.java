package _01_algorithms._2_fibonacci;

public class Fibonacci {
	public static void main(String[] args) {
		int first = 1;
		int second = 1;
		int sum = 2;
		System.out.println(first);
		System.out.println(second);
		for (int i = 0; i < 10; i++) {
			sum = first + second;
			System.out.println(sum);
			first = second;
			second = sum;
		}
	}
}
