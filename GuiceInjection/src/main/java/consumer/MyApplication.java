package consumer;

import services.IMessageService;

import javax.inject.Inject;

public class MyApplication

{
  private IMessageService service;

  // Constructor based injector
  //  @Inject
  //  public  MyApplication(IMessageService svc) {
  //      this.service = svc;
  //    }

  // Setter base injector
  @Inject public void setService(IMessageService svc)
  {
    this.service = svc;
  }

  public boolean sendMessage(String msg, String recipient)
  {
    return service.sendMessage(msg, recipient);
  }
}
