import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestHelloWorld {

   String message = "XYZ";	
   HelloWorld hello = new HelloWorld();
   
   @Test
   public void testMessage() {	
      System.out.println("Inside testMessage()");     
      assertEquals(message,hello.message());
   }
}