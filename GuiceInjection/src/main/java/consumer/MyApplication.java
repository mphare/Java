package consumer;

import services.IMessageService;
import services.parser.ILanguageParser;

import javax.inject.Inject;

public class MyApplication

{
  private IMessageService service;
  private ILanguageParser language;
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
  @Inject public void setService(ILanguageParser lng) {this.language = lng; }

  public boolean sendMessage(String msg, String recipient)
  {
    System.out.println("Using Language : ");
    language.parseMessage("What Language?");
    return service.sendMessage(msg, recipient);
  }
}
