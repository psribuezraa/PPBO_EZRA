import java.util.ArrayList;
public class Player extends Char {
    private String name;

    public Player(int level, int hp, String name) {
        super(level, hp);
        this.name = name;
    }

    public String getname() {
        return name;
    }

    void entityInfo() {
        System.out.println("# PLAYER DENGAN NAMA : " + getname() + "," + " DAN Level : " + getlevel());
    }

    void interact(Merchant merchant) {
        ArrayList<String> listItem = merchant.getListItem();
        if(merchant.gethp() > 0){
            System.out.println("Merchant :");
            System.out.println("Barang yang tersedia hari ini");
            for (String item : listItem) {
                System.out.println("# " + item);
            }
        }else if(merchant.gethp() == 0 && gethp() > 0){
            System.out.println("Merchant : Dah lah males jualan");
            System.out.println("# TIDAK BISA BELI, MERCHANT NGAMBEK");
        } else if (gethp() <= 0 ) {
            System.out.println("# PLAYER SUDAH MATI");
        }
    }

    void attack(Merchant merchant) {
        if (merchant.gethp() > 0 && gethp() > 0) {
            merchant.sethp(merchant.gethp() - 10);
            System.out.println("merchant : hey heyy, ngapain nyerang");
        }else if(merchant.gethp() == 0 && gethp() > 0){
            System.out.println("Merchant : Dah lah males jualan");
            System.out.println("# TIDAK BISA BELI, MERCHANT NGAMBEK");
        }
    }

    void attack(Zombie zombie){
        if (zombie.gethp() > 0) {
            zombie.sethp(zombie.gethp() - 10);
            System.out.println("zombie : GRAAA!");
        } else if (gethp() <= 0) {
            System.out.println("# PLAYER SUDAH MATI");
        }

    }
}
