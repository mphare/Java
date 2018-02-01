package application;

import com.google.inject.Guice;
import com.google.inject.Injector;
import consumer.MyApplication;
import injectors.AppInjector;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Main
{
  private static Logger log = LogManager.getRootLogger();

  public static void main(String[] args)
  {
    Injector injector = Guice.createInjector(new AppInjector());
    MyApplication app = injector.getInstance(MyApplication.class);
    log.debug("About to send a message");
    app.sendMessage("This is a message", "Bill Smithers");
  }
}
