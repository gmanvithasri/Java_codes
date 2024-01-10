import java.io.*;
import java.util.Scanner;
public class Main 
{
	public static void main (String[] args) {
	
		String str= "Java", nstr="";
		char ch;
	
	System.out.print("Original word: ");
	System.out.println("Java");
	
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i);
		nstr= ch+nstr;
	}
	System.out.println("Reversed word: "+ nstr);
	}
}
