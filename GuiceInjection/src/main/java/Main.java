import com.google.inject.Guice;
import com.google.inject.Injector;
import consumer.MyApplication;
import injectors.AppInjector;

public class Main
{

  public static void main(String[] args)
  {
    Injector injector = Guice.createInjector(new AppInjector());
    MyApplication app = injector.getInstance(MyApplication.class);
    app.sendMessage("This is a message", "Bill Smithers");
  }
}
