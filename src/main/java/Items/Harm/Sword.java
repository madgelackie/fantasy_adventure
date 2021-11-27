package Items.Harm;

public class Sword implements IDamager{

    private String material;
    private int damageCount;

    public Sword(String material, int damageCount) {
        this.material = material;
        this.damageCount = damageCount;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public int getDamageCount() {
        return damageCount;
    }
}
