package Items.Harm;

public class LightningStrikeSpell implements IDamager, ISpell {
    private int damageCount;

    public LightningStrikeSpell(int damageCount) {
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
