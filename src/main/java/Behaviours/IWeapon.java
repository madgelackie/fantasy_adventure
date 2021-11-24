package Behaviours;

import People.GameCharacter;
import People.Players.Player;

public interface IWeapon {

    IWeapon getWeaponType();

    void causeDamage(GameCharacter gameCharacter);

}
