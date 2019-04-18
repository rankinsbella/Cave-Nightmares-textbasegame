package project;

import java.util.Random;

public class Monster{
  String type;
  int coin;
  public Monster() {
    type = "Zombie";
    type = "Skeleton";
    type = "Mutant Rat";

  }

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
