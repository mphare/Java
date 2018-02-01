package injectors;

import com.google.inject.AbstractModule;
import services.EmailMessage;
import services.FacebookMessage;
import services.IMessageService;

public class AppInjector extends AbstractModule
{
  @Override
  protected void configure () {
    bind(IMessageService.class).to(EmailMessage.class);
//    bind(IMessageService.class).to(FacebookMessage.class);
  }
}
