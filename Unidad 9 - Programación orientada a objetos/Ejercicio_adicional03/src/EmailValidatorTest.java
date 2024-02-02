import org.junit.Assert;
import org.junit.Test;

public class EmailValidatorTest {
    @Test
    public void testEmailValido() {
        EmailValidator email = new EmailValidator();
        Assert.assertEquals(true, email.emailValido("test@ejemplo.com"));
        Assert.assertEquals(true, email.emailValido("usuario1234@gmail.com"));
        Assert.assertEquals(true, email.emailValido("usuaio@dominio.es"));
    }

    @Test
    public void testEmailInvalido() {
        EmailValidator email = new EmailValidator();
        Assert.assertEquals(false, email.emailValido("email-invalido"));
        Assert.assertEquals(false, email.emailValido("test@ejemplocom"));
        Assert.assertEquals(false, email.emailValido("usuario1234@gmail."));
        Assert.assertEquals(false, email.emailValido("usuaio@.dominio.es"));
    }
}
