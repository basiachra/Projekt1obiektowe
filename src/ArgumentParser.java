import java.io.IOException;

public class ArgumentParser {

	public static void article(int arg1, int arg2 , String path) throws IOException
	{	
		
		if(arg1<1 || arg1>243 || arg2<arg1 || arg2>243 ) throw new IllegalArgumentException(arg1 + " "+ arg2 + "Niepoprawny zakres artyku³ów");
		else Article.readarticle(arg1, arg2, path);
	
	}	
	
	
	public static void chapter(String argument , String path) throws IOException
	{	
		switch(argument){
			
			case "1":
			case "I" : 
				Chapter.readchapter("I", "II", path);
				break;
			case "2":
			case "II" : 
				Chapter.readchapter("II", "III", path);
				break;
			case "3":
			case "III" : 
				Chapter.readchapter("III", "IV", path);
				break;
			case "4":
			case "IV" : 
				Chapter.readchapter("IV", "V", path);
				break;
			case "5":
			case "V" : 
				Chapter.readchapter("V", "VI", path);
				break;
			case "6":
			case "VI" : 
				Chapter.readchapter("VI", "VII", path);
				break;
			case "7":
			case "VII" : 
				Chapter.readchapter("VII", "VIII", path);
				break;
			case "8":
			case "VIII" : 
				Chapter.readchapter("VIII", "IX", path);
				break;
			case "9":
			case "IX" : 
				Chapter.readchapter("IX", "X", path);
				break;
			case "10":
			case "X" : 
				Chapter.readchapter("X", "XI", path);
				break;
			case "11":
			case "XI" : 
				Chapter.readchapter("XI", "XII", path);
				break;
			case "12":
			case "XII" : 
				Chapter.readchapter("XII", "XIII", path);
				break;
			case "13":
			case "XIII" : 
				Chapter.readchapter("XIII", "XIV ", path);
				break;
			default :
				throw new IllegalArgumentException(argument + "Nie ma takiego rozdzia³u");		
		}
			
	}		
	
}
