import java.util.List;
import java.util.Scanner;
public class Hero {

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

    /*public static void pickHero(int x){

        switch(x){
            case 0:
                int health = 100;
                int Attack1 = 10;
                int Attack2 = 25;
                int Attack3 = 50;
                break;
            case 1:
                health = 75;
                Attack1 = 15;
                Attack2 = 30;
                Attack3 = 60;
                break;
            case 2:
                health = 150;
                Attack1 = 5;
                Attack2 = 20;
                Attack3 = 40;
                break;
        }*/
        //list.add(type, health, Attack1, Attack2, Attack3); //[type, health, Attack1, Attack2, Attack3]
       // return; //list;
    }


