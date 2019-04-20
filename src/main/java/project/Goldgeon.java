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
    System.out.println("Adventurer, you are a renegade pirate in search for gold");
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

    //scene for first encounter
    System.out.println(name + " Enters the dimly lit cave and finds the severed"
    + " remains of a skeleton");
    System.out.println("Suddenly, " + name + " hears footsetps inching closer to them");
    //user input
    //String answer = new Answer();
    //answer.one();
    //answer.two();
    //answer.three();

    //Battle
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

    //String answer = scan.nextLine();

    /**if(answer.one() == one){
      System.out.println(name + "attacked" + type);
      if(answer.two() == two){
        System.out.println(name + "says a quick prayer and dies");
        System.out.println("game over");
        if (answer.three())
        //(answer.three())
        System.out.println(name + "ran away");
      }
      */

    }
  }
//}
