package project;

//Constructor for Player
public class Player {
  String name;
  String choice;
  String choice2;
  int health;

//connecting player to attributes
  public Player(String name, String choice, String choice2, int health) {
    this.name = name;
    this.choice = choice;
    this.choice2 = answer;
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
