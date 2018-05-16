public class Main
{

  public static void main(String[] args)
  {

    System.out.println("Without Injection");
    MyApplication app = new MyApplication();
    app.processMessages("Hi Jinx", "mrjinx@ruff.and.ready.com");
  }
}
