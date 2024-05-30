abstract class Item {
    protected String name;
    protected int rank;
    protected int price;

    public Item(String name, int rank, int price) {
        this.name = name;
        this.rank = rank;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public int getPrice() {
        return price;
    }

    public abstract String use();

    public abstract void display();
}