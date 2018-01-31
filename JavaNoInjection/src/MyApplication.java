public class MyApplication
{
  private EmailService emailService = new EmailService();
  public void processMessages(String msg, String rec) {
    this.emailService.sendEmail(msg, rec);
  }

}
