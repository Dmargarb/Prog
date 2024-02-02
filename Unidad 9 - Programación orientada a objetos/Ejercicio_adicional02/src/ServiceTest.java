import org.junit.Assert;
import org.junit.Test;

public class ServiceTest {
    @Test
    public void test(){
        Service service = new Service();
        Assert.assertEquals("Hello", service.says());
    }
}
