package day8.javaPrograms;

public class ExceptionHandling {

	public static void main(String[] args) {

		int[] arr = new int[5];

		try {
			arr[0] = 8;
			arr[1] = 12;
			arr[2] = 81;
			arr[3] = 18;
			arr[4] = 67;

			for (int i = 0; i < 5; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Array exception occured");
		} catch (IndexOutOfBoundsException e) {

			System.out.println("Index exception occured");
		} catch (Exception e) {

			System.out.println("ESxception occured");
		} finally {
			System.out.println("I run always");
		}
		System.out.println("I am executing after the exception");
	}

}
