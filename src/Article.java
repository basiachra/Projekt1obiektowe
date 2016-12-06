import java.io.*;
import java.util.Scanner;


public class Article{
	
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
			
			while(!line.equals("Art. 243."))
			{		
				if(line.equals("Art. " + x + "."))
				{
					while(!line.equals("Art. " + (y+1) + "."))
					{
						if(unnecessaryelemetnt())
							System.out.println(line);
						line = in.nextLine();
					}	
				}
				line = in.nextLine();
			}
		} catch(IOException exc){ System.out.println("B³¹d: " + exc); }
	}
	
	
	public boolean unnecessaryelemetnt()
	{
		if(line.equals("©Kancelaria Sejmu") || line.equals("2009-11-16"))		
			return false;
		
		
		
		
		
		return true;
		
		
	}
	
	public void join()
	{
		//laczenie wyrazow w calosc
		
	}
	
	
}
