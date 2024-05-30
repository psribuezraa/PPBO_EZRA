public class Main {
    public static void main(String[] args) {
        Potion attackPotion = new Potion("Attack Potion", 1, 50, 30, 20, "Attack");
        Potion healPotion = new Potion("Heal Potion", 1, 50, 30, 20, "Heal");
        Sword sword = new Sword("Excalibur", 5, 300, 100);
        Shield shield = new Shield("Dragon Shield", 5, 250, 75);

        attackPotion.display();
        System.out.println("--------------------------------------------------");
        healPotion.display();
        System.out.println("--------------------------------------------------");
        sword.display();
        System.out.println("--------------------------------------------------");
        shield.display();
        System.out.println("--------------------------------------------------");
        System.out.println(attackPotion.use());
        System.out.println(healPotion.use());
        System.out.println(sword.use());
        System.out.println(shield.use());
        System.out.println("--------------------------------------------------");
    }
}