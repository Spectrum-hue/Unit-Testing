//Import the required packages.
import static org.junit.Assert.*;
import org.junit.Test;

   //Define the class.
   public class STest {
  
   //Define the method to test the length.
   @Test
   public void lengthTest() {
      assertEquals(0, "".length());
      assertEquals(1, "t".length());
      assertEquals(2, "te".length());
      assertEquals(3, "tes".length());
      assertEquals(4, "test".length());
   }
  
   //Define the method to test the charAt.
   @Test
   public void charAtTest() {
      assertEquals('T', "Test".charAt(0));
      assertEquals('e', "Test".charAt(1));
      assertEquals('t', "Test".charAt(3));
   }
  
   //Define the method to test the substring.
   @Test
   public void subStringTest() {
      assertEquals("Nice", "Nice picture!".substring(0, 4));
      assertEquals("picture!?", "Nice picture!?".substring(5));
      assertEquals("ur", "Nice picture!?".substring(9, 11));
   }
  
   //Define the method to test the indexOf.
   @Test
   public void indexOfTest() {
      assertEquals(2, "Test time".indexOf('s')); 
      assertEquals(1, "Test time".indexOf('e'));
      assertEquals(6, "Test time".indexOf('i'));
   }
}

