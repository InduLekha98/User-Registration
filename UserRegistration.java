import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	static Scanner sc = new Scanner(System.in);
	public static void validation(String firstName,String lastName) {
		// First Name and Last Name comes with restriction such as first letter should be upper case and with minimum 3 characters
		System.out.println("First Name: " + Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", firstName));
		System.out.println("Last Name: " + Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", lastName));
	}
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Program");
		System.out.println("Enter a valid first name");
		String firstName = sc.nextLine();
		System.out.println("Enter a valid last name");
		String lastName = sc.nextLine();
		validation(firstName, lastName);
	}
}
