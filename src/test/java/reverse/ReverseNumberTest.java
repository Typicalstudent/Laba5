package reverse;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseNumberTest {

    @Test
    public void reverseRecurs() {
        ReverseNumber reverseNumber = new ReverseNumber();
        int num = 234056;
        int result = 650432;
        reverseNumber.reverseRecurs(num);
        Assert.assertEquals(result, reverseNumber.getResult());
    }

    @Test
    public void reverseNoRecurs() {
        ReverseNumber reverseNumber = new ReverseNumber();
        int num = 234056;
        int result = 650432;
        reverseNumber.reverseRecurs(num);
        Assert.assertEquals(result, reverseNumber.getResult());
    }
}