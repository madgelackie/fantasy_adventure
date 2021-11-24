package People;

public class Enemy extends GameCharacter  {

    private EnemyType enemyType;

    public Enemy(int healthPoints, EnemyType enemyType) {
        super(healthPoints);
        this.enemyType = enemyType;
    }

    public EnemyType getEnemyType() {
        return enemyType;
    }
}
