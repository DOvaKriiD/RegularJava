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

    @Test
    public void correctGUID()
    {
        Assert.assertTrue(RegEx.isCorrectGUID("e02fd0e4-00fd-090a-ca30-0d00a0038ba0"));
        Assert.assertTrue(RegEx.isCorrectGUID("{e02fd0e4-00fd-090A-ca30-0d00a0038ba0}"));
        Assert.assertTrue(RegEx.isCorrectGUID("{6F9619FF-8B86-D011-B42D-00CF4FC964FF}"));
        Assert.assertTrue(RegEx.isCorrectGUID("{00000000-8B86-D011-aaaa-000000000000}"));
        Assert.assertTrue(RegEx.isCorrectGUID("11111111-1111-1111-1111-111111111111"));
        Assert.assertTrue(RegEx.isCorrectGUID("fEE18888-5088-600D-1234-abcdDCBAefef"));
    }

    @Test
    public void incorrectGUID()
    {
        Assert.assertFalse(RegEx.isCorrectGUID("{e02fd0e4-00fd-090A-ca30-0d00a0038ba0"));
        Assert.assertFalse(RegEx.isCorrectGUID("e02fd0e4-00fd-090A-ca30-0d00a0038ba0}"));
        Assert.assertFalse(RegEx.isCorrectGUID("e02fd0eG-00fd-090A-ca30-0d00a0038ba0"));
        Assert.assertFalse(RegEx.isCorrectGUID("e02fd0e400fd090Aca300d00a0038ba0"));
        Assert.assertFalse(RegEx.isCorrectGUID("e02-fd0e400fd-090A-ca30-0d0a0038ba0"));
        Assert.assertFalse(RegEx.isCorrectGUID("e02fd0e4-00fd-090A-ca30-0d00a0038b"));
    }
}
