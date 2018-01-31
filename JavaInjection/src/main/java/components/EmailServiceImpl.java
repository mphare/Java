package components;

public class EmailServiceImpl implements IMessageService
{

  public void sendMessages(String msg, String rec) {
    System.out.println("Email sent to " + rec + " with message " + msg);
  }

}
