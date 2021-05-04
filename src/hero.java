import java.util.Scanner;
public class hero {
    Scanner sc= new Scanner(System.in);

String type= sc.nextLine();
switch(type){
        case "knight":
            int Health = 100;
            int Attack1 = 10;
            int Attack2 = 25;
            int Attack3 = 50;
            break;
        case "wizard":
            int health = 75;
            int Attack1 = 15;
            int Attack2 = 30;
            int Attack3 = 60;
            break;
        case "Big boi":
            int health = 150;
            int Attack1 = 5;
            int Attack2 = 20;
            int Attack3 = 40;
            break;
    }
    Hero hero = new hero[Type, Health, Attack1, Attack2, Attack3];
return hero;
}
