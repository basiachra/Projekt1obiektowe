

import java.io.*;
import java.util.Scanner;


public class Chapter {
	
	public static String line;
	public String path;
		
		
	public static void readchapter(String x, String y, String path) 
	{			
		try (Scanner in = new Scanner(new File(path)))
		{
			line = in.nextLine();					
			while(in.hasNextLine())
			{		
				if(line.equals("Rozdzia³ " + x))
				{
					while(!line.equals("Rozdzia³ " + y))
					{									
						if(Parser.chapunnecessaryelemetnt(line))
						{
							if(!line.endsWith("-")) { System.out.println(line); }
							else Parser.join(in, line);
						}
						line = in.nextLine();
					}
				}
				line = in.nextLine();
			}
		} catch(IOException exc){ System.out.println("B³¹d: " + exc); }
	}
			

	
}
