package project;

//Constructor for Player
public class Player {
  String gender;
  String name;
  int health;
  int coins;

  public Player(String gen, String na, int he) {
    this.gender = gen;
    this.name = na;
    this.health = he;
    coins = 0;
  }


  public void attack() {
    coins += 10;
    health -= 3;
  }

  public int gethealth(){
    return health;
  }
}
