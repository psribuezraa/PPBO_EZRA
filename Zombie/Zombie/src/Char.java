public class Char{
    private int level;
    private int hp;

    public Char(int level, int hp){
        this.level = level;
        this.hp = hp;
    }

    public int getlevel(){
        return level;
    }

    public int gethp(){
        return hp;
    }

    public void sethp(int hp) {
        this.hp = hp;
    }
}