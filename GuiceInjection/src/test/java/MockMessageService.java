import services.IMessageService;

public class MockMessageService implements IMessageService
{
  public boolean sendMessage(String msg, String recipient)
  {
    System.out.println("Mock Sending a message to " + recipient + " with message " + msg);
    return true;
  }
}
