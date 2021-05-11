import java.util.List;
import java.util.Scanner;
import java.util.Random;
public class Hero {
    Random r = new Random();
    Scanner sc = new Scanner(System.in);
    Enemy enemy;
    private String name;
    private double health, Attack1, Attack2, Attack3, Attack4;

    public Hero(String n, double h, double a1, double a2, double a3, double a4) {
        this.name = n;
        this.health = h;
        this.Attack1 = a1;
        this.Attack2 = a2;
        this.Attack3 = a3;
        this.Attack4 = a4;

    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public double getA1() {
        return Attack1;
    }

    public double getA2() {
        return Attack2;
    }

    public double getA3() {
        return Attack3;
    }

    public double getA4() {
        return Attack4;
    }

    public void setName(String setName) {
        this.name = setName;
    }

    public void setHealth(double setHealth) {
        this.health = setHealth;
    }

    public void setAttack1(double setA1) {
        this.Attack1 = setA1;
    }

    public void setAttack2(double setA2) {
        this.Attack2 = setA2;
    }

    public void setAttack3(double setA3) {
        this.Attack3 = setA3;
    }

    public void setA4(double setA4) {
        this.Attack4 = setA4;
    }

    public void getStats() {
        System.out.println("name: " + getName() + ". health: " + getHealth() + ". attack1: " + getA1() + ". Attac2: " + getA2() + ". Attack3: " + getA3());
    }
//public synchronized void start()throws InterruptedException
    public synchronized void fight(Enemy e)throws InterruptedException {
        try {

            while (this.health > 0 && e.getHealth() > 0) {
                if (getA4() > 10) {
                    System.out.println("choose an attack: \n1 for light attack " + getA1() + " odds of enemy blocking is 1/10 \n2 for medium attack " + getA2() + " odds for blocking is 1/5\n3 for strong attack " + getA3() + "  odds for blocking is 1/3\n4 For special attack " + getA4() + " odds of blocking 1/2");
                } else {
                    System.out.println("choose an attack: \n1 for light attack odds of enemy blocking is 1/10 \n2 for medium attack odds for blocking is 1/5\n3 for strong attack odds for blocking is 1/3");
                }
                //System.out.println("choose an attack: \n1 for light attack odds of enemy blocking is 1/10 \n2 for medium attack odds for blocking is 1/5\n3 for strong attack odds for blocking is 1/3");
                int x = sc.nextInt();
                switch (x) {
                    case 1:
                        int R1 = r.nextInt(10) + 1;
                        if (R1 == 10) {
                            System.out.println("your attack was blocked");
                        } else {
                            System.out.println("you did " + getA1() + " amount of damage");
                            e.setHealth(e.getHealth() - getA1());
                            System.out.println("enemys health is " + e.getHealth());
                        }
                        break;
                    case 2:
                        int R2 = r.nextInt(5) + 1;
                        if (R2 == 5) {
                            System.out.println("your attack was blocked");
                        } else {
                            System.out.println("you did " + getA2() + " amount of damage");
                            e.setHealth(e.getHealth() - getA2());
                            System.out.println("enemys health is" + e.getHealth());
                        }
                        break;
                    case 3:
                        int R3 = r.nextInt(3) + 1;
                        if (R3 == 3) {
                            System.out.println("enemy chose " + R3);
                            System.out.println("your attack was blocked");
                        } else {
                            System.out.println("enemy chose " + R3 + " your attack was not blocked");
                            System.out.println("you did " + getA3() + " amount of damage");
                            e.setHealth(e.getHealth() - getA3());
                            System.out.println("enemys health is" + e.getHealth());
                        }
                        break;
                    case 4:
                        int R4 = r.nextInt(2) + 1;
                        if (R4 == 2) {
                            System.out.println("your attack was blocked");
                        } else {
                            System.out.println("you did " + getA4() + " amount of damage");
                            e.setHealth(e.getHealth() - getA4());
                            System.out.println("enemys health is " + e.getHealth());
                        }
                        break;

                }

                if (e.getHealth() <= 0) {
                    break;
                }

                System.out.println("now the enemy attacks. you have a chance 1 out of 4 to block. \n choose wisely a number between 1 and 4");
                int block = sc.nextInt();
                int ER1 = r.nextInt(4) + 1;
                if (ER1 == block) {
                    System.out.println("you chose " + block + " and enemy chose " + ER1);
                    System.out.println("you've blocked the attack");
                } else {
                    System.out.println("you chose " + block + " and enemy chose " + ER1);
                    System.out.println(e.getName() + " made a hit. you lost " + e.geta1() + " amount of health");
                    setHealth(getHealth() - e.geta1());
                }

                System.out.println("your remaining health is " + getHealth() + "\nEnemy has " + e.getHealth() + " remaining");

            }

        } catch (Exception ex) {
            System.out.println("error");
        }
    }

    }