package konstytucja;

import java.util.Scanner;

public class Parser {
	
	public String line;
	public Scanner in;
	

	public static void join(Scanner in, String line)
	{			
		line = line.substring(0, line.length() - 1) + in.nextLine();
		if(line.endsWith("-"))
		{
			join(in, line);
		}		
		else
		System.out.println(line);
		
	}
	
	public static boolean chapunnecessaryelemetnt(String line) 
	{
		if(line.equals("©Kancelaria Sejmu") || line.equals("2009-11-16"))		
			return false;			
		return true;		
	}
	
	
	public static boolean artunnecessaryelemetnt(String line)
	{
		if(line.equals("©Kancelaria Sejmu") || line.equals("2009-11-16"))		
			return false;	
		if(line.equals(line.toUpperCase()))
			return false;	
		if(line.startsWith("Rozdzia³"))
			return false;
		return true;		
	}
}
