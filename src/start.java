import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class start {
Scanner sc = new Scanner(System.in);
    public void delay(String s, long delay) throws InterruptedException {
        for ( int i= 0; i < s.length(); i++) {
            // for loop delays individual String characters

            System.out.print(s.charAt(i));
            Thread.sleep(delay); //time is in milliseconds
        }
        System.out.println(""); // this is the space in between lines
    }
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

        delay("Once upon a time they were two beautiful villages located on sea side, \nits inhabitants lived in prosperity, they were takingout corals from the depths of the sea, they were a happy peoples and they have a fun,\n but this situation did not last forever.\nThe state of the two villages changed upside down when the Dragon attacked them and destroyed the villages with the help of the traitorous Troll who get all them treasure.\n" +
                "After this calamity befell them, \nthe leaders of the two tribes decided to ask help from the great sage of the white moutain, \nhe was the only one who managed to defeat the Dragon, but he was betrayed by the TROLL when at first they were together, \nthe great Troll lost the last battle and narrowly escape death but become blind.\n" , 20);


        wait(1000);
        delay("To bring peace and clarity the great wizard asked the two other tribes send foward their greatest heroes\nto sacrifice their life in order to bring peace", 20);
        wait(5000);
        delay("The KNIGHT needs to go to the jungle of amazon to the Hiung tribe to bring the the special sword but he should first kill the tigre who always attack the tribe. \n after succsessfully gaining the mighty sword he was ready for battle", 20);
        knight.getStats();//prints out all the stats of characters
        wait(5000);
        delay("The WIZARD went to the coral kingdom to bring the magic wand but he most first help them in their fight against sharks. \nThe wand comes with great power but the Wizard is old and small", 20);
        wizard.getStats();
        wait(5000);
        delay("the BIGBOI went to the big mountain of himalaya to bring the of the silver shield.silver shield but he need first to help the a tribe to built a wood bridge between the two sides of village then they will show him the cave of bear where the silver shield is, \nbut he needs to battle also with the bear. \nwith the protection of the shield he only has one free arm to punch therefore making his attacks weaker", 20);
        bigboi.getStats();
        wait(5000);
        delay("As you can see knight wizard and big boi have different attributes witch will impact the game \n you have three different attacks. the heavyer attack increases opponents odds to block", 20);
        wait(5000);
        delay("to choose knight press 1 \nto choose wizard press 2 \nto choose big boi press 3",20);
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

        delay("Your journey begins as: " + myhero.getName()+" \n ",50);
        int gameover = 0;

        while (gameover == 0) {

            delay("the three heros came to the the place of meeting at the great wizards den, the real important job will start from that moment,\ntheir plan was clear, battle against the TROLL, the ORC and finally the DRAGON. First the plan most be followed, they should look for the TROLL,\nhe is the only who knows the ORC cave, they need to go to tribe of TROLL and capture him but they should battle against the hyenas guarding him.",20);
            wait(5000);
            //System.out.println("Once upon a time they were two beautiful  villages located on sea side, its inhabitants lived in prosperity, \nthey were taking out corals from the depths of the sea, they were a happy peoples and they have a fun, \nbut this situation did not last forever.");
            delay("The troll was well known through the nation, but also heavily guarded by hyenas.\nthe heroes planned to attack at night but the troll was alarmed by the hyenas while the others were batteling the hyenas\n"+myhero.getName()+" went for the troll. you must now battle against him.", 20);
            wait(5000);
            myhero.fight(troll);
            if (myhero.getHealth() < 0) {
                wait(5000);
                delay("game over you lost", 20);
                gameover = 1;
                break;
            } else {
                wait(3000);
                delay("congrats you defeated " + troll.getName()+ "\nThe heroes must flee before sun up as the events will get fowarded fast.\nthey followed the map from the troll to the next challenge. ",20);
            }
            wait(5000);
            delay("you continiue story",20);

            delay("continue to village",20);
            wait(5000);
            delay("side quest",20);

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
                delay("game over you lost",20);
                gameover = 1;
            } else {
                wait(5000);
                delay("congrats you defeated " + orc.getName(), 20);
            }
            delay("you continiue story",20);
            wait(5000);
            delay("continue to cave",20);
            myhero.fight(dragon);
            if (myhero.getHealth() <= 0) {
                delay("game over you lost",20);
                gameover = 1;
            } else {
                delay("congrats you defeated " + dragon.getName(),20);
                delay("you won the game :)",20);
            }
            //System.out.println("you won the game :)");

            gameover = 1;
        }
        delay("game is done",50);
    }catch(Exception e){
        System.out.println("error");
    }
}
}

