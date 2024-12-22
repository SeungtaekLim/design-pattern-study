public class Warrior implements Character {
    private Weapon weapon;

    public Warrior(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void attack() {
        System.out.println("전사가 공격합니다: " + weapon.use());
    }
}
