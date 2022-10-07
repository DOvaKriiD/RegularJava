import org.junit.*;

public class RegExTest {

    @Test
    public void correctIP()
    {
        Assert.assertEquals(true, RegEx.isCorrectIP("0.0.0.0"));
    }
}
