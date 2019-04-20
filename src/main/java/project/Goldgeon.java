package project;

import java.util.Random;
import java.util.Scanner;

public class Goldgeon {

  public static void main(String[] args) {
    //creating instance of variables
    //creating instance of scanner and random
    Scanner scan = new Scanner(System.in);
    Random generator = new Random();


    //introduction to your adventure
    System.out.println("Hello explorer, while sailing the 7 seas your ship took"
    + "on too much water.");
    System.out.println("All of your crew members died at sea and you are the only"
    + "surviver.");
    System.out.println("Adventurer, you are a renegade pirate in search for gold");
    System.out.println("In the Bermuda triangle, your team of Pirate mates discover"
        + " an uncharted island.");
    System.out.println("As your crew inches closer, the waves around you reach"
        + " incredible heights, your boat takes on too much water.");
    System.out.println("All of your crew members die and you wash up on a beach");
    System.out.println("You awake to find a cave, adventure awaits");
    System.out.println("This is your story.");

    //character creation
    System.out.println("Choose your gender");
    String choice = scan.nextLine();
    System.out.println("Choose your Name");
    String name = scan.nextLine();
    System.out.println("Hello " + name);

    //scene for first encounter
    System.out.println(name + " Enters the dimly lit cave and finds the severed"
        + "of a skeleton");
    System.out.println("Suddenly, " + name + " hears footsetps inching closer to them");
    //first monster
    Monster zombie = new Monster();
    zombie.type();
    String type = zombie.gettype();
    System.out.println("A new monster has appeared " + type);
  }
}
