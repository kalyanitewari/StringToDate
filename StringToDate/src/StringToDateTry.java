import java.util.Scanner;

public class StringToDateTry {
	
	static String stringDate= "";
	
	 static void stringToDate(String date) {
		 int dateInt= 0;
		 
	        for (int i = 0; i < date.length(); i++) {
	            if (date.charAt(i) != '/') {
	                dateInt = dateInt * 10 + (date.charAt(i) - '0'); //implicit conversion of ascii values of the integer character
	            }
	        }
	        
		System.out.println("Converted Date :");
		
		 System.out.println(dateInt);
	 }
	
	public static void main(String args[])
			{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter date in dd/mm/yyyy format : ");
		stringDate= sc.nextLine();
		
		System.out.println("String Date : ");
		System.out.println(stringDate);
		
		stringToDate(stringDate);	
}
}
