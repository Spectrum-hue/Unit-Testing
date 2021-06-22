//PrimeNumberMethodTest.java (Junit test class).

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PrimeNumberMethodTest {
	
   PrimeNumberMethod numberMethod = new PrimeNumberMethod();
	
      @Test
      // isPrime () method refers to check if a number is a prime number.
      public void testPrime() {
         assertEquals(true, numberMethod.isPrime(5));
         assertNotEquals(true, numberMethod.isPrime(4));
         assertFalse(numberMethod.isPrime(111));
         assertTrue(numberMethod.isPrime(113));
       }

}
