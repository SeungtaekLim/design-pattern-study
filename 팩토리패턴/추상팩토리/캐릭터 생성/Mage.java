public class Mage implements Character {
    private Weapon weapon;

    public Mage(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void attack() {
        System.out.println("마법사가 공격합니다: " + weapon.use());
    }
}
