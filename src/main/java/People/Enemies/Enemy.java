package People.Enemies;

import Behaviours.IWeapon;
import People.GameCharacter;

public class Enemy extends GameCharacter implements IWeapon {

    private IWeapon weapon;

    public Enemy(int healthPoints, IWeapon weapon) {
        super(healthPoints);
    }

    public IWeapon getWeaponType() {
        return weapon;
    }

    public void receiveDamage(int damageCount){
        healthPoints -= damageCount;
    }


}
