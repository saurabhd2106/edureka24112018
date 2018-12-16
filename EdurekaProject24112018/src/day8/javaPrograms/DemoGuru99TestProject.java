package day8.javaPrograms;

public class DemoGuru99TestProject {

	public static void main(String[] args) {
		Guru99TestProject guru = new Guru99TestProject();

		try {
			guru.invokeBrowser("safari");

			guru.login();

			guru.addUser();

			guru.addAccount();

			guru.logout();
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Arrauy Index Exception occured");
		}  catch (Exception e) {

			e.printStackTrace();
		}  
		
		finally {
			guru.closeBrowser();
		}

	}

}
