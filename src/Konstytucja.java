package konstytucja;


import java.io.IOException;
import java.util.Scanner;

public class Konstytucja {

		

	public static void main(String[] args) throws IOException
	{
		try{ 
			System.out.println("Podaj �cie�k� do pliku: ");
			Scanner czytaj = new Scanner(System.in);
			String path_file;
			path_file=czytaj.nextLine();	
			
			System.out.println("W zale�no�ci co chcesz wy�wietli� wpisz 'a' albo 'c': ");
			String id;
			id = czytaj.nextLine();	
			
			if(id.equals("a"))
			{
				System.out.println("Podaj przedzia� artyku��w:");
				int from = czytaj.nextInt();
				int to = czytaj.nextInt();				
				ArgumentParser.article(from, to, path_file);
			}
			else if(id.equals("c"))
			{
				System.out.println("Podaj numer rozdzia�u:");
				String  chapterarg;
				chapterarg = czytaj.next();
				ArgumentParser.chapter(chapterarg, path_file);
			}
			else throw new IllegalArgumentException("Podano z�y atrybut");
		
			czytaj.close();
		
		
		}
		
		catch (IOException e)
		{  			
			System.out.println(e.getMessage());
		}    
		catch(IllegalArgumentException ex)
        {
        	System.out.println(ex.getMessage());
        }
			
		
	}	
}
