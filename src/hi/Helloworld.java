package hi;

public class Helloworld {
public static void main(String[] args) {
	Scanner Sc= new Scanner (System.in); 
	
	System.out.println("Hello world");
	System.out.println("Enter your username");
	String UserName= Sc.nextLine(); 
	if ( UserName= "Param"){
	Password (); 
	}
	
}
	public static void Password(){
	System.out.println("Please enter your password");
		String Password = Sc.nextLine(); 
		if ( password.length()>6){
		System.out.println("your password matches. ")}
	}
}
