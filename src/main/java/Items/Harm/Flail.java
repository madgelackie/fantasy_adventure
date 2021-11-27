package Items.Harm;

public class Flail implements IDamager{
    private int weight;
    private int damageCount;

    public Flail(int weight, int damageCount){
        this.weight = weight;
        this.damageCount = damageCount;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int getDamageCount() {
        return damageCount;
    }
}
