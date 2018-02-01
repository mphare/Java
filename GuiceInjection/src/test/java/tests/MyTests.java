package tests;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import consumer.MyApplication;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import services.IMessageService;
import services.MockMessageService;

public class MyTests
{
  private Injector injector;
  private static Logger log = LogManager.getRootLogger();


  @Before
  public void setUp() throws Exception {
    injector = Guice.createInjector(new AbstractModule()
    {
      @Override protected void configure()
      {
        bind(IMessageService.class).to(MockMessageService.class);
      }
    });
  }

  @After
  public void tearDown() throws Exception {
    injector = null;
  }

  @Test
  public void test() {
    MyApplication appTest = injector.getInstance(MyApplication.class);
    log.debug("About to send to the mock sender");
    Assert.assertEquals(true, appTest.sendMessage("Hi there", "You"));
  }

}
