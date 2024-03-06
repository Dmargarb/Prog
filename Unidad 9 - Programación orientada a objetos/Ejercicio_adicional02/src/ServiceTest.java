import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;

public class ServiceTest {

    @Test
    public void test(){
        Service service = new Service();
        Assert.assertEquals("Hello", service.says());
    }

    @Test
    public void Test2(){
        Service service = mock(Service.class);
        when(service.says()).thenReturn("Hello");
        Assert.assertEquals("Hello", service.says());
    }
}
