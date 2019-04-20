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
    Player main = new Player(choice, name, health);

  }
  //outcome of attack
  public void attack() {
    health -= 20;
  }

  public int gethealth(){
    return health;
  }
}
