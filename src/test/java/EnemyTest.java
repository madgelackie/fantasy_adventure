import People.Enemy;
import People.EnemyType;
import org.junit.Before;
import org.junit.Test;

import static People.EnemyType.TROLL;
import static org.junit.Assert.assertEquals;

public class EnemyTest {

    private Enemy enemy;

    @Before
    public void setUp(){
        enemy = new Enemy(50, TROLL);
    }

    @Test
    public void viewEnemyType(){
        assertEquals(TROLL, enemy.getEnemyType());
    }

    @Test
    public void viewEnergyDamage(){
        assertEquals(5, enemy.getEnemyType().getDamageDealt());
    }



}
