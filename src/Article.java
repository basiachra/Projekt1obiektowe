
import java.io.*;
import java.util.Scanner;
//import Parser.class

public class Article  {
	
	
	public static String line;
	public String path;
	public int x;
	public int y;
	
	
	public static void readarticle(int x, int y, String path) throws IOException
	{	
		try (Scanner in = new Scanner(new File(path)))
		{
			line = in.nextLine();			
			while(in.hasNextLine())
			{		
				if(line.equals("Art. " + x + "."))
				{
					while(!line.equals("Art. " + (y+1) + "."))
					{
						if(Parser.artunnecessaryelemetnt(line))
						{
							if(!line.endsWith("-")) { System.out.println(line); }
							else Parser.join(in, line);
						}
						line = in.nextLine();									
					}	
				}
				line = in.nextLine();
			}
		} catch(IOException exc){ System.out.println("B��d: " + exc); }
	}
	
	

	

}
