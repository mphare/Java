import components.IMessageService;
import consumer.IConsumer;
import consumer.MyInjectionApplication;
import injectors.IMessageServiceInjector;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyDIApplicationJUnitTest
{
  private IMessageServiceInjector injector;
  @Before
  public void setUp () {
    injector = new IMessageServiceInjector()
    {
      public IConsumer getConsumer()
      {
        return new MyInjectionApplication(new IMessageService() {
          public void sendMessages(String msg, String rec) {
            System.out.println("Mock Message Service Implementation - msg: " + msg + " - rec: "+rec);
          }
        });
      }
    };
  }
  @Test
  public void test() {
    IConsumer consumer = injector.getConsumer();
    consumer.processMessages("Hello, Mickey", "mickey@disney.com");
  }

  @After
  public void tear() {
    injector = null;
  }
}
