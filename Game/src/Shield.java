public class Shield extends Item {
    private int damageBlock;

    public Shield(String name, int rank, int price, int damageBlock) {
        super(name, rank, price);
        this.damageBlock = damageBlock;
    }

    @Override
    public String use() {
        return "Damage mitigated by " + damageBlock;
    }

    public int getDamageBlock() {
        return damageBlock;
    }

    @Override
    public void display() {
        System.out.println("Shield: " + name);
        System.out.println("Rank: " + rank);
        System.out.println("Price: " + price);
        System.out.println("Damage Block: " + damageBlock);
    }
}