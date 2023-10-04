package SC;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Menudriv_66 {

	static public void Menu(){
		int a,b;

		 
//		 String option.equals
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hi Saar..,Tell me your a pilij:-");
		a= sc.nextInt();
		System.out.println("And b pilij:-");
		b= sc.nextInt();
		
		
		System.out.println("Enter your operation you want to carry out from the below.."
				+ "\n===MENU==="
				+ "\nADD"
				+ "\nSUB"
				+ "\nMUL"
				+ "\nDIV"
				+ "\n-------------------"
				+ "\nDon't worry about the case sensitivity..");
		sc.nextLine();   /*the code which Bari sir talked about ...  */ 

		String option = sc.nextLine();
		option=option.toLowerCase();      //to ensure the case sensitivity..

		try {
		
		switch(option)
		{
//		below is my approach..
		case "add": System.out.println("Result of addition is "+(a+b));
		break;
		case "sub": System.out.println("Result of subtraction is "+(a-b));
		break;
		case "mul": System.out.println("Result of mult is "+(a*b));
		break;
		case "div": System.out.println("Result of div is "+(a/b));
		break;
		default: System.out.println("Invalid IP");
		
//		Below is Bari Sir's approach
		
		
		}
	
	}
		catch (Exception e)
			{
				e.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		
		Menu();
	}
}
