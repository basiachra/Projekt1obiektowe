

import java.io.IOException;

public class Konstytucja {

		
	public static void main(String[] args) throws IOException
	{
		// System.out.println("Podaj �cie�k� do pliku, 'a' lub 'r' w zale�no�ci co chcesz wy�wietli� oraz przedzia�: ");
		 
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
