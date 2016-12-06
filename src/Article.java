import java.io.*;
import java.util.Scanner;


public class Article {
	
	public String line;
	public String path;
	
	public Article(String file_path){
		path = file_path;
	}
	
	public void readarticle(int x, int y)
	{	
		try (Scanner in = new Scanner(new File(path)))
		{
			line = in.nextLine();					
			
			while(!line.equals("dnia jej og³oszenia."))
			{		
				if(line.equals("Art. " + x + "."))
				{
					while(!line.equals("Art. " + (y+1) + "."))
					{
						if(artunnecessaryelemetnt())
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
	
	
	public boolean artunnecessaryelemetnt()
	{
		if(line.equals("©Kancelaria Sejmu") || line.equals("2009-11-16"))		
			return false;	
		if(line.equals(line.toUpperCase()))
			return false;	
		if(line.startsWith("Rozdzia³"))
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
