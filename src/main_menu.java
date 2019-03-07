import java.util.Scanner;

import createaccount.CreateAccount;

public class main_menu {

	private static Scanner s;

	public static void main(String[] args) {
		int cont;
		System.out.println("Welcome to a Bank Simulator in Java");
		System.out.println("Note: this is just a little thing that I create.");
		System.out.println("Version: 1.0");
		System.out.println("--------------------------------------------------");
		System.out.println("1 - Access your account\n2 - Create an account\n3 - Delete an account");
		
		s = new Scanner(System.in);
		cont = s.nextInt();
	}

}
