package project;

import java.util.Random;
import java.util.Scanner;


public class Goldgeon {

  public static void main(String[] args) {
  //creating instance of variables
    Scanner scan = new Scanner(System.in);
    Random generator = new Random();

  //introduction to your adventure
  System.out.println("Hello explorer, while sailing the 7 seas your ship took"
      + "on too much water.");
  System.out.println("All of your crew members died at sea and you are the only"
      + "surviver.");
  System.out.println("This is your story.");

  //character creation
  System.out.println("Choose your gender");

  //choosen gender
  String choice = scan.nextLine();
  Player one = new Player(choice);

    
  }

}
