package stringExamples;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
	/*Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();*/
	int i=0;
	String str="India     Is My    Country";
	
	char arr[]=str.toCharArray();
	StringBuffer newString=new StringBuffer();
	
	for(i=0;i<arr.length;i++)
	{
		if((arr[i]!=' ')&&(arr[i]!='\t'))
		{
				newString.append(arr[i]);}
	}
	
	String noSpace=newString.toString();
	System.out.println(noSpace);

	}	
}
