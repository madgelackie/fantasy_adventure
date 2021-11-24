package Items.Weapons;

import Behaviours.IWeapon;
import People.GameCharacter;
import People.Players.Player;

public class Weapon implements IWeapon {

    private IWeapon weaponType;
    private String material;
    private int damageCount;

    public IWeapon getWeaponType () {
        return weaponType;
    }

    public String getMaterial() {
        return material;
    }

    public static int getDamageCount() {
        return damageCount;
    }

    public void causeDamage(GameCharacter gameCharacter) {
        gameCharacter.receiveDamage();
    }

}
