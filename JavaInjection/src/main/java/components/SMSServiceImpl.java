package components;

public class SMSServiceImpl implements IMessageService
{

  public void sendMessages(String msg, String rec) {
    System.out.println("SMS sent to " + rec + " with message " + msg);
  }

}
