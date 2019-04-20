package project;

//Constructor for Player
public class Player {
  String gender;
  String name;
  int health;
  int coins;
//connecting player to attributes
  public Player(String gen, String na, int he, int co) {
    this.gender = gen;
    this.name = na;
    this.health = he;
    this.coin = co;
  }
  //Player damage output and health
  public Player() {
    int he = 100;

  }
  //outcome of attack
  public void attack() {
    coins += 3;
    health -= 30;
  }

  public int gethealth(){
    return health;
  }
}
