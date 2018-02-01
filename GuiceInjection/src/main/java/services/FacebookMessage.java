package services;

public class FacebookMessage implements IMessageService
{
  public boolean sendMessage(String msg, String recipient)
  {
    System.out.println("Sending a Facebook Message to " + recipient + " with message " + msg);
    return true;
  }

}
