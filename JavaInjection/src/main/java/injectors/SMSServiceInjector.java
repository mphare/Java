package injectors;

import components.SMSServiceImpl;
import consumer.IConsumer;
import consumer.MyInjectionApplication;

public class SMSServiceInjector implements IMessageServiceInjector
{
  public IConsumer getConsumer()
  {
    return new MyInjectionApplication(new SMSServiceImpl());
  }
}
