import java.io.IOException;

public class ArgumentParser {

	public static void article(int arg1, int arg2 , String path) throws IOException
	{	
		
		if(arg1<1 || arg1>243 || arg2<arg1 || arg2>243 ) System.out.println("Podaj poprawny zakres");
		else {
			Article.readarticle(arg1, arg2, path);
		}
		
		
			
	}	
	public static void chapter(String argument , String path)
	{	
			
	}	
	
	
}
