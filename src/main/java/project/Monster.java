package project;

import java.util.Random;
//Initialize monster class variables

public class Monster{
  String type;
  int damage;
  String [] types = {"Zombie", "Skeleton", "Mutant Rat"};

  /** constructor for monsters.
  */
  public Monster() {
    type = "Zombie";
    damage = 20;

  }
  /** spawn system for randomly generating monsters.
  */
  public void type() {
    Random rand = new Random();
    int monster = rand.nextInt(3);
    if (monster == 0){
      type = types[0];
      damage = 20;
    }
    else if (monster == 1){
      type = types[1];
      damage = 30;
    }
    else {
      type = types[2];
      damage = 10;
    }
  }

  public String gettype() {
    return type;
  }

  public int getdamage() {
    return damage;
  }


}
