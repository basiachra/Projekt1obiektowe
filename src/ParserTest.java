package Test;
import konstytucja.*;
import static org.junit.Assert.*;
import org.junit.Test;


public class ParserTest {

	@Test
	public void chapunnecessaryelemetnt() throws Exception{
		assertEquals(Parser.chapunnecessaryelemetnt("©Kancelaria Sejmu"), false);
		assertEquals(Parser.chapunnecessaryelemetnt("2009-11-16"), false);		
	}
	
	
	@Test
	public void artunnecessaryelemetnt() throws Exception {
		assertEquals(Parser.artunnecessaryelemetnt("©Kancelaria Sejmu"), false);
		assertEquals(Parser.artunnecessaryelemetnt("2009-11-16"), false);	
		assertEquals(Parser.artunnecessaryelemetnt("LOREM IPSUM"), false);
		assertEquals(Parser.artunnecessaryelemetnt("Rozdzia³ 10"), false);
		
	}
	
}
