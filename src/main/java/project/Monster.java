package project;

import java.util.Random;
//Initialize monster class variables
public class Monster{
  String type;
  int damage;
  String [] types = {"Zombie", "Skeleton", "Mutant Rat"};

  public Monster() {
    type = "Zombie";
    //int health = 30;
    damage = 20;
    //type = "Skeleton";
    //int health2 = 20;
    //int damage2 = 30;
    //type = "Mutant Rat";
    //int health3 = 40;
    //int damage3 = 25;

  }
  //Spawn system
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
