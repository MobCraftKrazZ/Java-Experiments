import java.io.Console;

public class javaThing {
  
	public static void main(String[] args) {
  Console thisisstupidaf = System.console();
	String person = thisisstupidaf.readLine("What is your name?\n");
	thisisstupidaf.printf("Hi, %s! I'm jtBot.\n", person);
  String username = thisisstupidaf.readLine("To get started, create a username:\n");
  String password = thisisstupidaf.readLine("Now create a password.\n");
  thisisstupidaf.printf("Your username is %s and your password is %s.\n", username, password);
} }
