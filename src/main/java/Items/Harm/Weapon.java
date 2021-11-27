package Items.Harm;

import java.util.Random;

public class Weapon implements IWeapon{

        private String weaponType;
        private String material;
        private int damageCount;

//        damageCount is the base level from which calculateDamage is calculated:
        public Weapon(String weaponType, String material, int damageCount) {
            this.weaponType = weaponType;
            this.material = material;
            this.damageCount = damageCount;
        }

        public String getWeaponType(){ return this.weaponType;}

        public String getMaterial() {
            return this.material;
        }

        public int getDamageCount() {
            return this.damageCount;
    }

//    Total damage point, using damageCount * random number between 1 and 12:
        public int rolledDamage() {
            Random rand = new Random();
            return this.damageCount * rand.nextInt(12);
        }

    }

