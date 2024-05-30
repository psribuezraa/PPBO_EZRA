public class Sword extends Item {
    private int damage;

    public Sword(String name, int rank, int price, int damage) {
        super(name, rank, price);
        this.damage = damage;
    }

    @Override
    public String use() {
        return "Damage dealt by " + damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void display() {
        System.out.println("Sword: " + name);
        System.out.println("Rank: " + rank);
        System.out.println("Price: " + price);
        System.out.println("Damage: " + damage);
    }
}