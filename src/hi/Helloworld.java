package hi;

import java.util.Scanner;

public class Helloworld {
public static void main(String[] args) {
	Scanner Sc= new Scanner (System.in); 
	
	System.out.println("Hello world");
	System.out.println("Enter your username");
	String UserName= Sc.nextLine(); 
	if ( UserName== "Param"){
		System.out.println("enter your password");
		String pw= Sc.nextLine();
	Password (pw); 
	} else {
		System.out.println("your password don't match");
	}
	
}
	public static void Password(String password){
	
		if ( password.length()>6){
		System.out.println("your password matches. ");
	}
}
	}
