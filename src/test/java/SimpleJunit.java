import SimpleTest.SimpleTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleJunit {
    @Test
    public void create(){
        SimpleTest simpleTest = new SimpleTest();
        Assertions.assertNotNull(simpleTest);
    }


    @Test
    public void simpleTest(){
        SimpleTest simpleTest = new SimpleTest();
        Assertions.assertEquals(simpleTest.add(5,5),10);
    }
}
