import java.util.*;
class Occurance
{
	public static void main(String args[])
	{
	  Scanner s =new Scanner(System.in);
	  System.out.println("Enter first String:");
	  String str1=s.nextLine();
	   System.out.println("Enter second String:");
	  String str2=s.nextLine();
	  if(str1.contains(str2))
	  {
		  System.out.print(str1 +" is present in "+str2);
	  }
	  else
		  System.out.print(str1 +" is not present in "+str2);
		  
	}
}