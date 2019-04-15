package project;

import java.util.Random;

public class Monster{
  String type;

  public Monster() {
    type = "Zombie";

  }

  public void type() {
    Random rand = new Random();
    int zombie = rand.nextInt(3);
    if (zombie == 0){
      type = "Zombie";

    }
    else if (zombie == 1){
      type = "Skeleton";
    }
    else {
      type = "Mutant Rat";
    }
  }

  public String gettype() {
    return type;
  }
}
