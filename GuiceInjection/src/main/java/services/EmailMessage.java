package services;

import javax.inject.Singleton;

@Singleton
public class EmailMessage implements IMessageService
{
  public boolean sendMessage(String msg, String recipient)
  {
    System.out.println("Sending an Email to " + recipient + " with message " + msg);
    return true;
  }
}
