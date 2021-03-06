import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    public void testFirst(){
        System.out.println("My First Test");
    }

    @Test
    public void testAdd(){
        int sum = HelloWorld.add(3,5);
        Assertions.assertEquals(8, sum);
    }

    @Test
    public void testAdd2(){
        int sum = HelloWorld.add(3,5);
        Assertions.assertNotEquals(7, sum);
    }

    @Test
    public void testMinus(){
        int minus = HelloWorld.minus(6, 2);
        Assertions.assertEquals(4, minus);
    }

    @Test
    public void testMinus2(){
        int sum = HelloWorld.minus(6,2);
        Assertions.assertNotEquals(7, sum);
    }

    @Test
    public void testMulti(){
        int sum = HelloWorld.multiplication(5, 2);
        Assertions.assertEquals(10, sum);
    }

    @Test
    public void testError() throws Exception {
        Assertions.assertThrows(Exception.class, ()->{
            throw new Exception("Some error");
        });
    }
}
