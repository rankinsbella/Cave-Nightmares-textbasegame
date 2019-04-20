package project;

import java.util.Random;
//Initialize monster class variables
public class Monster{
  String type;
  int coin;
  public Monster() {
    type = "Zombie";
    int health = 30;
    int damage = 20;
    type = "Skeleton";
    int health = 20;
    int damage = 30;
    type = "Mutant Rat";
    int health = 40;
    int damage = 25;

  }
  //Spawn system
  public void type() {
    Random rand = new Random();
    int zombie = rand.nextInt(3);
    if (zombie == 0){
      type = "Zombie";
      coin = 3;
    }
    else if (zombie == 1){
      type = "Skeleton";
      coin = 3;
    }
    else {
      type = "Mutant Rat";
      coin = 3;
    }
  }

  public String gettype() {
    return type;
  }




}
