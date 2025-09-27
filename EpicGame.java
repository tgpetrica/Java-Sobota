interface Enemy {
    void fight(Hero hero);
    int getLife();
    boolean isAlive();
    String getName();
}

class EnemyFactory {
    public static Enemy get(String type) {
        if (type == null) return null;
        switch(type) {
            case "small":   return new SmallEnemy();
            case "medium":  return new MediumEnemy();
            case "big":     return new BigEnemy();
            default:        throw new IllegalArgumentException("Enemy type not found.");
        }
    }
}

abstract class BaseEnemy implements Enemy {
    protected String name;
    protected int life = 100;
    protected int pointsToGive;
    protected int damage;

    protected BaseEnemy(String name, int pointsToGive, int damage) {
        this.name           = name;
        this.pointsToGive    = pointsToGive;
        this.damage         = damage;
    }

    @Override
    public void fight(Hero hero) {
        if (isAlive()) {
            hero.decreaseLife(damage);
            System.out.printf("%s hits Hero for %d damage. Hero Life=%d%n",
                                name, damage, hero.getLife());
            hero.fight(this);
        } else {
            hero.addPoints(pointsToGive);
            System.out.printf("%s is already defeated. Hero gains %d points. Total=%d%n",
                                name, pointsToGive, hero.getPoints());
        }
    }

    @Override
    public int getLife() {
        return life;
    }

    @Override
    public boolean isAlive() {
        return life > 0;
    }

    @Override
    public String getName() {
        return name;
    }

    public void decreaseLife(int amount) {
        life = Math.max(0, life - Math.max(0, amount));
    }

}

class SmallEnemy extends BaseEnemy {
    public SmallEnemy() {
        super("SmallEnemy", 10, 5);
    }
}

class MediumEnemy extends BaseEnemy {
    public MediumEnemy() {
        super("MediumEnemy", 30, 10);
    }
}

class BigEnemy extends BaseEnemy {
    public BigEnemy() {
        super("BigEnemy", 70, 20);
    }
}

class Hero {
    private int life = 100;
    private int points = 0;
    private final Weapon weapon;

    public Hero(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getLife() {
        return life;
    }

    public boolean isAlive() {
        return life > 0;
    }

    public int getPoints() {
        return points;
    }

    public void decreaseLife(int amount) {
        life = Math.max(0, life - Math.max(0, amount));
        if (life == 0) System.out.println("GAME OVER!");
    }

    public void addPoints(int pts) {
        points += pts;
    }

    public void fight(Enemy enemy) {
        if (isAlive()) {
            if (enemy.isAlive()) {
                int dmg = weapon.getDamage();
                if (enemy instanceof BaseEnemy) {
                    ((BaseEnemy) enemy).decreaseLife(dmg);
                }
                System.out.printf("HERO hits %s for %d dmg. %s life=%d%n",
                                enemy.getName(), dmg, enemy.getName(), enemy.getLife());
                enemy.fight(this);
            } else {
                System.out.printf("%s is already defeated.%n", enemy.getName());
            }
        } else {
            // eroul a murit
            System.out.println("GAME OVER!");
            return;
        }
    }

    public void heal() {
        life = Math.min (100, life + 30);
        System.out.printf("HERO heals. Life=%d%n", life);
    }
}

class WeaponBuilder {
    private int damage = 0;

    public WeaponBuilder addBlade(int dmg) {
        damage += dmg;
        return this;
    }

    public WeaponBuilder addBuff(int dmg) {
        damage += dmg;
        return this;
    }

    public WeaponBuilder addHandle(int dmg) {
        damage += dmg;
        return this;
    }

    public int getDamage(){
        return damage;
    }

    public Weapon build(){
        return new Weapon(this);
    }
}

class Weapon {
    private final int damage;

    Weapon(WeaponBuilder builder) {
        this.damage = builder.getDamage();
    }

    public int getDamage(){
        return damage;
    }
}

public class EpicGame {
    public static void main(String[] args) {
        Weapon w = new WeaponBuilder()
            .addBlade(25)
            .addBuff(10)
            .addHandle(5)
            .build();
        
        Hero hero = new Hero(w);

        Enemy Echo = EnemyFactory.get("small");
        Enemy Kilo = EnemyFactory.get("medium");

        hero.fight(Echo);
        hero.heal();
        hero.fight(Kilo);
    }
}
