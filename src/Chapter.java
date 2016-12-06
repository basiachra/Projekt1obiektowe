import java.io.*;
import java.util.Scanner;

public class Chapter {
	
		public String line;
		public String path;
		
		public Chapter(String file_path){
			path = file_path;
		}		
		
		public void readchapter(String x, String y)
		{			
		try (Scanner in = new Scanner(new File(path)))
		{
			line = in.nextLine();				
				
			while(!line.equals(null))
			{		
				if(line.equals("Rozdzia³ " + x))
				{
					while(!line.equals("Rozdzia³ " + y))
					{			
						
						if(chapunnecessaryelemetnt())
						{
							if(!line.endsWith("-")) { System.out.println(line); }
							else join(in);
						}
						line = in.nextLine();
					}
				}
				line = in.nextLine();
			}
		} catch(IOException exc){ System.out.println("B³¹d: " + exc); }
	}
			
	
	public boolean chapunnecessaryelemetnt()
	{
		if(line.equals("©Kancelaria Sejmu") || line.equals("2009-11-16"))		
			return false;			
		return true;		
	}

	
	
	public void join(Scanner in)
	{			
		line = line.substring(0, line.length() - 1) + in.nextLine();
		if(line.endsWith("-"))
		{
			join(in);
		}		
		else
		System.out.println(line);
		
	}
	
}
