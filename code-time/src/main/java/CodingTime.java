import java.io.Console;

public class CodingTime {
  public static void main(String[] args)
    askWhatYouAteFor("today");
    askWhatYouAteFor("yesterday");
    askWhatYouAteFor("2 days ago");
  }

  public static void askWhatYouAteFor integer day) {
    Console myConsole = System.console();
    System.out.println("How many hours did you spend coding " + day + "?");
    String stringDay = myConsole.readLine();

    Integer yourDay = Integer.parseInt(stringDay);
    System.out.println("You spent " + yourDay + " hours coding " + day + ".");
  }
}
