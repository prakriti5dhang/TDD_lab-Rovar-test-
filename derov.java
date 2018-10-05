package tdd_lab;

import static org.junit.Assert.*;

import org.junit.Test;

public class derov {

	
	
	@Test
	public void emptystring() {
		
     
     
     String s = "";
     String s_en ="";
     assertEquals("",testJunit.derov(s));
      
      }
	@Test
	public void nullstring() {
		
     
     
     String s1 = null;
     String s_en1 =null;
     assertEquals(null,testJunit.derov(s1));
      
      }
	@Test
	public void lowerstring() {
		
     
     
     String s1 = "abobcocdodefofgoghohijojkoklolmomnonopopqoqrorsostotuvovwowxoxyzoz";
     String s_en1 ="abcdefghijklmnopqrstuvwxyz";
     assertEquals(s_en1,testJunit.derov(s1));
      
      }
	@Test
	public void upperstring() {
		
     
     
     String s1 = "ABOBCOCDODEFOFGOGHOHIJOJKOKLOLMOMNONOPOPQOQRORSOSTOTUVOVWOWXOXYZOZ";
     String s_en1 ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
     assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ",testJunit.derov(s1));
      
	  
      }
	@Test
	public void checknum() {
		
     
     String s1 = "123456789";
     String s_en1 ="123456789";
     assertEquals("123456789",testJunit.derov(s1));
      
      }
	@Test
	public void resonable() {
		
     
     
     String s1 = "&#%!";
     String s_en1 ="&#%!";
     assertEquals("&#%!",testJunit.derov(s1));
      
      }
	

}
