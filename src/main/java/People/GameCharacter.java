package People;

import Items.Harm.Weapon;

public abstract class GameCharacter {
    
    protected int healthPoints;

    public GameCharacter(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void receiveDamage(Weapon weapon){
        setHealthPoints(weapon.rolledDamage());
    }

}
