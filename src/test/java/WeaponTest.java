import Items.Harm.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Axe axe;

    @Before
    public void setUp() {
        axe = new Axe("large", 10);
    }

    @Test
    public void checkSize(){
        assertEquals("large", axe.getAxeHeadSize());
    }

    @Test
    public void getDamageCount(){
        assertEquals(10, axe.getDamageCount());
    }
}