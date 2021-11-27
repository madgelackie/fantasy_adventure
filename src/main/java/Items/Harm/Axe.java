package Items.Harm;

public class Axe implements IDamager{
    private String axeHeadSize;
    private int damageCount;

    public Axe(String axeHeadSize, int damageCount) {
        this.axeHeadSize = axeHeadSize;
        this.damageCount = damageCount;
    }

    public String getAxeHeadSize() {
        return axeHeadSize;
    }

    @Override
    public int getDamageCount() {
        return damageCount;
    }
}
