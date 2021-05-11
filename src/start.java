import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class start {
Scanner sc = new Scanner(System.in);
public synchronized void start()throws InterruptedException {

    try {

        boolean gameOver = false;
        ArrayList<Hero> listOfHeroes = new ArrayList<>();

        Hero knight = new Hero("Knight", 100.0, 10.0, 25.0, 50.0, 0); //makes a list of all heros to the java class
        Hero wizard = new Hero("Wizard", 75.0, 15.0, 30.0, 60.0, 0);
        Hero bigboi = new Hero("Big boi", 150.0, 5.0, 20.0, 40.0, 0);
        Hero myhero = new Hero("knight", 100, 10, 25, 50, 0);

        Enemy troll = new Enemy("troll", 50, 20);
        Enemy orc = new Enemy("orc", 100, 20);
        Enemy dragon = new Enemy("dragon", 300, 25);
        //System.out.println(knight.getName());
        listOfHeroes.add(knight);
        listOfHeroes.add(wizard);
        listOfHeroes.add(bigboi);
        listOfHeroes.add(myhero);

        knight.getStats();//prints out all the stats of characters
        wait(1000);
        wizard.getStats();
        wait(1000);
        bigboi.getStats();
        wait(1000);
        System.out.println("As you can see knight wizard and big boi have different attributes witch will impact the game \n you have three different attacks. the heavyer attack increases opponents odds to block");
        wait(5000);
        System.out.println("to choose knight press 1 \nto choose wizard press 2 \nto choose big boi press 3");
        int x = sc.nextInt();//swich case to edit myhero to the players desired stats


        switch (x) {
            case 1:
                myhero.setName("knight");
                myhero.setHealth(100);
                myhero.setAttack1(10);
                myhero.setAttack2(25);
                myhero.setAttack3(50);
                break;
            case 2:
                myhero.setName("Wizard");
                myhero.setHealth(75);
                myhero.setAttack1(15);
                myhero.setAttack2(30);
                myhero.setAttack3(60);
                break;
            case 3:
                myhero.setName("big boi");
                myhero.setHealth(150);
                myhero.setAttack1(5);
                myhero.setAttack2(20);//lllllll
                myhero.setAttack3(40);
                break;
        }

        System.out.println("Your journey begins as: " + myhero.getName()+" \n ");
        int gameover = 0;

        while (gameover == 0) {

            System.out.println("the story starts here");
            wait(1000);
            System.out.println("Once upon a time they were two beautiful  villages located on sea side, its inhabitants lived in prosperity, \nthey were taking out corals from the depths of the sea, they were a happy peoples and they have a fun, \nbut this situation did not last forever.");
            System.out.println("you ran in to troll must fight");
            wait(5000);
            myhero.fight(troll);
            if (myhero.getHealth() < 0) {
                wait(5000);
                System.out.println("game over you lost");
                gameover = 1;
            } else {
                wait(3000);
                System.out.println("congrats you defeated " + troll.getName());
            }
            wait(5000);
            System.out.println("you continiue story");

            System.out.println("continue to village");
            wait(5000);
            System.out.println("side quest");

            /*
            System.out.println("do you want to help villager press 1 for yes press 2 for no");       faruk does side quest
            int b = sc.nextInt();
            if (b==1){
                System.out.println("you helped villager he has a gift for you");
                myhero.setA4(100);
            }else{
                System.out.println("the villager is now sad :(");
            }*/

            wait(3000);
            myhero.fight(orc);
            if (myhero.getHealth() < 0) {
                wait(5000);
                System.out.println("game over you lost");
                gameover = 1;
            } else {
                wait(5000);
                System.out.println("congrats you defeated " + orc.getName());
            }
            System.out.println("you continiue story");
            wait(5000);
            System.out.println("continue to cave");
            myhero.fight(dragon);
            if (myhero.getHealth() <= 0) {
                System.out.println("game over you lost");
                gameover = 1;
            } else {
                System.out.println("congrats you defeated " + dragon.getName());
                System.out.println("you won the game :)");
            }
            //System.out.println("you won the game :)");

            gameover = 1;
        }
        System.out.println("game is done");
    }catch(Exception e){
        System.out.println("error");
    }
}
}

