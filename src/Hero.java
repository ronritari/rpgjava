import java.util.List;
import java.util.Scanner;
import java.util.Random;
public class Hero {
    Random r= new Random();
    Scanner sc = new Scanner(System.in);
    Enemy enemy;
    private String name;
    private double health, Attack1, Attack2, Attack3;

    public Hero(String n, double h, double a1, double a2, double a3){
        this.name=n;
        this.health=h;
        this.Attack1=a1;
        this.Attack2=a2;
        this.Attack3=a3;

    }

    public String getName(){
        return name;
    }

    public double getHealth(){
        return health;
    }

    public double getA1(){
        return Attack1;
    }

    public double getA2(){
        return Attack2;
    }

    public double getA3(){
        return Attack3;
    }

    public void setName(String setName){
        this.name = setName;
    }

    public void setHealth(double setHealth){
        this.health = setHealth;
    }

    public void setAttack1 (double setA1){
        this.Attack1 = setA1;
    }

    public void setAttack2(double setA2){
        this.Attack2 = setA2;
    }

    public void setAttack3(double setA3){
        this.Attack3 = setA3;
    }

    public void getStats(){
        System.out.println("name: "+getName()+". health: "+getHealth()+". attack1: "+getA1()+". Attac2: "+getA2()+". Attack3: "+getA3());
     }

     public void fight(Enemy e){

         while(this.health>0 && e.getHealth()>0){
             System.out.println("choose an attack: 1 for light attack odds of enemy blocking is 1/10 \n2 for medium attack odds for blocking is 1/5\n3 for strong attack odds for blocking is 1/3");
             int x= sc.nextInt();
             switch (x){
                 case 1:
                     int r= r.nextInt();
                     getA1();
                     break;
                 case 2:
                     getA2();
                     break;
                 case 3:
                     getA3();
                     break;
             }
         }

     }

    }


