package day2;

public class GreatestOutOfThreeNumbers {

	public static void main(String[] args) {
		int firstNum, secondNum, thirdNum;

		firstNum = 90;
		secondNum = 99;
		thirdNum = 99;

		if (firstNum > secondNum && firstNum > thirdNum) {
			System.out.println("First Number is greatest");
		} else if (secondNum > firstNum && secondNum > thirdNum) {
			System.out.println("Second Number is greatest");
		} else if (thirdNum > secondNum && thirdNum > firstNum) {
			System.out.println("Third Number is greatest");
		} else if (firstNum == secondNum && thirdNum < firstNum) {
			System.out.println("First and second are greatest");
		} else if (firstNum == thirdNum && firstNum > secondNum) {
			System.out.println("First and third are greatest");
		} else if (secondNum == thirdNum && firstNum < secondNum) {
			System.out.println("Third and second are greatest");
		} else {
			System.out.println("All three are equal");
		}

	}

}
