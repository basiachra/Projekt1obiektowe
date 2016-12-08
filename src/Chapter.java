

import java.io.*;
import java.util.Scanner;


public class Chapter {
	
	public String line;
	public String path;
		
	public Chapter(String file_path){
		path = file_path;
	}		
		
	public void readchapter(String x) throws IOException
	{			
		try (Scanner in = new Scanner(new File(path)))
		{
			String y = "XI";
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
