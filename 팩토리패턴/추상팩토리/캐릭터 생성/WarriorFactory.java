public class WarriorFactory implements CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Warrior(new Sword());
    }

    @Override
    public Weapon createWeapon() {
        return new Sword();
    }
}
