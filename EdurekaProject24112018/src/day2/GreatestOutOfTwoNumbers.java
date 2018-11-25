package day2;

public class GreatestOutOfTwoNumbers {

	public static void main(String[] args) {
		int firstNumber, secondNumber;

		firstNumber = 99;
		secondNumber = 99;

		if (firstNumber > secondNumber) {
			System.out.println("First number is greatest");
		}
		if (secondNumber > firstNumber) {
			System.out.println("Second number is greatest");
		} else {
			System.out.println("Both are equal");
		}

	}

}
