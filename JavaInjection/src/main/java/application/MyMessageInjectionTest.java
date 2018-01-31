package application;

import consumer.IConsumer;
import injectors.EmailServiceInjector;
import injectors.IMessageServiceInjector;
import injectors.SMSServiceInjector;

public class MyMessageInjectionTest
{
  public static void main(String[] args) {
    String msg = "Hi Mr. Jinx!";
    String rec = "jinx@ruff.and.ready.com";
    String phone = "1234567890";
    IMessageServiceInjector injector = null;
    IConsumer app = null;

    // Send Email
    injector = new EmailServiceInjector();
    app = injector.getConsumer();
    app.processMessages(msg, rec);

    // Send SMS
    injector = new SMSServiceInjector();
    app = injector.getConsumer();
    app.processMessages(msg, phone);

  }
}
