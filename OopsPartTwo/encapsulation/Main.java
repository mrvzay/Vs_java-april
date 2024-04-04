package encapsulation;

public class Main {

  public static void main(String[] args) {

    EnhancedPlayer tim = new EnhancedPlayer("Tim", 200, "Sward");
    System.out.println("Intial health is " + tim.healthRemaining());
  }

}
