import java.util.ArrayList;
public class Merchant extends Char{
    private ArrayList<String> listItem;

    public Merchant(int level, int hp, ArrayList<String> listItem ){
        super(level, hp);
        this.listItem = listItem;
    }

    public ArrayList<String> getListItem() {
        return listItem;
    }

    public void entityInfo(){
        System.out.println("# MERCHANT DENGAN Level : " + getlevel());
    }

}