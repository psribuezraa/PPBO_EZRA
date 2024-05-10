public class Zombie extends Char {
    enum types {
        MELEE, RANGED
    }

    private types type;

    public Zombie(int level, int hp, types type) {
        super(level, hp);
        this.type = type;
    }


    void entityInfo(){
        System.out.println("# ZOMBIE DENGAN TIPE : " + type + "," + " DAN Level : " + getlevel());
    }

    public void attack(Player player) {
        if (type == types.MELEE) {
            if (gethp() == 0) {
                System.out.println("# ZOMBIE MATI");
                System.out.println("# ZOMBIE SUDAH MATI");
            } else if (player.gethp() > 0) {
                player.sethp(player.gethp() - 10);
                System.out.println("player : UGHH");
            } else if (player.gethp() <= 0) {
                player.sethp(player.gethp() - 10);
                System.out.println("player : UGHH");
                System.out.println("# YOU DIE, GAME OVER");
            }
        } else if (type == types.RANGED) {
            if (gethp() == 0) {
                System.out.println("# ZOMBIE MATI");
                System.out.println("# ZOMBIE SUDAH MATI");
            } else if (player.gethp() > 5) {
                player.sethp(player.gethp() - 15);
                System.out.println("player : UGHH");
            } else if (player.gethp() <= 5) {
                player.sethp(player.gethp() - 15);
                System.out.println("player : UGHH");
                System.out.println("# YOU DIE, GAME OVER");
            }
        }
    }
}