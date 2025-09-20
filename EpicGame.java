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

public class EpicGame {
    public static void main(String[] args) {
        
    }
}
