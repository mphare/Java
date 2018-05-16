package consumer;

import components.IMessageService;
import consumer.IConsumer;

public class MyInjectionApplication implements IConsumer
{
  private IMessageService service;
  public MyInjectionApplication(IMessageService svc) {
    this.service = svc;
  }

  public void processMessages(String msg, String rec) {
    this.service.sendMessages(msg, rec);
  }
}
