package week2.day4;

public class LoginTestData extends TestData {

	public void enterUsername() {
		
		System.out.println("username");
		
	}
	
	public void enterPassword() {
		
		System.out.println("password");
		
	}
	
	public static void main(String[] args) {
		
		
		LoginTestData a= new LoginTestData();
		
		a.enterCredentials();
		a.navigateToHomePage();
		a.enterUsername();
		a.enterPassword();

	}

}

