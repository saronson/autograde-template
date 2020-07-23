import java.io.*;

public class TestHello //extends junit.framework.TestCase
{

public static void main(String args[]) {
  TestHello t = new TestHello();
  t.testHelloWorld();
}

   @Test
   public void testHelloWorld()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     Hello.main(null);

     // assertion
     assertEquals("Hello world!\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }

}
