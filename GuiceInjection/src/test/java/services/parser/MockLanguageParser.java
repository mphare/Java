package services.parser;

public class MockLanguageParser implements ILanguageParser
{
  public boolean parseMessage(String msg) {
    System.out.println("Using the Mock Language");
    return true;
  }
}
