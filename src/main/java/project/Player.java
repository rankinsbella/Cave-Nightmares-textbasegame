package project;

//Constructor for Player
public class Player {
  String name;
  String choice;
  int health;

//connecting player to attributes
  public Player(String name, String choice, int health) {
    this.name = name;
    this.choice = choice;
    this.health = health;

  }

  //outcome of attack
  public void attack(int damage) {
    health -= damage;
  }

  public int gethealth(){
    return health;
  }
}
