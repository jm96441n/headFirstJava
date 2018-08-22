/*
methods:
getUserInput
*/
import java.io;

public class GameHelper {
  public String getUserInput(String prompt) {
    String input;
    System.out.print(output + " ");
    try {
      BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
      input = is.readLine();
      if (input.length() == 0) return null;
    } catch (IOException e) {
      System.out.println("IOException: " + e);
    }
    return input;
  }
}
