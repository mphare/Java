package injectors;

import components.EmailServiceImpl;
import consumer.IConsumer;
import consumer.MyInjectionApplication;

public class EmailServiceInjector implements IMessageServiceInjector
{
  public IConsumer getConsumer() {
    return new MyInjectionApplication(new EmailServiceImpl());
  }
}
