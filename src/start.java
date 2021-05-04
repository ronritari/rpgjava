import java.util.ArrayList;
import java.util.Scanner;

public class start {
Scanner sc = new Scanner(System.in);
public void start(){
    boolean gameOver = false;
    ArrayList<Hero> listOfHeroes = new ArrayList<>();

    Hero knight = new Hero("knight", 100, 10, 25, 50);
    Hero wizard = new Hero("wizard", 75, 15, 30, 60);
    Hero bigboi = new Hero("big boi", 150, 5, 20, 40);

    //listOfHeroes.add("knight");
    //listOfHeroes.add("wizard");
    //listOfHeroes.add("big boi");

    System.out.println("to choose knight press 0 \nto choose wizard press 1 \nto choose big boi press 2");
    int x = sc.nextInt();
    Hero.pickHero(x);


    while(gameOver = false) {
        System.out.println("Start by choosing your character.");
        System.out.println("Write the number of the hero you would like to choose");
        Hero user = new Hero();

        gameOver = true;
        }
    }
}
