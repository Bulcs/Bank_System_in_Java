package createaccount;

public class CreateAccount {
		protected String first_name;
		protected String second_name;
		protected String cpf;
		protected int age;
		protected int day;
		protected int month;
		protected int year;
		protected int pass;
		protected String card_number;
		
	public CreateAccount(String first_name, String second_name, String cpf, int age,int day,int month, int year, int pass, String card_number) {
		this.first_name = first_name;
		this.second_name = second_name;
		this.cpf = cpf;
		this.age = age;
		this.day = day;
		this.month = month;
		this.year = year;
		this.pass = pass;
		this.card_number = card_number;
	}
}
