package People;

public enum EnemyType {

    TROLL(5),
    ORC(7),
    OGRE(10);

    private final int damageDealt;

    EnemyType(int damageDealt) {
        this.damageDealt = damageDealt;
    }

    public int getDamageDealt() {
        return damageDealt;
    }
}
