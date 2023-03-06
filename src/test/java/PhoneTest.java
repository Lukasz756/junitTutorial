import Exam1.Phone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneTest {

    @Test
    public void testCreate(){
        Phone phone = new Phone();
        Assertions.assertNotNull(phone);

    }

    @Test
    public void testLetter(){
        Phone phone = new Phone();
        Assertions.assertEquals(phone.translate("A"),"2");
        Assertions.assertEquals(phone.translate("O"),"666");
    }

    @Test
    public void testWord(){
        Phone phone = new Phone();
        Assertions.assertEquals(phone.translate("kot"),"556668");
    }

}

