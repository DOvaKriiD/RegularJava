import org.junit.*;

public class RegExTest {

    @Test
    public void correctIP()
    {
        Assert.assertEquals(true, RegEx.isCorrectIP("0.0.0.0"));
        Assert.assertEquals(true, RegEx.isCorrectIP("234.24.0.0"));
        Assert.assertEquals(true, RegEx.isCorrectIP("255.255.255.0"));
        Assert.assertEquals(true, RegEx.isCorrectIP("127.0.0.1"));
        Assert.assertEquals(true, RegEx.isCorrectIP("123.0.0.0"));
        Assert.assertEquals(true, RegEx.isCorrectIP("1.255.123.4"));
    }

    @Test
    public void incorrectIP()
    {
        Assert.assertEquals(false, RegEx.isCorrectIP("abc.def.gha.bcd"));
        Assert.assertEquals(false, RegEx.isCorrectIP("1300.6.7.8"));
        Assert.assertEquals(false, RegEx.isCorrectIP("256.0.0.0"));
        Assert.assertEquals(false, RegEx.isCorrectIP(".0.0.0"));
        Assert.assertEquals(false, RegEx.isCorrectIP("34.z.25.123"));
        Assert.assertEquals(false, RegEx.isCorrectIP("1.1.1.."));
    }
}
