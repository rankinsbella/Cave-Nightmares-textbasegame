package project;

import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class Goldgeon {

  public static void main(String[] args) {
    /** Creating instances of the scannenr class and random class.
    */

    Scanner scan = new Scanner(System.in);
    Random generator = new Random();

    //introduction to your adventure
    System.out.println("Adventurer, you're a renegade pirate in search for gold");
    System.out.println("In the Bermuda triangle, your team of Pirate mates discover"
        + " an uncharted island.");
    System.out.println("As your crew inches closer, the waves around you reach"
        + " incredible heights, your boat takes on too much water.");
    System.out.println("All of your crew members die and you wash up on a beach");
    System.out.println("You awake to find a cave, adventure awaits");
    System.out.println("This is your story.");
    System.out.println("");

    //character creation
    System.out.println("Choose your gender");
    String choice = scan.nextLine();
    System.out.println("Choose your Name");
    String name = scan.nextLine();
    System.out.println("Hello " + name);
    System.out.println("");
    Player main = new Player(choice, name, 60);

    //scene for first encounter
    System.out.println(name + " Enters the dimly lit cave and finds the severed"
        + " remains of a skeleton");
    System.out.println("Suddenly, " + name + " hears footsetps inching closer to them");

    //Battle
    do {
      Monster monster = new Monster();
      monster.type();
      String type = monster.gettype();
      System.out.println("A new monster has appeared " + type);
      System.out.println(type + " leaps forward to attack with their rusty blade");
      System.out.println("");
      System.out.println("What will you do?");
      System.out.println("one. Attack");
      System.out.println("two. Say your prayers and prepare to die");
      System.out.println("three. Run away");
      System.out.println("Enter a number");
      int choice2 = scan.nextInt();

      if (choice2 == 1) {
        System.out.println(name + "attacked" + type);
        int damage = monster.getdamage();
        main.attack(damage);
        System.out.println("Health is" + main.gethealth());
      }
      else if (choice2 == 2) {
        System.out.println(name + "says a quick prayer and dies");
        System.out.println("game over");
      }
      else {
        System.out.println(name + "ran away");
      }
    } while (main.gethealth() > 0);
  }
}
