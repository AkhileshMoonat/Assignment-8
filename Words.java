import java.util.*;
class Words
{
	public static void main(String args[])
	{
	  Scanner s =new Scanner(System.in);
	  System.out.println("Enter Sentence:");
	  String str1=s.nextLine();
	  String[] str=str1.split("\\s+");
	  System.out.print("Number of words in string are : "+str.length);
	}
}