import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testIsTeenager() {
        boolean result1 = Person.isTeenager(15);
        Assert.assertTrue(result1);

        boolean result2 = Person.isTeenager(18);
        Assert.assertTrue(result2);

        boolean result3 = Person.isTeenager(20);
        Assert.assertFalse(result3);
    }
}



