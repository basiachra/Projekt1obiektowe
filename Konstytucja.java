

import java.io.IOException;

public class Konstytucja {

		
	public static void main(String[] args) throws IOException
	{
		// System.out.println("Podaj œcie¿kê do pliku, 'a' lub 'r' w zale¿noœci co chcesz wyœwietliæ oraz przedzia³: ");
		 
		//ArgumentParser arguments = new ArgumentParser();
		
		
		/* 
		Chapter wyswietl_rozdzial = new Chapter("C:\\Users\\Basia\\Desktop\\konstytucja.txt.txt");
		wyswietl_rozdzial.readchapter("X");
		
		 if (ArgumentParser.argumentsParse(args)){
		
		}
		
		else if (ArgumentParser.argumentsParse(args)){
		
		}
		*
		*
		*/
		Article wyswietl_artykul = new Article("C:\\Users\\Basia\\Desktop\\konstytucja.txt.txt");
		wyswietl_artykul.readarticle(15,18);
		
	}	
}
