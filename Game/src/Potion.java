public class Potion extends Item {
    private int duration;
    private int effectPoint;
    private String type;

    public Potion(String name, int rank, int price, int duration, int effectPoint, String type) {
        super(name, rank, price);
        this.duration = duration;
        this.effectPoint = effectPoint;
        this.type = type;
    }

    @Override
    public String use() {
        if (type.equalsIgnoreCase("Attack")) {
            return "Damage dealt by " + effectPoint;
        } else if (type.equalsIgnoreCase("Heal")) {
            return "Healed by " + effectPoint;
        } else {
            return "Invalid potion type";
        }
    }

    public int getDuration() {
        return duration;
    }

    public int getEffectPoint() {
        return effectPoint;
    }

    public String getType() {
        return type;
    }

    @Override
    public void display() {
        System.out.println("Potion: " + name);
        System.out.println("Rank: " + rank);
        System.out.println("Price: " + price);
        System.out.println("Duration: " + duration);
        System.out.println("Effect Point: " + effectPoint);
        System.out.println("Type: " + type);
    }
}