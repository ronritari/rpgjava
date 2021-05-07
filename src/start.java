import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class start {
Scanner sc = new Scanner(System.in);
public void start(){
    boolean gameOver = false;
    ArrayList<Hero> listOfHeroes = new ArrayList<>();

    Hero knight = new Hero("Knight", 100.0, 10.0, 25.0, 50.0);
    Hero wizard = new Hero("Wizard", 75.0, 15.0, 30.0, 60.0);
    Hero bigboi = new Hero("Big boi", 150.0, 5.0, 20.0, 40.0);
    Hero myhero = new Hero("knight", 100, 10, 25, 50);

    Enemy troll = new Enemy("troll", 50, 20);
    Enemy orc = new Enemy("orc", 100, 20);
    Enemy dragon = new Enemy("dragon", 200, 25);
    //System.out.println(knight.getName());
    listOfHeroes.add(knight);
    listOfHeroes.add(wizard);
    listOfHeroes.add(bigboi);
    listOfHeroes.add(myhero);

    knight.getStats();
    wizard.getStats();
    bigboi.getStats();
    System.out.println("to choose knight press 0 \nto choose wizard press 1 \nto choose big boi press 2");
    int x = sc.nextInt();

    myhero.fight(troll);

    switch (x){
        case 0:
             myhero.setName("knight");
             myhero.setHealth(100);
             myhero.setAttack1(10);
             myhero.setAttack2(25);
             myhero.setAttack3(50);
            break;
        case 1:
            myhero.setName("Wizard");
            myhero.setHealth(75);
            myhero.setAttack1(15);
            myhero.setAttack2(30);
            myhero.setAttack3(60);
            break;
        case 2:
            myhero.setName("big boi");
            myhero.setHealth(150);
            myhero.setAttack1(5);
            myhero.setAttack2(20);
            myhero.setAttack3(40);
            break;
    }

    System.out.println("Your hero is: " + myhero.getName());


    while(gameOver = false) {



        gameOver = true; //nf
        }
    }
}
