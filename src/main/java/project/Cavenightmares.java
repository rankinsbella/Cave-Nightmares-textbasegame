package project;

import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class Cavenightmares {

  public static void main(String[] args) {

    /** Creating instances of the scannenr class and random class.
    */

    Scanner scan = new Scanner(System.in);
    Random generator = new Random();

    //introduction to your adventure
    System.out.println("Adventurer, you're a renegade pirate leading a life of"
        + " adventure" );
    System.out.println("In the Bermuda triangle, your team of Pirate mates discover"
        + " an uncharted island");
    System.out.println("As your crew inches closer, the waves around you reach"
        + " incredible heights, your boat takes on too much water");
    System.out.println("All of your crew members die and you wash up on a beach");
    System.out.println("You awake to find a cave, adventure awaits");
    System.out.println("This is your story");
    System.out.println("How long can you survive?");
    System.out.println("");

    //character creation
    System.out.println("Choose your gender");
    String choice = scan.nextLine();
    System.out.println("Choose your Name");
    String name = scan.nextLine();
    System.out.println("Hello " + name);
    Player main = new Player(choice, name, 100);
    System.out.println("Health is " + main.gethealth());
    System.out.println("");

    //scene for first encounter
    System.out.println(name + " Enters the dimly lit cave and finds the severed"
        + " remains of a skeleton");
    System.out.println("Suddenly, " + name + " hears footsetps inching closer to them");


    //choosing your own actions
    do {
      Monster monster = new Monster();
      monster.type();
      String type = monster.gettype();
      System.out.println("A new monster has appeared: " + type);
      System.out.println("");
      System.out.println("The " + type + " leaps forward to attack with their rusty blade");
      System.out.println("");
      System.out.println("What will you do?");
      System.out.println("1. Attack");
      System.out.println("2. Say your prayers");
      System.out.println("3. Run away");
      System.out.println("Enter a number");
      int choice2 = scan.nextInt();

      //Battle and choice adventure system
      if (choice2 == 1) {
        int damage = monster.getdamage();
        System.out.println(name + " attacked " + type + " for " +  monster.getdamage());
        System.out.println(type + " attacked " + name + " for " + monster.getdamage());
        main.attack(damage);
        System.out.println("Health is " + main.gethealth());
      }
      else if (choice2 == 2) {
        System.out.println(name + " says a quick prayer as a " + type + " slices "
            + "through their abdomen cutting them in half ");
        System.out.println("GAME OVER");
        break; }
      else {
        System.out.println(name + " ran away");
        System.out.println("");
        System.out.println(name + " runs down a dark cave path");
        System.out.println("You hear footsteps behind you");
        System.out.println("The shadowy figure charges at you");
      }
    }
    while (main.gethealth() > 0);
  }
}
