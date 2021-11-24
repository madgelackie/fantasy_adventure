package People;

import Behaviours.IWeapon;
import Items.Weapons.Weapon;

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

    public abstract void receiveDamage(IWeapon weaponType){
        healthPoints -= Weapon.getDamageCount();
    };
}
