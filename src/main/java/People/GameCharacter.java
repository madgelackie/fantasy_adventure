package People;

import Items.Harm.IDamager;

public abstract class GameCharacter {
    
    private int healthPoints;

    public GameCharacter(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void receiveDamage(IDamager damager){
        setHealthPoints(damager.getDamageCount());
    }

}
