import org.junit.Assert;
import org.junit.Test;

public class PalindromeCheckerTest {
    @Test
    public void testPalindromo() {
        PalindromeChecker palimdromo = new PalindromeChecker();
        Assert.assertEquals(false, palimdromo.esPalindromo("Prueba"));
        Assert.assertEquals(true, palimdromo.esPalindromo("Reconocer"));
        Assert.assertEquals(true, palimdromo.esPalindromo("Allá"));
        Assert.assertEquals(true, palimdromo.esPalindromo("Anita lava la tina."));
    }
}
