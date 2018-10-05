package tdd_lab;

import static org.junit.Assert.*;

import org.junit.Test;

public class rovartest {
	
	
	
	@Test
	public void emptystring() {
		
     
     
     String s = "";
     String s_en ="";
     assertEquals("",testJunit.enrov(s));
      
      }
	@Test
	public void nullstring() {
		
     
     
     String s1 = null;
     String s_en1 =null;
     assertEquals(null,testJunit.enrov(s1));
      
      }
	@Test
	public void lowerstring() {
		
     
     
     /*String s1 = "hello";
     String s_en1 ="hohelollolo";
     assertEquals("hohelollolo",testJunit.enrov(s1));*/
      
	  String s1 ="abcdefghijklmnopqrstuvwxyz";
	  String s_en1 = "abobcocdodefofgoghohijojkoklolmomnonopopqoqrorsostotuvovwowxoxyzoz";
	  assertEquals("abobcocdodefofgoghohijojkoklolmomnonopopqoqrorsostotuvovwowxoxyzoz",testJunit.enrov(s1));
      }
	@Test
	public void upperstring() {
		
     
     
     String s1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
     String s_en1 ="ABOBCOCDODEFOFGOGHOHIJOJKOKLOLMOMNONPOPQOQRORSOSTOTUVOVWOWXOXYZOZ";
     assertEquals("ABOBCOCDODEFOFGOGHOHIJOJKOKLOLMOMNONPOPQOQRORSOSTOTUVOVWOWXOXYZOZ",testJunit.enrov(s1));
      
      }
	@Test
	public void checknum() {
		
     
     
     String s1 = "1aea23sdf456789";
     String s_en1 ="1aea23sosdodfof456789";
     assertEquals(s_en1,testJunit.enrov(s1));
      
      }
	@Test
	public void resonable() {
		
     
     
     String s1 = "&#%!#";
     String s_en1 ="&#%!#";
     assertEquals("&#%!#",testJunit.enrov(s1));
      
      }
	
}

