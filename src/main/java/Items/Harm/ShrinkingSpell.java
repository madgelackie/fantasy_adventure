package Items.Harm;

public class ShrinkingSpell implements IDamager, ISpell {
    private int damageCount;

    public ShrinkingSpell(int damageCount) {
        this.damageCount = damageCount;
    }

    @Override
    public int getDamageCount() {
        return damageCount;
    }

    @Override
    public boolean isSpell() {
        return true;
    }
}
