import java.util.*;
class Reverse
{
	public static void main(String args[])
	{
	  System.out.println("Enter String:");
	  Scanner s =new Scanner(System.in);
	  String str=s.next();
	  StringBuilder st=new StringBuilder(str);
	  System.out.print("Reverse of given string : "+st.reverse());
	}
}