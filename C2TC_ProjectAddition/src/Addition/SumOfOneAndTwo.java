package Addition;

import java.util.Scanner;

public class SumOfOneAndTwo {
public static void main(String[]args) {
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number 1");
	int num1 = s.nextInt();
	System.out.println("Enter a number 2");
	int num2 = s.nextInt();
	int result = num1+num2;
	System.out.println(result);
}
}