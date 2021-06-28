public class Main {
  public static void main(String[] args) {
    System.out.println("SEMonsterr!");
    Monster monster = new Monster();
    Player player = new Player();
    System.out.println(monster.toString());
    player.drawMonsters();
    player.showDeck();
  }
}
