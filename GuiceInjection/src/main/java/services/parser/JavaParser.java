package services.parser;

public class JavaParser implements ILanguageParser
{
  public boolean parseMessage(String msg) {
    System.out.println("Parsing a message using Java");
    return true;
  }
}
