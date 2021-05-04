import java.util.List;
import java.util.Scanner;
public class hero {
    public List hero(){
        Scanner sc= new Scanner(System.in);
        List list = new List[];


        String type = "j";
        int health = 0;
        int Attack1 = 0;
        int Attack2 = 0;
        int Attack3 = 0;



        int choose= sc.nextInt(); //choose variable is int
        switch(choose){
            case 1:
                type = "knight";
                health = 100;
                Attack1 = 10;
                Attack2 = 25;
                Attack3 = 50;
                break;
            case 2:
                type = "wizard";
                health = 75;
                Attack1 = 15;
                Attack2 = 30;
                Attack3 = 60;
                break;
            case 3:
                type = "big boi";
                health = 150;
                Attack1 = 5;
                Attack2 = 20;
                Attack3 = 40;
                break;
        }
        list.add(type, health, Attack1, Attack2, Attack3); //[type, health, Attack1, Attack2, Attack3]
        return list;
    }

}
